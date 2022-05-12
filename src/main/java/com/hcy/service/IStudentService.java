package com.hcy.service;

import com.hcy.pojo.Student;

import java.util.List;

public interface IStudentService {
    
    /**
     * 查询所有学生
     * @return
     */
    List<Student> selectAll();
    
    /**
     * 添加学生信息
     * @param student
     */
    void add(Student student);
    
    /**
     * 删除
     * @param account
     */
    void deleteStuByAccount(Integer account);
    
    /**
     * 条件查询
     * @param student
     * @return
     */
    List<Student> selectByCondition(Student student);
    
    /**
     * 修改信息
     * @param student
     */
    void updateStu(Student student);
    
}
