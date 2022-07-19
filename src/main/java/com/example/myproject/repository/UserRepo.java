package com.example.myproject.repository;

import com.example.myproject.models.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUserName(String username);

    Optional<UserEntity> findByUserNameAndPassword(String username, String password);
}
