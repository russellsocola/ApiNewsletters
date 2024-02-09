package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import socola.Russell.inmuebles.models.Propiedad;
import socola.Russell.inmuebles.services.ServiceInterface;

import java.util.List;

@Repository
@Transactional
public class PropiedadRepository implements ServiceInterface<Propiedad> {
    @PersistenceContext
    private EntityManager entityManager;

    public void agregar(Propiedad propiedad) {
        entityManager.persist(propiedad);
    }

    public void modificar(Propiedad propiedad, Long id) {
        Propiedad editarPropiedad = entityManager.find(Propiedad.class, id);
        if (editarPropiedad != null){
            editarPropiedad.setPrecio(propiedad.getPrecio());
            editarPropiedad.setTitulo(propiedad.getTitulo());
            editarPropiedad.setDescripcion(propiedad.getDescripcion());
            editarPropiedad.setM2(propiedad.getM2());
            editarPropiedad.setBano(propiedad.getBano());
            editarPropiedad.setAno(propiedad.getAno());
            editarPropiedad.setHabitacion(propiedad.getHabitacion());
            editarPropiedad.setZipcode(propiedad.getZipcode());
            editarPropiedad.setDireccion(propiedad.getDireccion());
            editarPropiedad.setLatitud(propiedad.getLatitud());
            editarPropiedad.setLongitud(propiedad.getLongitud());
            editarPropiedad.setEstado(propiedad.getEstado());
            editarPropiedad.setEstado(String.valueOf(propiedad.getDisponible()));

            entityManager.merge(editarPropiedad);
        }else {
            throw new EntityNotFoundException("No se encuentra la Galeria con ID :" + id);
        }

    }
    public void eliminar(Long id) {
        String hql = "DELETE FROM galeria WHERE id = :id";
        entityManager.createQuery(hql).setParameter("id",id).executeUpdate();
    }

    @Transactional
    public Propiedad get(Long id) {
        return null;
    }

    @Transactional
    public List<Propiedad> getAll() {

        String hql = "FROM Propiedad";
        return entityManager.createQuery(hql).getResultList();
    }
}
