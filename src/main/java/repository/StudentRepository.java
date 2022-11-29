package repository;

import entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findStudentByName(String name);
    List<Student> findStudentBySurename(String name);
}
