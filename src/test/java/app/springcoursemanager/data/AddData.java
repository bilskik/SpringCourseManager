package app.springcoursemanager.data;

import app.springcoursemanager.entity.*;
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
    /*
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

     */
    @Test
    public void addStudentsWithNotebook() {
        Notebook notebook = Notebook.builder()
                .notebookColor("green")
                .build();
        Seat seat = Seat.builder()
                .seatNumber(1)
                .seatPosition("siedzenie")
                .build();
        Instructor instructor1 = Instructor.builder()
                .name("Jaro Wilk")
                .build();
        Instructor instructor2 = Instructor.builder()
                .name("Jstar")
                .build();
        Klasa klasa1 = Klasa.builder()
                .numer_klasy("B1")
                .build();
        Klasa klasa2 = Klasa.builder()
                .numer_klasy("B2")
                .build();
        Klasa klasa3 = Klasa.builder()
                .numer_klasy("A1")
                .build();
        Klasa klasa4 = Klasa.builder()
                .numer_klasy("A2")
                .build();
        Course course1 = Course.builder()
                .courseName("Python")
                .instructor(instructor1)
                .klasaList(Arrays.asList(klasa1,klasa2))
                .build();
        Course course2 = Course.builder()
                .courseName("Java")
                .instructor(instructor2)
                .klasaList(Arrays.asList(klasa3,klasa4))
                .build();
        Student student1 = Student.builder()
                .name("Kamil")
                .surename("Bilski")
                .seat(seat)
                .notebook(notebook)
                .build();
        student1.addCourse(course1);
        student1.addCourse(course2);
        studentRepository.save(student1);
    }
    @Test
    public void addNext() {
        Notebook notebook1 = Notebook.builder()
                .notebookColor("blue")
                .build();
        Seat seat1 = Seat.builder()
                .seatNumber(2)
                .seatPosition("siedzenie")
                .build();
        Instructor instructor1 = Instructor.builder()
                .name("Jaro Szos")
                .build();
        Instructor instructor2 = Instructor.builder()
                .name("Zuzi Krawcz")
                .build();
        Klasa klasa1 = Klasa.builder()
                .numer_klasy("C1")
                .build();
        Klasa klasa2 = Klasa.builder()
                .numer_klasy("C2")
                .build();
        Klasa klasa3 = Klasa.builder()
                .numer_klasy("D1")
                .build();
        Klasa klasa4 = Klasa.builder()
                .numer_klasy("D2")
                .build();
        Course course1 = Course.builder()
                .courseName("C")
                .instructor(instructor1)
                .build();
//        course1.addKlasa(klasa1);
//        course1.addKlasa(klasa2);

        Course course2 = Course.builder()
                .courseName("Scala")
                .instructor(instructor2)
                .build();
//        course2.addKlasa(klasa3);
//        course2.addKlasa(klasa4);
        klasa1.setCourse(course1);
        klasa2.setCourse(course1);
        klasa3.setCourse(course2);
        klasa4.setCourse(course2);

        Student student2 = Student.builder()
                .name("Jan")
                .surename("Kowalski")
                .courseList(Arrays.asList(course1,course2))
                .seat(seat1)
                .notebook(notebook1)
                .build();
        studentRepository.save(student2);
    }
    @Test
    public void addNextOne() {
        Notebook notebook2 = Notebook.builder()
                .notebookColor("yellow")
                .build();
        Seat seat2 = Seat.builder()
                .seatNumber(3)
                .seatPosition("siedzenie")
                .build();
        Instructor instructor1 = Instructor.builder()
                .name("Adam Milcz")
                .build();
        Instructor instructor2 = Instructor.builder()
                .name("Robert Wozniak")
                .build();
        Klasa klasa1 = Klasa.builder()
                .numer_klasy("E11")
                .build();
        Klasa klasa2 = Klasa.builder()
                .numer_klasy("E12")
                .build();
        Klasa klasa3 = Klasa.builder()
                .numer_klasy("F1")
                .build();
        Klasa klasa4 = Klasa.builder()
                .numer_klasy("F82")
                .build();
        Course course1 = Course.builder()
                .courseName("C++")
                .instructor(instructor1)
                .klasaList(Arrays.asList(klasa1,klasa2))
                .build();
        Course course2 = Course.builder()
                .courseName("Java Script")
                .instructor(instructor2)
                .klasaList(Arrays.asList(klasa3,klasa4))
                .build();
        Student student3 = Student.builder()
                .name("Mariusz")
                .surename("Nowak")
                .courseList(Arrays.asList(course1,course2))
                .seat(seat2)
                .notebook(notebook2)
                .build();
        studentRepository.save(student3);
    }

}
