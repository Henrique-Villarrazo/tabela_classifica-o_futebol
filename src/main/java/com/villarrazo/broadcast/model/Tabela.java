package com.villarrazo.broadcast.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "classificacao", schema = "public")
public class Tabela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "team")
    private String team;
    @Column(name = "points")
    private int points;
    @Column(name = "goals")
    private int goals;
    @Column(name = "win")
    private int win;

}
