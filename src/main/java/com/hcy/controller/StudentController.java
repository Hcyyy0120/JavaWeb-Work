package com.hcy.controller;

import com.hcy.pojo.Student;
import com.hcy.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
* 在类的开头忘记添加@RestController注解，此时该Controller类中会返回ModelView对象；
* 若添加了该注解，则会将返回值以某种特定形式写入response的body中，同时ModelView对象为null。
* 如果你忘记添加该注解，同时返回了一个对象或字符串，SpringMVC会将其默认封装到一个ModelView对象中，
* 并将你的请求映射地址作为该对象的默认对象名，从而产生异常。
  
  事实是并不知道要加这个注解
* */
@CrossOrigin//在服务器端支持跨域访问,因为Vue框架也会占用一个端口
@RestController
public class StudentController {
    
    @Autowired
    IStudentService service;
    
    @RequestMapping("/selectAll")
    public List<Student> selectAll() {
        return service.selectAll();
    }
    
    @RequestMapping("/add")
    public void add(@RequestBody Student student) {
        service.add(student);
    }
    
    @RequestMapping("/deleteStuByAccount")
    public void deleteStuByAccount(@RequestBody Student student) {
        service.deleteStuByAccount(student.getAccount());
    }
    
    @RequestMapping("/selectByCondition")
    public List<Student> selectByCondition(@RequestBody Student student) {
        return service.selectByCondition(student);
    }
    
    @RequestMapping("/updateStu")
    public void updateStu(@RequestBody Student student) {
        service.updateStu(student);
    }
}
