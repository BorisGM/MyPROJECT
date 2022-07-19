package com.example.myproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {



    @GetMapping(value = "/gallery")
    public String getGallery() {

        return "gallery";
    }
}
