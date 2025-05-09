package br.com.gustavomacedo.git_together.services;

import br.com.gustavomacedo.git_together.DTOs.UFDto;
import br.com.gustavomacedo.git_together.entities.UFEntity;
import br.com.gustavomacedo.git_together.repositories.UFRepository;
import org.springframework.stereotype.Service;

import javax.management.ConstructorParameters;
import java.util.List;

@Service
public class UFService {

    private UFRepository ufRepository;

    public UFService(UFRepository ufRepository) {
        this.ufRepository = ufRepository;
    }

    public List<UFDto> getAllUfs() {
        List<UFEntity> ufEntities = ufRepository.findAll();
        return ufEntities.stream().map(UFDto::toDTO).toList();
    }

    public UFDto getUfByUF(String uf) {
        UFEntity ufEntity = ufRepository.findByUf(uf);
        return UFDto.toDTO(ufEntity);
    }

}
