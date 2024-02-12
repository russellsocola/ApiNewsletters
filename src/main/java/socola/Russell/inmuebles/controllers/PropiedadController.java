package socola.Russell.inmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import socola.Russell.inmuebles.models.Propiedad;
import socola.Russell.inmuebles.services.PropiedadService;
import java.util.List;

@RestController
public class PropiedadController implements InterfaceCrontroller<Propiedad> {

    @Autowired
    private PropiedadService propiedadService;

    @PostMapping("/api/propiedad")
    public ResponseEntity<String> agregar(@RequestBody Propiedad propiedad){
        try{
            propiedadService.agregar(propiedad);
            return ResponseEntity.ok().build();
        }catch ( Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar una propiedad: "+ ex.getMessage());
        }

    }


    @PutMapping("/api/propiedad/{id}")
    public ResponseEntity<String> modificar(@RequestBody Propiedad propiedad, @PathVariable("id") Long id){
        try{
            propiedadService.modificar(propiedad, id);
            return ResponseEntity.ok().build();
        }catch ( Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al modificar una propiedad: "+ ex.getMessage());
        }
    }


    @DeleteMapping("/api/propiedad/{id}")
    public ResponseEntity<String> eliminar(@PathVariable("id") Long id){
        try{
            propiedadService.eliminar(id);
            return ResponseEntity.ok().build();
        }catch ( Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar una propiedad: "+ ex.getMessage());
        }
    }

    @GetMapping("/api/propiedad/{id}")
    public Propiedad get(@PathVariable("id") Long id){
        return propiedadService.get(id);
    }

    @GetMapping("api/propiedad")
    public List<Propiedad> getAll(){
        return propiedadService.getAll();
    }
}
