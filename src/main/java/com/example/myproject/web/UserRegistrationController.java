package com.example.myproject.web;


import com.example.myproject.models.binding.UserLoginBindingModel;
import com.example.myproject.models.binding.UserRegisterBindingModel;

import com.example.myproject.services.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Controller

public class UserRegistrationController {

  private final UserService userService;



  public UserRegistrationController(UserService userService) {
    this.userService = userService;

  }

  @GetMapping("/register")
  public String register() {
    return "register";
  }

  @PostMapping("/register")
  public String postLogin(@Valid UserRegisterBindingModel userRegisterBindingModel,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes,
                          HttpServletRequest request) {

    if (bindingResult.hasErrors()) {
      redirectAttributes.addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel);
      redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userLoginBindingModel", bindingResult);

      return "redirect:/register";
    }

    this.userService.registerAndLogin(
            userRegisterBindingModel);

    return "redirect:login";
  }
}
