package com.estadosecidades.Estados.e.cidade.Model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "cidade")

public class CidadeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 35, nullable = false)
    private String nomeCidade;

    @ManyToOne
    @JoinColumn(name="cidade/id")
    private EstadoModel estadoModel;
}





