package vttp2022.ssf.ssfworkshop12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vttp2022.ssf.ssfworkshop12.model.Generate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller


public class GenerateController {
    private Logger logger = LoggerFactory.getLogger(GenerateController.class);

    //root path
    //define our main page that forward to the generatePage(form)

    @GetMapping("/")
    public String showGenerateNumForm(Model model){
        logger.info("----showGenerateNumForm-----");
        //init an empty generate object that carries an int - x number to be gen
        Generate genObj = new Generate();
        //default to 1 everytime the page is loaded
        genObj.setNumberVal(1);
        // pass  it to the view as th:obj
        model.addAttribute("generateObj", genObj);
        return "generatePage";
    }
}
