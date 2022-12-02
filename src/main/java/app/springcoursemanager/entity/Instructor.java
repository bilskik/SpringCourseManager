package app.springcoursemanager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
    @Id
    @SequenceGenerator(
            name = "instuctor_sequence",
            sequenceName = "instructor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "instructor_sequence"
    )
    private Long instructorId;
    private String name;
    @OneToMany(mappedBy = "instructor")
    private List<Course> courseList;

    public void addCourse(Course course) {
        if(courseList == null) {
            courseList = new ArrayList<>();
        }
        courseList.add(course);
    }

}
