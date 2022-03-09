package com.example.onlineNotes.controllers;

import com.example.onlineNotes.entities.Users;
import com.example.onlineNotes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserListController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<Users> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }
}
