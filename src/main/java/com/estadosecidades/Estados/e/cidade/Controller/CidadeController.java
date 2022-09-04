package com.estadosecidades.Estados.e.cidade.Controller;

import com.estadosecidades.Estados.e.cidade.Model.CidadeModel;
import com.estadosecidades.Estados.e.cidade.Servide.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeController {
    @Autowired
    private CidadeService cidadeService;

    @GetMapping(path = "/cidade")
    public List<CidadeModel> listaCdade (){
        return cidadeService.buscarCidade();

    }@GetMapping(path = "/cidade/{id}")
    public Optional<CidadeModel> buscarCidade (@PathVariable long id){
        return cidadeService.buscarCidadeId(id);
    }

    @PostMapping(path = "/cidade")
    public CidadeModel cadastrarCidade(@RequestBody CidadeModel cidadeModel    ){
        return cidadeService.cadastrarCidade(cidadeModel);
    }

    @PutMapping(path = "/cidade /{id}")
    public CidadeModel slterarNomeCidade (@RequestBody CidadeModel cidadeModel){
        return cidadeService.alterarNomeCidade(cidadeModel);

    }
    @DeleteMapping(path = "/cidade /{id}")
    public void deletarCidade(@PathVariable long id){
        cidadeService.deleteCidadeID(id);
    }
}
