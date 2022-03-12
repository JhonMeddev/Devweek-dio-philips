package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.IncidenciaExame;
import com.dio_class.devweek.Repo.IncidenciaRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerIncidencia {

    private final IncidenciaRepo inRepository;

    public ControllerIncidencia(IncidenciaRepo inRepository) {
        this.inRepository = inRepository;
    }

    @GetMapping("/incidencias")
    public ResponseEntity<List<IncidenciaExame>> findIncidencias(){
        List<IncidenciaExame> listaIncidencia = inRepository.findAll();
        if (listaIncidencia.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return new ResponseEntity<>(listaIncidencia, HttpStatus.OK);
    }

    @GetMapping("/incidencia/{id}")
    public ResponseEntity<IncidenciaExame> findIncidenciasById(@PathVariable Long id){
        Optional<IncidenciaExame> incidenciaOptional = inRepository.findById(id);
        if (incidenciaOptional.isPresent()){
            IncidenciaExame incidenciaUnid = incidenciaOptional.get();
            return new ResponseEntity<>(incidenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/incidencia/novo")
    public IncidenciaExame newIncidencia(@RequestBody IncidenciaExame newIncidencia){
        return inRepository.save(newIncidencia);
    }

}
