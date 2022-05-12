import com.hcy.pojo.Student;
import com.hcy.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml"
        , "classpath:applicationContext_service.xml"})
public class MyTest {
    
    @Autowired
    IStudentService service;
    
    @Test
    public void selectAll() {
        List<Student> students = service.selectAll();
        System.out.println(students);
    }
    @Test
    public void add() {
        service.add(new Student(null,"god","CS","9"));
    }
    @Test
    public void deleteStuByAccount() {
        List<Student> students = service.selectAll();
        System.out.println(students);
    }
    @Test
    public void selectByCondition() {
        List<Student> students = service.selectAll();
        System.out.println(students);
    }    @Test
    public void updateStu() {
        List<Student> students = service.selectAll();
        System.out.println(students);
    }

    
}
