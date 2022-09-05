package com.estadosecidades.Estados.e.cidade.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "estado")
public class EstadoModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "estadoModel", cascade = CascadeType.ALL)
    private List<CidadeModel> cidade;

}
