package com.example.controller;

import com.example.form.SignInForm;
import com.fasterxml.jackson.databind.JsonNode;
import jdk.nashorn.internal.ir.ObjectNode;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class SignInController {

    @RequestMapping(value = "/", method = GET)
    public String home() {
        return "Home Spring Boot Create By Phong NV";
    }

    @RequestMapping(value = "/sign_in", method = GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        SignInForm signInForm =  new SignInForm();
        modelAndView.addObject("signInForm", signInForm);
        modelAndView.setViewName("sign_in");
        return modelAndView;
    }

    @RequestMapping(value = { "/", "/login" }, method = RequestMethod.POST)
    public ModelAndView submit(
        @Valid @ModelAttribute("loginForm") SignInForm loginForm,
        BindingResult result,
        HttpSession session
    ) {
        ModelAndView modelAndView =  new ModelAndView();

        return modelAndView;
    }
    public JsonNode foo(JsonNode jsonNode) {
        JsonNode updateNote = jsonNode.deepCopy();
        String s = "";
        Double aDouble = null;
        double b1 = 1;
        return updateNote;
    }
}
