package app.springcoursemanager.repository;

import app.springcoursemanager.entity.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook,Long> {

    List<Notebook> findByNotebookColor(String color);
}
