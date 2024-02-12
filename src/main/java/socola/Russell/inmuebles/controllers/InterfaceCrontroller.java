package socola.Russell.inmuebles.controllers;


import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InterfaceCrontroller<R>{

    ResponseEntity<String> agregar(R objeto);


   ResponseEntity<String> modificar(R objeto, Long id);


    ResponseEntity<String> eliminar(Long id);

    R get(Long id);

    List<R> getAll();

}
