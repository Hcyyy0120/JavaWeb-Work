package com.hcy.service.impl;

import com.hcy.mapper.StudentMapper;
import com.hcy.pojo.Student;
import com.hcy.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    
    @Autowired
    StudentMapper studentMapper;
    
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
    
    public void add(Student student) {
        studentMapper.add(student);
    }
    
    public void deleteStuByAccount(Integer account) {
        studentMapper.deleteStuByAccount(account);
    }
    
    public List<Student> selectByCondition(Student student) {
        return studentMapper.selectByCondition(student);
    }
    
    public void updateStu(Student student) {
        studentMapper.updateStu(student);
    }
}
