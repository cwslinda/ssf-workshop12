package vttp2022.ssf.ssfworkshop12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/", "/index.html"})

public class NumberController {
    @GetMapping(produces = {"text/html"})
    public String index(){
        return "index";
    }
}
