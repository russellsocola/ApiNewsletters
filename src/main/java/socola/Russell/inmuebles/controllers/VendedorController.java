package socola.Russell.inmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import socola.Russell.inmuebles.models.Vendedor;
import socola.Russell.inmuebles.services.VendedorService;
import java.util.List;

@RestController
public class VendedorController implements InterfaceCrontroller<Vendedor> {
    @Autowired
    private VendedorService vendedorService;


    @PostMapping("/api/vendedor")
    public ResponseEntity<String> agregar(@RequestBody Vendedor vendedor){
        try {
            //funcionalidad para agregar a la base de datos
            vendedorService.agregar(vendedor);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar Vendedor"+ ex.getMessage());
        }
    }


    @PutMapping("/api/vendedor/{id}")
    public ResponseEntity<String> modificar(@RequestBody Vendedor vendedor, @PathVariable("id") Long id){
        try {
            //funcionalidad para modificar en la base de datos
            vendedorService.modificar(vendedor, id);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al modificar vendedor"+ex.getMessage());
        }
    }


    @DeleteMapping("/api/vendedor/{id}")
    public ResponseEntity<String> eliminar(@PathVariable("id") Long id){
        try {
            //funcionalidad para eliminar en la base de datos
            vendedorService.eliminar(id);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al modificar vendedor"+ex.getMessage());
        }
    }

    @GetMapping("/api/vendedor/{id}")
    public Vendedor get(@PathVariable("id") Long id){
        return vendedorService.get(id);
    }

    @GetMapping("api/vendedor")
    public List<Vendedor> getAll(){
        return vendedorService.getAll();
    }
}
