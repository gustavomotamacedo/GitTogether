package br.com.gustavomacedo.git_together.DTOs;

import br.com.gustavomacedo.git_together.entities.InterestEntity;
import lombok.*;

public record InterestDto(String name) {

    public static InterestDto toDTO(InterestEntity interestEntity) {
        return new InterestDto(interestEntity.getName());
    }

    public static InterestEntity toEntity(InterestDto interestDto) {
        InterestEntity interestEntity = new InterestEntity();
        interestEntity.setName(interestDto.name());
        return interestEntity;
    }
}
