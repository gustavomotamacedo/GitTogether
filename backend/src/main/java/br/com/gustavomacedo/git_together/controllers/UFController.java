package br.com.gustavomacedo.git_together.controllers;

import br.com.gustavomacedo.git_together.entities.UFEntity;
import br.com.gustavomacedo.git_together.services.UFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/uf")
public class UFController {

    @Autowired
    private UFService ufService;

    @GetMapping
    public List<UFEntity> getAllUfs() {
        return ufService.getAllUfs();
    }

}
