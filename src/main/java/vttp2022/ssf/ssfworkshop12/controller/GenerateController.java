package vttp2022.ssf.ssfworkshop12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller


public class GenerateController {
    private Logger logger = LoggerFactory.getLogger(GenerateController.class);

    //root path
    //define our main page that forward to the generatePage(form)

    @GetMapping("/")
    public String showGenerateNumForm(Model model){
        return "generatePage";
    }
}
