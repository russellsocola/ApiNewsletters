package socola.Russell.inmuebles.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "propiedad")
public class Propiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "precio")
    private String precio;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "m2")
    private String m2;

    @Column(name = "bano")
    private String bano;

    @Column(name = "ano")
    private String ano;

    @Column(name = "habitacion")
    private String habitacion;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "latitud")
    private String latitud;

    @Column(name = "longitud")
    private String longitud;

    @Column(name = "estado")
    private String estado;

    @Column(name = "disponible")
    private Boolean disponible;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_galeria")
    private Galeria galeria;

    @Column(columnDefinition = "DATETIME", name = "fecha_creacion", updatable = false, nullable = false)
    private LocalDate fecha_creacion;

    @Column(columnDefinition = "DATETIME", name = "fecha_eliminacio", updatable = false, nullable = false)
    private LocalDate fecha_eliminacion;
}
