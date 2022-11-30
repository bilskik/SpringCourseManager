package app.springcoursemanager;

import app.springcoursemanager.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCourseManagerApplicationTests {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    void contextLoads() {
    }

}
