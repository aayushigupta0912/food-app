package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.UserAddressDTO;
import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class TestController {

  @Autowired
  UserService userService;
  
  //UserAddressDTO dto;

  @GetMapping(value = "/getAll")
  public List<User> getAllEmp() {
    List<User> ee = userService.getUser();
    System.out.println(ee);
    return ee;
  }
  @SuppressWarnings("unchecked")
  @GetMapping(value = "/userAddress")
  public List<UserAddressDTO> getUserAdd(){
   List<UserAddressDTO> dto = userService.fetchEmpDeptDataLeftJoin();
    System.out.println(dto);
    return dto;
  }

  @PostMapping(value = "/create", produces = "application/json")
  public String createNewUser(@RequestBody User user) {
    userService.createUser(user);
    return "created successfully";
  }

  @PutMapping(value = {"/update/{id}"})
  public User update(@PathVariable("id") int id, @RequestBody User user) {
    user.setId((long) id);
    return userService.update(user);
  }

  @DeleteMapping(value = "/user/{id}")
  public boolean deleteUser(@PathVariable Long id) {
    userService.delete(id);
    return true;
  }
  
  
  /*@PutMapping("/user")
  public User updateUser(User user) {
    return userService.save(user);
  }*/

}
