package com.estadosecidades.Estados.e.cidade.Repository;

import com.estadosecidades.Estados.e.cidade.Model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<CidadeModel, Long> {
}
