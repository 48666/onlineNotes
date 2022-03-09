package com.example.onlineNotes.repository;

import com.example.onlineNotes.entities.Category;
import com.example.onlineNotes.entities.Notes;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class CategoryRepositoryTest {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private NotesRepository notesRepository;
    @Test
    public void addCategory(){
        Category category = new Category();
        category.setCategoryId(1l);
        category.setTitle("muzyka");
        category.setAbout("dotyczy to muzyki");
        category.setUrl("url");
        category.setGeneralRating(3);

        Category category2 = new Category();
        category.setCategoryId(2l);
        category.addNote(new Notes(1L,"gwiezdne wojnhy",3,"bylem w kinie",LocalDate.of(2000,12,12)));


        categoryRepository.save(category);
        categoryRepository.save(category2);



        List<Category> all = categoryRepository.findAll();
        assertEquals(2,all.size());
    }
}