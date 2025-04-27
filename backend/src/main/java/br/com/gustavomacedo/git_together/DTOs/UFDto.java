package br.com.gustavomacedo.git_together.DTOs;

import br.com.gustavomacedo.git_together.entities.UFEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public record UFDto(String uf,
                    String name) {

    public static UFDto toDTO(UFEntity ufEntity) {
        return new UFDto(ufEntity.getUf(), ufEntity.getName());
    }

    public static UFEntity toEntity(UFDto ufDto) {
        UFEntity ufEntity = new UFEntity();
        ufEntity.setUf(ufDto.uf());
        ufEntity.setName(ufDto.name());
        return ufEntity;
    }
}
