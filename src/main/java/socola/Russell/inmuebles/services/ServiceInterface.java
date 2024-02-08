package socola.Russell.inmuebles.services;

import java.util.List;

public interface ServiceInterface <R>{
    void agregar(R objeto);
    void modificar(R objeto, Long id);
    void eliminar(Long id);
    R get(Long id);
    List<R> getAll();
}
