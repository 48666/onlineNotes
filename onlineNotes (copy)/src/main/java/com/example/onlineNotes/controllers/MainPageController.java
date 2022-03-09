package com.example.onlineNotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {

   @GetMapping("/")
    public ModelAndView showMainPage(){
       ModelAndView mv = new ModelAndView("greeting");
       return mv;
   }
}
