package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import socola.Russell.inmuebles.models.Galeria;
import java.util.List;

@Repository
@Transactional
public class GaleriaRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void agregar(Galeria galeria) {
        entityManager.persist(galeria);
    }

    @Transactional
    public void modificar(Galeria galeria) {
        entityManager.merge(galeria);
    }

    @Transactional
    public void eliminar(Long id) {
        Galeria galeria = entityManager.find(Galeria.class, id);
        if (galeria != null){
            entityManager.remove(galeria);
        }else {
            throw new EntityNotFoundException("No se encuentra la Galeria con el ID: "+ id);
        }
    }

    public Galeria get(Long id) {
        return entityManager.find(Galeria.class, id);
    }

    public List<Galeria> getAll() {
        String hql = "FROM Galeria";
        return entityManager.createQuery(hql, Galeria.class).getResultList();
    }
}
