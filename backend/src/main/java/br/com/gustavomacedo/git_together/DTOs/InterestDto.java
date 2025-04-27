package br.com.gustavomacedo.git_together.DTOs;

import br.com.gustavomacedo.git_together.entities.InterestEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public record InterestDto(String name) {

    public static InterestDto toDTO(InterestEntity interestEntity) {
        return new InterestDto(interestEntity.getName());
    }
}
