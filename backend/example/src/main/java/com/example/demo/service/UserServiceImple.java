package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserServiceImple implements UserService {

  @Autowired
  UserRepo repo;

  @Override
  public List<User> getUser() {
    return (List<User>) repo.findAll();
  }

  @Override
  public void createUser(User user) {
    repo.saveAndFlush(user);
  }

  @Override
  public void delete(Long id) {
    repo.deleteById(id);
  }

  @Override
  public User save(User user) {
    return null;
  }

  @Override
  public User findOne(Long id) {
    repo.findById(id);
    return null;
  }

  @Override
  public User update(User user) {
    // TODO Auto-generated method stub
    return repo.save(user);
  }

  public List fetchEmpDeptDataLeftJoin() {
    return repo.fetchUserAddressDataLeftJoin();
  }
}
