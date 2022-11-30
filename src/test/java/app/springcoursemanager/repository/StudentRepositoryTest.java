package app.springcoursemanager.repository;

import app.springcoursemanager.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;


@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void findStudentByName() {
        Optional<Student> studentOptional = studentRepository.findStudentByName("Kamil");
        System.out.println("studentOptional = " + studentOptional);
        assert studentOptional.isPresent();
    }
    @Test
    public void findStudentBySurename() {
        List<Student> studentList = studentRepository.findStudentBySurename("Kamil");
        System.out.println("studentList = " + studentList);
        assert studentList != null;
    }
    @Test
    public void findByName() {
        Optional<Student> studentOptional = studentRepository.findByName("Kamil");
        System.out.println("studentOptional = " + studentOptional);
        assert studentOptional.isPresent();
    }
    @Test
    public void getStudentByName() {
        Optional<Student> studentOptional = studentRepository.getStudentByName("Kamil");
        System.out.println("studentOptional = " + studentOptional);
        assert studentOptional.isPresent();
    }
    @Test
    public void getEqualsFind() {
        Optional<Student> studentOptional1 = studentRepository.getStudentByName("Kamil");
        Optional<Student> studentOptional2 = studentRepository.findByName("Kamil");
        assert studentOptional1.equals(studentOptional2);
    }
    @Test
    public void getMyOwnStudent() {
        Optional<Student> studentOptional = studentRepository.getMyOwnStudent("Kamil");
        System.out.println("studentOptional = " + studentOptional);
        assert studentOptional.isPresent();
    }
    @Test
    public void findMyOwnSeatBySeatPosition() {
        List<Student> studentList = studentRepository.findMyOwnSeatBySeatPosition("siedzenie");
        System.out.println("studentList = " + studentList);
        assert true;
    }
    @Test
    public void findAllStudents() {
        List<Student> studentList = studentRepository.findAllStudents();
        System.out.println("studentList = " + studentList);
        assert true;
    }
}