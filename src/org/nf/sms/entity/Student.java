package org.nf.sms.entity;

import java.util.Date;

public class Student {
    private String no;
    private String name;
    private int age;
    private String sex;
    private float score;
    private Date regTime;

    // alt+insert

    public Student() {
    }

    public Student(String no, String name, int age, String sex, float score, Date regTime) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
        this.regTime = regTime;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}
