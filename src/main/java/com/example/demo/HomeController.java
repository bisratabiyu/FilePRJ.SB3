package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/tvform")
    public String loadFrom(Model model)
    {
        model.addAttribute("tvshowObj",new Tvshow());
        return "tvform";
    }
    @PostMapping("/tvform")
    public String loadForm(@ModelAttribute Tvshow tvshowObj, Model model)
    {
        model.addAttribute("mytvshow", tvshowObj);
        return "confirm";
    }
}
