package socola.Russell.inmuebles.repository;

import jakarta.persistence.EntityManager;
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
    EntityManager entityManager;

    public void agregar(Propiedad propiedad) {
        String sqlQuery= "INSERT INTO inmuhebles.propiedad (bano, descripcion, direccion, disponible, estado, fecha_creacion, fecha_eliminacio, habitacion, latitud, longitud, m2, nombre, precio, titulo, zipcode, id_galeria, id_vendedor, ano) \n" +
                "VALUES ('2', 'Apartamento espacioso en el centro de la ciudad', 'Calle Principal 123', 1, 'Activo', '2024-02-05 12:00:00', '2024-02-05 12:00:00', '3', '40.7128', '-74.0060', '100', 'Apartamento Ejemplo', '200000', 'Apartamento en el Centro', '12345', 1, 1, '2000')\n";
        entityManager.createNativeQuery(sqlQuery).setParameter(1, propiedad).executeUpdate();


        /*String sqlconsult = "INSERT INTO Lead (email) VALUES (?)";
        baseDeDatos.createNativeQuery(sqlconsult).setParameter(1, emailDeUsuario).executeUpdate();*/
    }

    public void modificar(Propiedad propiedad, Long id) {

    }
    public void eliminar(Long id) {

    }

    @Transactional
    public Propiedad get(Long id) {
        return null;
    }

    @Transactional
    public List<Propiedad> getAll() {
        return null;
    }
}
