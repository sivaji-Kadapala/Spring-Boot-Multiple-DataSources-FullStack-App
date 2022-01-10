package com.tony.md.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tony.md.service.UserService;






@Controller
@RequestMapping("/users")
public class UserController {

 @Autowired
 private UserService userService;
 
 @RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
 public ModelAndView getAllUsers() {
  ModelAndView model = new ModelAndView();
  
  List<com.tony.md.model.User> usersList = userService.getAllUser();
  model.addObject("usersList", usersList);
  
  model.setViewName("users_list");
  return model;
 }
}
