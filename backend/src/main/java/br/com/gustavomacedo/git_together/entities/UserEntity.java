package br.com.gustavomacedo.git_together.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Column(name = "full_name")
    @Getter
    private String fullName;

    @Column(name = "user_name")
    @Getter
    private String userName;

    @Column(name = "email")
    @Getter
    private String email;

    @Column(name = "password")
    @Getter
    private String password;

    @OneToOne
    @Getter
    private UFEntity uf;

    @ManyToMany
    @JoinTable(
            name = "tb_user_interests",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "interest_id")
    )
    private List<InterestEntity> interests;

}
