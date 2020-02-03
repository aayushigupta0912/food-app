package com.example.demo.service;

import java.util.List;
import com.example.demo.entities.User;


public interface UserService {
  
  public List<User> getUser();
  public void createUser(User user);
  public void delete(Long id);
  public User save(User user);
  public User findOne(Long id);
  public User update(User user);
  public List fetchEmpDeptDataLeftJoin();
}
