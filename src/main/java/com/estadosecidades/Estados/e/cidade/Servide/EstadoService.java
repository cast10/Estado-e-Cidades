package com.estadosecidades.Estados.e.cidade.Servide;

import com.estadosecidades.Estados.e.cidade.Model.EstadoModel;
import com.estadosecidades.Estados.e.cidade.Repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<EstadoModel> buscaTodos() {
        return estadoRepository.findAll();
    }

    public Optional<EstadoModel> buscarId(Long id) {
        return estadoRepository.findById(id);
    }

    public EstadoModel cadastreEstado(EstadoModel estadoModel) {

        estadoModel.getId();
        estadoModel.getNomeEstado();

        return estadoRepository.save(estadoModel);
    }

    public EstadoModel alterarNomeEstado(EstadoModel estadoModel) {

        estadoModel.getId();
        estadoModel.getNomeEstado();


        return estadoRepository.save(estadoModel);
    }

    public void deleteId(Long id) {
        estadoRepository.deleteById(id);
    }
}
