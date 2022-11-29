package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
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
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "studentId"
    )
    private Student student;
}
