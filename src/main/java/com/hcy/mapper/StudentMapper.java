package com.hcy.mapper;

import com.hcy.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    
    /**
     * 查询所有学生
     * @return
     */
    @Select("select * from student")
    List<Student> selectAll();
    
    /**
     * 按不同条件查询
     * @param student
     * @return
     */
    List<Student> selectByCondition(Student student);
    
    /**
     * 添加学生信息
     * @param student
     */
    @Insert("insert into student values(null,#{name},#{major},#{classId})")
    void add(Student student);
    
    /**
     * 删除
     * @param account
     */
    @Delete("delete from student where account = #{account}")
    void deleteStuByAccount(Integer account);
    
    /**
     * 改
     * @param student
     */
    @Update("update student set name=#{name},major=#{major},classId=#{classId} where account = #{account}")
    void updateStu(Student student);
}
