package com.gestionplaning.gestionplaning.controller;

import com.gestionplaning.gestionplaning.entity.User;
import com.gestionplaning.gestionplaning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    private String addContact(Model model, @RequestParam Optional<Long> id) {
        User user = new User();
        model.addAttribute("user", user);
        return "/register";
    }

    @PostMapping("/register")
    private String addContact(@ModelAttribute User user, @RequestParam Optional<Long> userId) {
        userService.save(user);
        return "redirect:/list_contact";
    }

}