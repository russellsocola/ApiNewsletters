package socola.Russell.inmuebles.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "url_final")
    private String urlfinal;

    @Column(name = "url_local")
    private String urllocal;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_galeria")
    private Galeria galeria;
}
