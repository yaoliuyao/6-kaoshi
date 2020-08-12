package org.nf.sms.dao;

import org.nf.sms.entity.Student;
import org.nf.sms.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> queryAll () throws Exception {
        List<Student> students = new ArrayList<>();

        String sql = "select * from student_info";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                students.add(
                  new Student(
                          rs.getString(1),
                          rs.getString(2),
                          rs.getInt(3),
                          rs.getString(4),
                          rs.getFloat(5),
                          rs.getDate(6))
                );
            }
        }
        return students;
    }

    public List<Student> queryByLike (String cond) throws Exception {
        List<Student> students = new ArrayList<>();

        String sql = "select * from student_info where stuname like ? or stuno like ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + cond + "%");
            ps.setString(2, "%" + cond + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    students.add(
                            new Student(
                                    rs.getString(1),
                                    rs.getString(2),
                                    rs.getInt(3),
                                    rs.getString(4),
                                    rs.getFloat(5),
                                    rs.getDate(6))
                    );
                }
            }
        }
        return students;
    }

    public int del(String no) throws Exception {
        String sql = "delete from student_info where stuno = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, no);
            return ps.executeUpdate();
        }
    }
}
