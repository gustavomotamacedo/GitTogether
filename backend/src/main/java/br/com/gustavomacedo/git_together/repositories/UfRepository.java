package br.com.gustavomacedo.git_together.repositories;

import br.com.gustavomacedo.git_together.entities.UfEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UfRepository extends JpaRepository<UfEntity, Integer> {
}
