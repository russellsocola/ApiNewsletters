package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import socola.Russell.inmuebles.models.Media;

import java.util.List;

@Repository
@Transactional
public class MediaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void agregar(Media media) {
        entityManager.persist(media);
    }
    @Transactional
    public void modificar(Media media) {
        entityManager.merge(media);
    }
    @Transactional
    public void eliminar(Long id) {
        Media media = entityManager.find(Media.class,id);
        if (media != null){
            entityManager.remove(media);
        }else {
            throw new EntityNotFoundException("No se encuentra la Media con el ID: "+ id);
        }
    }
    @Transactional
    public Media get(Long id) {
        return entityManager.find(Media.class,id);
    }
    @Transactional
    public List<Media> getAll() {

        String hql = "FROM Media";
        return entityManager.createQuery(hql,Media.class).getResultList();
    }
}
