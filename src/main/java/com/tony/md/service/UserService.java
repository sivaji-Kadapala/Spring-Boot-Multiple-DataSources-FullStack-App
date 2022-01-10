package com.tony.md.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tony.md.dao.UserDaoImpl;
import com.tony.md.model.User;




@Service
public class UserService {

 @Autowired
 private UserDaoImpl userDao;
 
 public List<User> getAllUser() {
  return userDao.getAllUser();
 }
}
