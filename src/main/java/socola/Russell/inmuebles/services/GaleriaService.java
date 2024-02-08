package socola.Russell.inmuebles.services;

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

    @Override
    public void agregar(Galeria galeria) {
        galeriaRepsitory.agregar(galeria);
    }

    @Override
    public void modificar(Galeria galeria, Long id) {
        galeriaRepsitory.modificar(galeria,id);
    }

    @Override
    public void eliminar(Long id) {
        galeriaRepsitory.eliminar(id);
    }

    @Override
    public Galeria get(Long id) {

        Galeria galeria = new Galeria();
        galeria.setId(1L);
        galeria.setNombre("Russell Nahum");
        return galeria;
    }

    @Override
    public List<Galeria> getAll() {

        List<Galeria> lista = new ArrayList<>();
        Galeria galeria = new Galeria();
        galeria.setId(1L);
        galeria.setNombre("Russell Nahum");
        lista.add(galeria);

        Galeria galeria2 = new Galeria();
        galeria2.setId(1L);
        galeria2.setNombre("Russell Nahum");
        lista.add(galeria2);
        return lista;
    }
}
