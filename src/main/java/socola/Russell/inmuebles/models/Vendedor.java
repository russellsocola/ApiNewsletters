package socola.Russell.inmuebles.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name= "vendedor")
public class Vendedor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    @Column(name = "id")
    private Long id;

    @Column(name = "dni")
    private String dni;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(columnDefinition = "DATETIME",name = "fecha_creacion", updatable = false, nullable = false)
    private Date fecha_creacion;

    @Column(columnDefinition = "DATETIME",name = "fecha_eliminacion", updatable = false, nullable = false)
    private Date fecha_eliminacion;

}
