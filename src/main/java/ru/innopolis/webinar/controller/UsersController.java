package ru.innopolis.webinar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.innopolis.webinar.models.User;
import ru.innopolis.webinar.repositories.UsersRepository;

import java.util.List;

@Controller
public class UsersController {
    private final UsersRepository usersRepository;



    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/users")
    public String getUsersPage(Model model){
        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);

        return "users_page";
    }
}
