package br.com.gustavomacedo.git_together.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_interests")
@Getter
@Setter
public class InterestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;
    @Getter
    private String name;

    @ManyToMany
    @JoinTable(
            name = "tb_user_interests",
            joinColumns = @JoinColumn(name = "interest_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @Getter
    private List<UserEntity> users;

}
