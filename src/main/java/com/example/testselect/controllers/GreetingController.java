package com.example.testselect.controllers;

import com.example.testselect.model.SelectClass;
import com.example.testselect.model.Selectform;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class GreetingController {

    static ArrayList<SelectClass> selectClasses = new ArrayList<>();
    static {

        selectClasses.add(new SelectClass("1","select1",true));
        selectClasses.add(new SelectClass("2","select2",false));
        selectClasses.add(new SelectClass("3","select3",false));
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        System.out.println(selectClasses.size());
        model.addAttribute("selectClasses",selectClasses);
        model.addAttribute("name", name);
        return "greeting";
    }

    @PostMapping("/greeting")
    public String submitSelectform(@ModelAttribute("selectform") Selectform selectform, @RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        System.out.println(selectform.toString());
        for (SelectClass str:
             selectClasses) {
            if (str.getId().equals(selectform.getSelectid())){
                str.setSelected(true);
            }
            else
            {
                str.setSelected(false);
            }
        }
        model.addAttribute("selectClasses",selectClasses);
        model.addAttribute("name", name);
        return  "greeting";
    }

}