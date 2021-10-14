package com.plensy.projet1.repository;

import com.plensy.projet1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Integer> {
    @Query(" select u from User u " + " where u.username = ?1")
    Optional<User> findUserWithName(String username);
}
