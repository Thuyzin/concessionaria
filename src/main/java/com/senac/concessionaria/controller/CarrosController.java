package com.senac.concessionaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller


public class CarrosController {

    @GetMapping("/carros")
    public String abrircarros(){

        return "carros";
    }

}
