package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import socola.Russell.inmuebles.models.Galeria;
import socola.Russell.inmuebles.services.ServiceInterface;

import java.util.List;

@Repository
@Transactional
public class GaleriaRepository implements ServiceInterface<Galeria> {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void agregar(Galeria objeto) {

    }

    @Override
    public void modificar(Galeria objeto, Long id) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Galeria get(Long id) {
        return null;
    }

    @Override
    public List<Galeria> getAll() {
        return null;
    }
}
