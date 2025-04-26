package br.com.gustavomacedo.git_together.repositories;

import br.com.gustavomacedo.git_together.entities.InterestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestRepository extends JpaRepository<InterestEntity, Integer> {
}
