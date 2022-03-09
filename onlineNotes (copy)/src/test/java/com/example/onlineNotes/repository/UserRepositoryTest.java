package com.example.onlineNotes.repository;

import com.example.onlineNotes.entities.Users;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@DataJpaTest
class UserRepositoryTest {
    @Autowired
    private NotesRepository notesRepository;
    @Autowired
    private UserRepository userRepository;
//    @Test
//    void findByPerson_PersonId() {
//        LocalDate loc = LocalDate.now();
//        Persons user =  new Persons(2L,"karol","friz",20,"stronpassword");
//        Notes n1 = new Notes(2L,"Notatka",0,"notatka lekcyjna",loc,user);
//
//        Notes n2 = new Notes(3L,"drugaNotatka",0,"notatka lekcyjna durga",loc,user);
//
//        Notes n3 = new Notes(4L,"trzecia notatka",0,"historia polski jest dosyc ciekawa",loc.minusYears(10),user);
//
//        List<Notes> notesUserOne = new ArrayList<>();
//        notesUserOne.add(n1);
//        notesUserOne.add(n2);
//        notesUserOne.add(n3);
//        user.setNotes(notesUserOne);
//        userRepository.save(user);
//        Persons persons = userRepository.findById(1L).orElseThrow(EntityNotFoundException::new);
//        List<Notes> notes = persons.getNotes();
//
//
////        Persons user2 =  new Persons(2L,"Maciej","Warszawiak",21,"strongestPassrod");
////        userRepository.save(user2);
//
////
////        Persons persons = userRepository.findById(1L).orElseThrow();
//        //pierwsze notatki
//
//
//
////        Notes user2Note = new Notes(5L,"Praca domowa","trzeba odrobic zalegle prace domowe z poprzedniego semestru",loc,user2);
////        notesRepository.save(user2Note);
////        Notes user2Note2 = new Notes(6L,"rachune za prad","oswietlenie kosztuje coraz wiecej",loc,user2);
////        notesRepository.save(user2Note2);
////        Notes user2Note3 = new Notes(7L,"swieto","wazne swieto trzeba zaprosic wszystkich",loc,user2);
////        notesRepository.save(user2Note3);
//
//
//
//        assertEquals(3,notes.size());
//    }
    @Test
    public void saveUser(){
Users persons = new Users(1l,"michal","kowalski",18,"haslo","niewiem@gmail.com",new ArrayList<>());
        Users save = userRepository.save(persons);
        assertEquals("niewiem@gmail.com",userRepository.findAll().get(0).getEmail());

    }

}