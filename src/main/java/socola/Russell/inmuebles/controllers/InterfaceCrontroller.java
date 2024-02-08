package socola.Russell.inmuebles.controllers;


import java.util.List;

public interface InterfaceCrontroller<R>{

    void agregar( R objeto);


    void modificar(R objeto, Long id);


    void eliminar(Long id);

    R get(Long id);

    List<R> getAll();

}
