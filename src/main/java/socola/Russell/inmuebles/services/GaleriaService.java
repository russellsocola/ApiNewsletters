package socola.Russell.inmuebles.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import socola.Russell.inmuebles.models.Galeria;
import socola.Russell.inmuebles.repository.GaleriaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class GaleriaService implements ServiceInterface<Galeria> {
    @Autowired
    private GaleriaRepository galeriaRepsitory;

    @Transactional
    public void agregar(Galeria galeria) {
        galeriaRepsitory.agregar(galeria);
    }

    @Transactional
    public void modificar(Galeria galeria, Long id){
        galeria.setId(id);
        galeriaRepsitory.modificar(galeria);
    }

    @Transactional
    public void eliminar(Long id) {
        galeriaRepsitory.eliminar(id);
    }

    @Transactional
    public Galeria get(Long id) {
        return galeriaRepsitory.get(id);
    }
    @Transactional
    public List<Galeria> getAll() {
        return galeriaRepsitory.getAll();
    }
}
