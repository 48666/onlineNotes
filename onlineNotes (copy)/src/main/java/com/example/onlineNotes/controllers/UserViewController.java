package com.example.onlineNotes.controllers;

import com.example.onlineNotes.entities.Category;
import com.example.onlineNotes.entities.Notes;
import com.example.onlineNotes.entities.Users;
import com.example.onlineNotes.enums.SorBy;
import com.example.onlineNotes.repository.CategoryRepository;
import com.example.onlineNotes.repository.NotesRepository;
import com.example.onlineNotes.repository.UserRepository;
import com.example.onlineNotes.sevice.SortNotes;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
//@RequestMapping(value = "/user")
public class UserViewController {
    List<Notes> listOfNotes ;
    List<Users> persons;


    @Autowired
    private NotesRepository notesRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("notes")
    @ResponseBody
    public ModelAndView showMainPage(Principal principal, @RequestParam(required = false) Long sort, Model model){

        ModelAndView mv = new ModelAndView("user");

        Users persons = userRepository.findByEmail(principal.getName());
        // person data
        String imie = persons.getImie();
        String nazwisko = persons.getNazwisko();
        List<Notes> notes = persons.getNotes();
        SortNotes sortNotes = new SortNotes(notes);
     boolean con=   sort!=null;
     if(con) {
         if (sort == SorBy.TOPIC.number) {
             notes = sortNotes.sortByTopic();
         }
         if (sort == SorBy.MESSAGE.number) {
             notes = sortNotes.sortByMessage();
         }
         if (sort == SorBy.CREATEDATE.number) {
             notes = sortNotes.sortByCreateDate();
         }
     }



        model.addAttribute("tasks",notes);

        model.addAttribute("message", StringUtils.capitalize(imie) + " " + StringUtils.capitalize(nazwisko) );


        return mv;
    }
    @GetMapping("/add-note")
    public String addingNote(Model model){
//        ModelAndView mv = new ModelAndView("addnotes");
        Notes n = new Notes();


        model.addAttribute("note",n);


        return "addnotes";
    }
    @PostMapping("/add-note")
    public String submitt(Principal principal, @ModelAttribute Notes notes, Model model){

        notes.setCrate_date(LocalDate.now());
        Users persons = userRepository.findByEmail(principal.getName());
        notes.setPerson(persons);

        notesRepository.save(notes);




        model.addAttribute("note",notes);
        return "confirmation";

    }

//    @ModelAttribute("addnotes")Notes notes,Model model




}
