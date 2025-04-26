package br.com.gustavomacedo.git_together.controllers;

import br.com.gustavomacedo.git_together.DTOs.UFDto;
import br.com.gustavomacedo.git_together.entities.UFEntity;
import br.com.gustavomacedo.git_together.services.UFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uf")
public class UFController {

    @Autowired
    private UFService ufService;

    @GetMapping
    public List<UFDto> getAllUfs() {
        return ufService.getAllUfs();
    }

    @GetMapping("/{uf}")
    public UFDto getByUf(@PathVariable("uf") String uf) {
        return ufService.getUfByUF(uf.toUpperCase());
    }

}
