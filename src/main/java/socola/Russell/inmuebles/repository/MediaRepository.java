package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import socola.Russell.inmuebles.models.Media;
import socola.Russell.inmuebles.services.ServiceInterface;

import java.util.List;

@Repository
@Transactional
public class MediaRepository implements ServiceInterface<Media> {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void agregar(Media objeto) {

    }

    @Override
    public void modificar(Media objeto, Long id) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Media get(Long id) {
        return null;
    }

    @Override
    public List<Media> getAll() {
        return null;
    }
}
