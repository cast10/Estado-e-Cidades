package com.estadosecidades.Estados.e.cidade.Controller;

import com.estadosecidades.Estados.e.cidade.Model.EstadoModel;
import com.estadosecidades.Estados.e.cidade.Servide.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {
    @Autowired

    private EstadoService estadoService;

    @GetMapping(path = "/estado")
    public List <EstadoModel> listaEstado (){
        return estadoService.buscaTodos();

    }
    @GetMapping(path = "/estado/{id}")
    public Optional<EstadoModel> buscaEstado (@PathVariable long id){
        return estadoService.buscarId(id);
    }

    @PostMapping(path = "/estado")
    public EstadoModel cadastrarEstado(@RequestBody EstadoModel estadoModel){
        return estadoService.cadastreEstado(estadoModel);
    }

    @PutMapping(path = "/estado /{id}")
    public EstadoModel slterarNomeEstado (@RequestBody EstadoModel estadoModel){
        return estadoService.alterarNomeEstado(estadoModel);
    }
    @DeleteMapping(path = "/estado /{id}")
    public void deletarEstado(@PathVariable long id){
        estadoService.deleteId(id);
    }


}
