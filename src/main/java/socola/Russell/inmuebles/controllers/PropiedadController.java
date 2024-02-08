package socola.Russell.inmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socola.Russell.inmuebles.models.Propiedad;
import socola.Russell.inmuebles.services.PropiedadService;
import java.util.List;

@RestController
public class PropiedadController implements InterfaceCrontroller<Propiedad> {

    @Autowired
    private PropiedadService propiedadService;

    @PostMapping("/api/propiedad")
    public void agregar(@RequestBody Propiedad propiedad){
        propiedadService.agregar(propiedad);
    }


    @PutMapping("/api/propiedad/{id}")
    public void modificar(@RequestBody Propiedad propiedad, @PathVariable("id") Long id){
    propiedadService.modificar(propiedad, id);
    }


    @DeleteMapping("/api/propiedad/{id}")
    public void eliminar(@PathVariable("id") Long id){
    propiedadService.eliminar(id);
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
