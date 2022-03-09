//package com.example.onlineNotes.repository;
//
//import com.example.onlineNotes.entities.Notes;
//
//import com.example.onlineNotes.entities.Persons;
//import org.junit.jupiter.api.Test;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.Assert;
//import static org.assertj.core.api.Assertions.assertThat;
//
//
//import java.time.LocalDate;
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//class NotesRepositoryTest {
//@Autowired
//private NotesRepository notesRepository;
//@Autowired
//private UserRepository userRepository;
//
//
//
//    @Test
//    void addingPerson() {
//        LocalDate loc = LocalDate.now();
//        Persons user =  new Persons(2L,"karol","friz",20,"stronpassword");
//        Persons user2 =  new Persons(3L,"maciej","zklanu",21,"weakpassword");
//        userRepository.save(user);
//        userRepository.save(user2);
//
//        assertThat(userRepository.findAll().size()).isEqualTo(2);
//
//    }
//    @Test
//    void addingNotes() {
//        LocalDate loc = LocalDate.now();
//        Persons user =  new Persons(2L,"karol","friz",20,"stronpassword");
//        userRepository.save(user);
//        Persons user2 =  new Persons(3L,"maciej","zklanu",21,"weakpassword");
//        userRepository.save(user);
//       Notes n1 = new Notes(1L,"Notatka",0,"notatka lekcyjna",loc,user);
//       Notes n2 = new Notes(2L,"drugaNotatka",0,"notatka lekcyjna durga",loc,user);
//       notesRepository.save(n1);
//       notesRepository.save(n2);
//
//
//        assertThat(notesRepository.findAll().size()).isEqualTo(2);
//
//    }
//}