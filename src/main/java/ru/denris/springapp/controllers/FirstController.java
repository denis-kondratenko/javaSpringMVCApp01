package ru.denris.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")

    public String helloPage(@RequestParam(value = "name",required = false) String name,
                            @RequestParam(value = "surename",required = false) String surename,
                            Model model){

        //выкинет в браузере HTTP Status 400 – Bad Request если параметры не переданы
//    public String helloPage(@RequestParam("name") String name,
//                            @RequestParam("surename") String surename){

    //не вернет null в name и surename если параметры в запрос не переданы
//    public String helloPage(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String surename = request.getParameter("surename");

        //System.out.println("Hello, " + name + " " + surename);

        model.addAttribute("message","Hello, " + name + " " + surename);

        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
}
