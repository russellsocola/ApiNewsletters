package socola.Russell.inmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> agregar(@RequestBody Galeria galeria){
        try {
            galeriaService.agregar(galeria);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar la galeria: " + ex.getMessage());
        }
    }

    @PutMapping("/api/galeria/{id}")
    public ResponseEntity<String> modificar(@RequestBody Galeria galeria, @PathVariable("id") Long id){
        //funcionalidad para modificar en la base de datos
        try {
            galeriaService.modificar(galeria, id);
            return ResponseEntity.ok().build();
        }catch ( Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al modificar la galeria: "+ ex.getMessage());
        }

    }

    @DeleteMapping("/api/galeria/{id}")
    public ResponseEntity<String> eliminar(@PathVariable("id") Long id){
        try{
            galeriaService.eliminar(id);
            return ResponseEntity.ok().build();
        }catch ( Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar una galeria: "+ ex.getMessage());
        }

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
