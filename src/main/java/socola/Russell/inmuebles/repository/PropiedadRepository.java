package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import socola.Russell.inmuebles.models.Propiedad;

import java.util.List;

@Repository
@Transactional
public class PropiedadRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void agregar(Propiedad propiedad) {
        entityManager.persist(propiedad);
    }

    @Transactional
    public void modificar(Propiedad propiedad){
        entityManager.merge(propiedad);
    }
    @Transactional
    public void eliminar(Long id) {
        Propiedad propiedad = entityManager.find(Propiedad.class, id);
        if (propiedad != null){
            entityManager.remove(propiedad);
        }else {
            throw new EntityNotFoundException("No se encuentara la Propiedad con el ID: "+ id);
        }
    }

    @Transactional
    public Propiedad get(Long id) {
        return entityManager.find(Propiedad.class,id);
    }

    @Transactional
    public List<Propiedad> getAll() {
        String hql = "FROM Propiedad";
        return entityManager.createQuery(hql, Propiedad.class).getResultList();
    }
}
