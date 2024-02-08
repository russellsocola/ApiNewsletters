package socola.Russell.inmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socola.Russell.inmuebles.models.Vendedor;
import socola.Russell.inmuebles.services.VendedorService;
import java.util.List;

@RestController
public class VendedorController implements InterfaceCrontroller<Vendedor> {
    @Autowired
    private VendedorService vendedorService;


    @PostMapping("/api/vendedor")
    public void agregar(@RequestBody Vendedor vendedor){
        //funcionalidad para agregar a la base de datos
        vendedorService.agregar(vendedor);
    }


    @PutMapping("/api/vendedor/{id}")
    public void modificar(@RequestBody Vendedor vendedor, @PathVariable("id") Long id){
        //funcionalidad para modificar en la base de datos
        vendedorService.modificar(vendedor,id);
    }


    @DeleteMapping("/api/vendedor/{id}")
    public void eliminar(@PathVariable("id") Long id){
        vendedorService.eliminar(id);
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
