package org.nf.sms.action;

import org.nf.sms.dao.StudentDao;
import org.nf.sms.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/like")
public class QueryStudentByLikeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cond = req.getParameter("cond");
        try {
            List<Student> students = new StudentDao().queryByLike(cond);
            req.setAttribute("students", students);
            req.getRequestDispatcher("/list.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
