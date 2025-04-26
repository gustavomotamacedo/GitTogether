package br.com.gustavomacedo.git_together.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uf")
public class UfController {

    @GetMapping
    public String getAllUfs() {
        return "Hello World";
    }

}
