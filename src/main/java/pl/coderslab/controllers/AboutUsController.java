package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {

        @GetMapping("/aboutUs")
        public String home(){
            return "aboutUs";
        }


    }

