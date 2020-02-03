package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.dto.UserAddressDTO;
import com.example.demo.entities.User;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {

  @Query("SELECT new com.example.demo.dto.UserAddressDTO(u.fname,u.lname, u.email, u.exp, a.street, a.city, a.country) "
      + "FROM Address a LEFT JOIN a.user u")
  List<UserAddressDTO> fetchUserAddressDataLeftJoin();

  @Query("SELECT new com.example.demo.dto.UserAddressDTO(u.fname,u.lname, u.email, u.exp, a.street, a.city, a.country) "
      + "FROM Address a RIGHT JOIN a.user u")
  List<UserAddressDTO> fetchUserAddressDataRightJoin();

}
