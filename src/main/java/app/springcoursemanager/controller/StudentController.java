package app.springcoursemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import app.springcoursemanager.repository.StudentRepository;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

}
