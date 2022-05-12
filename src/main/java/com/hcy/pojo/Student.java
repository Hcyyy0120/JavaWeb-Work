package com.hcy.pojo;

public class Student {
    private Integer account;
    private String name;
    private String major;
    private String classId;
    
    public Student() {
    }
    
    public Student(Integer account, String name, String major, String classId) {
        this.account = account;
        this.name = name;
        this.major = major;
        this.classId = classId;
    }
    
    public Integer getAccount() {
        return account;
    }
    
    public void setAccount(Integer account) {
        this.account = account;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getClassId() {
        return classId;
    }
    
    public void setClassId(String classId) {
        this.classId = classId;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "account=" + account +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }
}
