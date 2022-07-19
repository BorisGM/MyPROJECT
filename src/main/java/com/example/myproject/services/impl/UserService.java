package com.example.myproject.services.impl;




import com.example.myproject.models.binding.UserRegisterBindingModel;
import com.example.myproject.models.entity.UserEntity;

import com.example.myproject.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    private final UserRepo userRepository;

    @Autowired
    public UserService( ModelMapper modelMapper, PasswordEncoder passwordEncoder, UserRepo userRepository) {
        this.modelMapper = modelMapper;


        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    public void registerAndLogin(UserRegisterBindingModel userRegisterBindingModel) {

        UserEntity newUser = modelMapper.map(userRegisterBindingModel, UserEntity.class);
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));

        this.userRepository.save(newUser);

    }

}
