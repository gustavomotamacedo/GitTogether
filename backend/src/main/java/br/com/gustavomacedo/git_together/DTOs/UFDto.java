package br.com.gustavomacedo.git_together.DTOs;

import br.com.gustavomacedo.git_together.entities.UFEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UFDto {

    private String uf;

    private String name;

    public static UFDto toDTO(UFEntity ufEntity) {
        return new UFDto(ufEntity.getUf(), ufEntity.getName());
    }
}
