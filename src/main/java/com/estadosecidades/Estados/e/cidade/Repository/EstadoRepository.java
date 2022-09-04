package com.estadosecidades.Estados.e.cidade.Repository;

import com.estadosecidades.Estados.e.cidade.Model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository <EstadoModel, Long> {
}
