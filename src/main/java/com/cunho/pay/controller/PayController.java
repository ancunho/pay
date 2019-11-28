package com.cunho.pay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/pay")
public class PayController {

    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("create");
    }

}
