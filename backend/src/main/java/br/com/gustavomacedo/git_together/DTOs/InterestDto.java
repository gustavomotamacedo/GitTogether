package br.com.gustavomacedo.git_together.DTOs;

import br.com.gustavomacedo.git_together.entities.InterestEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class InterestDto {

    @Getter
    @Setter
    private String name;

    public static InterestDto toDTO(InterestEntity interestEntity) {
        return new InterestDto(interestEntity.getName());
    }
}
