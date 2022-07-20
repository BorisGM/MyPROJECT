package com.example.myproject.models.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {
//
    @Size(min = 5, max = 20)
    private String name;


    @Email
    private String email;

    @Size(min = 5, max = 20)
    private String phone;



    @Size(min = 5)
    private String password;

    @Size(min = 5)
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }




    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
