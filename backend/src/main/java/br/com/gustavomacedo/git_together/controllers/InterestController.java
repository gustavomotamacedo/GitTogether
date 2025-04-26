package br.com.gustavomacedo.git_together.controllers;

import br.com.gustavomacedo.git_together.DTOs.InterestDto;
import br.com.gustavomacedo.git_together.services.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/interest")
public class InterestController {

    @Autowired
    private InterestService interestService;

    @GetMapping
    public List<InterestDto> getAllInterests() {
        return interestService.getAllInterests();
    }

    @GetMapping("/{id}")
    public InterestDto getInterestById(@PathVariable("id") Integer id) {
        return interestService.getInterestById(id);
    }

}
