package br.com.gustavomacedo.git_together.services;

import br.com.gustavomacedo.git_together.DTOs.InterestDto;
import br.com.gustavomacedo.git_together.entities.InterestEntity;
import br.com.gustavomacedo.git_together.repositories.InterestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestService {

    private InterestRepository interestRepository;

    public InterestService(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }

    public List<InterestDto> getAllInterests() {
        List<InterestEntity> interest = interestRepository.findAll();
        return interest.stream().map(InterestDto::toDTO).toList();
    }

    

}
