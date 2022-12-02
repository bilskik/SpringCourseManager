package app.springcoursemanager.repository;

import app.springcoursemanager.entity.Notebook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class NotebookRepositoryTest {

    @Autowired
    private NotebookRepository notebookRepository;

    @Test
    public void getNotebookByColor() {
        List<Notebook> notebook = notebookRepository.findByNotebookColor("yellow");
        System.out.println("notebook = " + notebook);
        assert notebook != null;
    }
    @Test
    public void getNotebookById() {
        Optional<Notebook> notebookOptional = notebookRepository.findById(1L);
        Notebook notebook = notebookOptional.get();
        System.out.println("notebook = " + notebook.getNotebookColor());
        assert notebookOptional.isPresent();
    }
    @Test
    public void getNotebookAndRelatedStudent() {
        List<Notebook> list = notebookRepository.findAll();
        System.out.println("list = " + list);
        assert list != null;
    }
}
