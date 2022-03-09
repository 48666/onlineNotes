package com.example.onlineNotes.controllers;

import com.example.onlineNotes.entities.Users;
import com.example.onlineNotes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Users());

        return "signup_form";
    }
    @PostMapping("/process_register")
    public String processRegister(Users persons) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(persons.getPassword());
        persons.setPassword(encodedPassword);

        userRepository.save(persons);

        return "register_success";
    }

}
