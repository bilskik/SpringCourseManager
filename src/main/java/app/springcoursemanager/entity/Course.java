package app.springcoursemanager.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.jmx.export.annotation.ManagedNotifications;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_generator",
            sequenceName = "course_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_generator"
    )
    private Long courseId;
    private String courseName;
    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "student_course_map",
            joinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "courseId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "studentId"
            )
    )
    private List<Student> studentList;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "instructor_id",
            referencedColumnName = "instructorId"
    )
    private Instructor instructor;

    @OneToMany(mappedBy = "course")
    private List<Klasa> klasaList;

    public void addStudents(Student student) {
        if(studentList == null) {
            studentList = new ArrayList<Student>();
        }
        studentList.add(student);
    }
    public void addKlasa(Klasa klasa) {
        if(klasaList == null) {
            klasaList = new ArrayList<>();
        }
        klasaList.add(klasa);
    }
}
