package br.com.gustavomacedo.git_together.services;

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

    public List<UFEntity> getAllUfs() {
        return ufRepository.findAll();
    }

    public UFEntity getUfByUF(String uf) {
        return ufRepository.findByUf(uf);
    }

}
