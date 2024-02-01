package socola.Russell.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepository {

    @PersistenceContext
    private EntityManager baseDeDatos;
    @Query(nativeQuery = true)
    @Transactional
    public void guardarEmail(String emailDeUsuario){
        String sqlconsult = "INSERT INTO Lead (email) VALUES (?)";
        baseDeDatos.createNativeQuery(sqlconsult).setParameter(1, emailDeUsuario).executeUpdate();
    }
    @Transactional
    public void eliminarEmail(String emailDeUsuario){
        String hqlconsult = "DELETE FROM Lead WHERE email = :paramEmail";
        baseDeDatos.createQuery(hqlconsult)
                .setParameter("paramEmail", emailDeUsuario).executeUpdate();

    }
}
