package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
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
    private EntityManager entityManager;

    @Override
    public void agregar(Galeria galeria) {
        entityManager.persist(galeria);

    }

    @Override
    public void modificar(Galeria galeria, Long id) {
        Galeria editarGaleria = entityManager.find(Galeria.class, id);
        if (editarGaleria != null){
            editarGaleria.setNombre(galeria.getNombre());

            entityManager.merge(editarGaleria);
        }else {
            throw new EntityNotFoundException("No se encuentra la Galeria con ID :" + id);
        }

    }

    @Override
    public void eliminar(Long id) {
        String hql = "DELETE FROM galeria WHERE id = :id";
        entityManager.createQuery(hql).setParameter("id",id).executeUpdate();
    }

    @Override
    public Galeria get(Long id) {
        return null;
    }

    @Override
    public List<Galeria> getAll() {
        String hql = "FROM galeria";
        return entityManager.createQuery(hql).getResultList();
    }
}
