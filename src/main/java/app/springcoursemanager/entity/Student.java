package app.springcoursemanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(
            name ="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;
    private String name;
    private String surename;
    @Embedded
    private Seat seat;
    /*
    @OneToOne(
            mappedBy = "student"
    )
    private  Notebook notebook;

     */
}
