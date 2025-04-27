package br.com.gustavomacedo.git_together.DTOs;

import br.com.gustavomacedo.git_together.entities.UFEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public record UFDto(String uf,
                    String name) {

    public static UFDto toDTO(UFEntity ufEntity) {
        return new UFDto(ufEntity.getUf(), ufEntity.getName());
    }

}
