package socola.Russell.inmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socola.Russell.inmuebles.models.Galeria;
import socola.Russell.inmuebles.services.GaleriaService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GaleriaController implements InterfaceCrontroller<Galeria>{

    @Autowired
    private GaleriaService galeriaService;

    @PostMapping("/api/galeria")
    public void agregar(@RequestBody Galeria galeria){
        galeriaService.agregar(galeria);
    }

    @PutMapping("/api/galeria/{id}")
    public void modificar(@RequestBody Galeria galeria, @PathVariable("id") Long id){
        //funcionalidad para modificar en la base de datos
        galeriaService.modificar(galeria,id);
    }

    @DeleteMapping("/api/galeria/{id}")
    public void eliminar(@PathVariable("id") Long id){
        galeriaService.eliminar(id);
    }

    @GetMapping("/api/galeria/{id}")
    public Galeria get(@PathVariable("id") Long id){
        return galeriaService.get(id);
    }

    @GetMapping("api/galeria")
    public List<Galeria> getAll(){
        return galeriaService.getAll();
    }

}
