package br.com.gustavomacedo.git_together.repositories;

import br.com.gustavomacedo.git_together.entities.UFEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UFRepository extends JpaRepository<UFEntity, Integer> {

    @Override
    public List<UFEntity> findAll();
}
