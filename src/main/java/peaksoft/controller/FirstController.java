package peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class FirstController {

    @GetMapping("/first_html")
    public String get(){
        return "my_second_html_page";
    }

    @GetMapping("/second_html")
    public String getSecondHtml(){
        return "test";
    }
}
