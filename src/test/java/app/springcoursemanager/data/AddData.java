package app.springcoursemanager.data;

import app.springcoursemanager.entity.Notebook;
import app.springcoursemanager.entity.Seat;
import app.springcoursemanager.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import app.springcoursemanager.repository.StudentRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class AddData {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void addSampleData() {
        Notebook notebook = Notebook.builder()
                .notebookColor("green")
                .build();
        Seat seat = Seat.builder()
                .seatNumber(1)
                .seatPosition("siedzenie")
                .build();
        Student student1 = Student.builder()
                .name("Kamil")
                .surename("Bilski")
                .seat(seat)
                .build();

        Notebook notebook1 = Notebook.builder()
                .notebookColor("blue")
                .build();
        Seat seat1 = Seat.builder()
                .seatNumber(2)
                .seatPosition("siedzenie")
                .build();
        Student student2 = Student.builder()
                .name("Jan")
                .surename("Kowalski")
                .seat(seat)
                .build();

        Notebook notebook2 = Notebook.builder()
                .notebookColor("yellow")
                .build();
        Seat seat2 = Seat.builder()
                .seatNumber(3)
                .seatPosition("siedzenie")
                .build();
        Student student3 = Student.builder()
                .name("Mariusz")
                .surename("Nowak")
                .seat(seat)
                .build();
        List<Student> studentList = Arrays.asList(student1,student2,student3);
        studentRepository.saveAll(studentList);
    }

}
