package com.dash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dash.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
    
    @Query("SELECT p FROM User p WHERE p.name LIKE %?1%"
            + " OR p.id LIKE %?1%")
    List<User> searchUsers(String employee);
    
}
