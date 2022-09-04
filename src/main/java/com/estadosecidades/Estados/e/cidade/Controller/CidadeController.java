package com.estadosecidades.Estados.e.cidade.Controller;

import com.estadosecidades.Estados.e.cidade.Model.CidadeModel;
import com.estadosecidades.Estados.e.cidade.Model.EstadoModel;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CidadeController {
    @Autowired
    private CidadeModel cidadeModel;

    @GetMapping(path = "/cidade")
    public List<CidadeModel> listaCdade (){
        return  null;

    }@GetMapping(path = "/cidade/{id}")
    public Optional<CidadeModel> buscarCidade (@PathVariable long id){
        return null;
    }

    @PostMapping(path = "/cidade")
    public CidadeModel cadastrarCidade(@RequestBody CidadeModel cidadeModel    ){
        return null;
    }

    @PutMapping(path = "/cidade /{id}")
    public CidadeModel slterarNomeCidade (@RequestBody CidadeModel cidadeModel){
        return null;

    }
    @DeleteMapping(path = "/cidade /{id}")
    public void deletarCidade(@PathVariable long id){
        contaAPagarService.deleteId(id);
    }
}
