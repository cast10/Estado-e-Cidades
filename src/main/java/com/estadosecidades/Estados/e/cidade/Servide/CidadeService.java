package com.estadosecidades.Estados.e.cidade.Servide;

import com.estadosecidades.Estados.e.cidade.Model.CidadeModel;
import com.estadosecidades.Estados.e.cidade.Repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeModel> buscarCidade (){
        return cidadeRepository.findAll();
    }
    public Optional<CidadeModel> buscarCidadeId (Long id){
        return cidadeRepository.findById(id);
    }
    public CidadeModel cadastrarCidade (CidadeModel cidadeModel){

        cidadeModel.getId();
        cidadeModel.getNomeCidade();

        return cidadeRepository.save(cidadeModel);
    }
    public CidadeModel alterarNomeCidade (CidadeModel cidadeModel){

        cidadeModel.getId();
        cidadeModel.getNomeCidade();

        return cidadeRepository.save(cidadeModel);
    }
    public void deleteCidadeID(Long id){
        cidadeRepository.deleteById(id);
    }

}
