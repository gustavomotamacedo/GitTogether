package br.com.gustavomacedo.git_together.repositories;

import br.com.gustavomacedo.git_together.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
