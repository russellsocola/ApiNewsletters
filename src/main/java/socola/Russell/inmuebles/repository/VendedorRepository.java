package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import socola.Russell.inmuebles.models.Vendedor;

import java.util.List;

@Repository
@Transactional
public class VendedorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void agregar(Vendedor vendedor) {
        entityManager.persist(vendedor);
    }

    @Transactional
    public void modificar(Vendedor vendedor) {
        entityManager.merge(vendedor);
    }

    @Transactional
    public void eliminar(Long id) {
        Vendedor vendedor = entityManager.find(Vendedor.class,id);
        if (vendedor != null){
            entityManager.remove(vendedor);
        }else {
            throw new EntityNotFoundException("No se encuentra el Vendedor con el ID: "+ id);
        }
    }

    @Transactional
    public Vendedor get(Long id) {
        return entityManager.find(Vendedor.class,id);
    }

    @Transactional
    public List<Vendedor> getAll() {
        String hql = "FROM Vendedor";
        return entityManager.createQuery(hql, Vendedor.class).getResultList();
    }
}
