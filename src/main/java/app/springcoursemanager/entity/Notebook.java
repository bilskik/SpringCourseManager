package app.springcoursemanager.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notebook {
    @Id
    @SequenceGenerator(
            name = "notebook_sequence",
            sequenceName = "notebook_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notebook_sequence"
    )
    private Long notebookId;
    private String notebookColor;

    @OneToOne(
            mappedBy = "notebook"
    )
    private Student student;
}
