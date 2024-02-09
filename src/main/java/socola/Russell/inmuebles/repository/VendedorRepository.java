package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import socola.Russell.inmuebles.models.Vendedor;
import socola.Russell.inmuebles.services.ServiceInterface;
import socola.Russell.inmuebles.services.VendedorService;

import java.util.List;

@Repository
@Transactional
public class VendedorRepository implements ServiceInterface<Vendedor> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void agregar(Vendedor objeto) {

    }

    @Override
    public void modificar(Vendedor objeto, Long id) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Vendedor get(Long id) {
        return null;
    }

    @Override
    public List<Vendedor> getAll() {

        String hql = "FROM Vendedor";
        return entityManager.createQuery(hql).getResultList();
    }
}
