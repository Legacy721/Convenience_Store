package com.legacy.ecommerce.controller;


import com.legacy.ecommerce.dto.UserDTO;
import com.legacy.ecommerce.model.User;
import com.legacy.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;

@Controller
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/register")
    public String getRegisterPage(Model model){
        model.addAttribute("register", new UserDTO());
        return "register";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("login", new UserDTO());
        return "login";
    }


    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model){

        User userToSave = userService.create(user);
        System.out.println("Printing new signed");
        model.addAttribute("user", user);

       // User oauthUser = userService.authenticate(user.getEmail(), user.getPassword());

        if(Objects.nonNull(userToSave)){
            return "redirect:/login";
        }else {
            return "redirect:/register";
        }


    }

//    @Autowired
//    UserService userService;
//
//
//
//    @GetMapping("/login")
//    public ModelAndView login() {
//        ModelAndView mav = new ModelAndView("login");
//        mav.addObject("user", new User());
//        return mav;
//    }
//
//    @GetMapping("/home")
//    public String  home(Model model) {
//        List<User> listOfUsers = userService.getAllUsers();
//        model.addAttribute("listOfUsers", listOfUsers);
//        return "home";
//    }
//
//    @GetMapping("/register")
//    public String  signup() {
//        return "register";
//    }
//
//    @PostMapping("/login")
//    public String login(@ModelAttribute("user") User user ) {
//
//        User oauthUser = userService.login(user.getEmail(), user.getPassword());
//
//        System.out.print(oauthUser);
//        if(Objects.nonNull(oauthUser))
//        {
//            return "redirect:/shop";
//        } else {
//            return "redirect:/login";
//        }
//
//    }
//
//    @PostMapping("/signup")
//    public String createAccount(@ModelAttribute User user, Model model) {
//
//        model.addAttribute("user", user);
//        User toSaveUser = userService.create(user);
//
//        User oauthUser = userService.login(user.getEmail(), user.getPassword());
//
//        if(Objects.nonNull(oauthUser)) {
//            return "redirect:/login";
//        } else {
//            return "redirect:/signup";
//        }
//
//    }

//    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
//    public String logoutDo(HttpServletRequest request, HttpServletResponse response) {
//        return "redirect:/login";
//    }


}
