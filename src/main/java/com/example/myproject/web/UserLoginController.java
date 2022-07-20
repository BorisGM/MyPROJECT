package com.example.myproject.web;

import com.example.myproject.models.binding.UserLoginBindingModel;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller

public class UserLoginController {
//
  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@Valid UserLoginBindingModel userLoginBindingModel,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes) {

    if (bindingResult.hasErrors()) {
      redirectAttributes.addFlashAttribute("userLoginBindingModel", userLoginBindingModel);
      redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userLoginBindingModel", bindingResult);

      return "redirect:/login";
    }




    return "redirect:/about";
  }

}
