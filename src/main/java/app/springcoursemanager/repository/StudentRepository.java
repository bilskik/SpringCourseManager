package app.springcoursemanager.repository;

import app.springcoursemanager.entity.Notebook;
import app.springcoursemanager.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findStudentByName(String name);

    Optional<Student> findByName(String name);
    List<Student> findStudentBySurename(String name);

    Optional<Student> getStudentByName(String name);

    @Query(
            value = "select * from student s where s.name = :name ",
            nativeQuery = true
    )
    Optional<Student> getMyOwnStudent(@Param("name") String name);
    @Query(
            value = "select * from student s where s.seat_position = :seatPosition",
            nativeQuery = true
    )
    List<Student> findMyOwnSeatBySeatPosition(@Param("seatPosition") String seatPosition);

    @Query(
            value = "select * from student",
            nativeQuery = true
    )
    List<Student> findAllStudents();

}
