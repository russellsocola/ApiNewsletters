package socola.Russell.inmuebles.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import socola.Russell.inmuebles.models.Galeria;
import socola.Russell.inmuebles.models.Propiedad;
import socola.Russell.inmuebles.models.Vendedor;
import socola.Russell.inmuebles.repository.PropiedadRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PropiedadService implements ServiceInterface<Propiedad>{
    @Autowired
    private PropiedadRepository propiedadRepository;
    public void agregar(Propiedad propiedad){
        if (propiedad.getTitulo().equals("")){
        propiedadRepository.agregar(propiedad);
        }//llamar a la capa Repositorio;
    }


    public void modificar(Propiedad propiedad, Long id){
        //funcionalidad para modificar en la base de datos
        propiedadRepository.modificar(propiedad,id);
    }


    public void eliminar(Long id){
        propiedadRepository.eliminar(id);
    }

    public Propiedad get(Long id){
        Propiedad propiedad = new Propiedad();
        propiedad.setId(1L);
        propiedad.setId(1L);
        propiedad.setPrecio("300");
        propiedad.setTitulo("Casa en Miraflores");
        propiedad.setDescripcion("Hermosa casa de dos pisos");
        propiedad.setM2("1080");
        propiedad.setBano("3");
        propiedad.setAno("2015");
        propiedad.setHabitacion("3");
        propiedad.setZipcode("151003");
        propiedad.setDireccion("AV. Alcanfores");
        //https://www.google.com/maps/@-13.0798433,-76.381914,16.5z?entry=ttu
        propiedad.setLongitud("-13.0798433");
        propiedad.setLatitud("-76.381914");
        propiedad.setEstado("Disponible");
        propiedad.setDisponible(true);
        propiedad.setVendedor(new Vendedor());
        propiedad.setGaleria(new Galeria());
        propiedad.setFecha_creacion(LocalDate.now());
        propiedad.setFecha_eliminacion(LocalDate.now());

        return propiedad;
    }

    public List<Propiedad> getAll(){

        List<Propiedad> lista = new ArrayList<>();

        Propiedad propiedad = new Propiedad();

        propiedad.setId(1L);
        propiedad.setPrecio("300");
        propiedad.setTitulo("Casa en Miraflores");
        propiedad.setDescripcion("Hermosa casa de dos pisos");
        propiedad.setM2("1080");
        propiedad.setBano("3");
        propiedad.setAno("2015");
        propiedad.setHabitacion("3");
        propiedad.setZipcode("151003");
        propiedad.setDireccion("AV. Alcanfores");
        //https://www.google.com/maps/@-13.0798433,-76.381914,16.5z?entry=ttu
        propiedad.setLongitud("-13.0798433");
        propiedad.setLatitud("-76.381914");
        propiedad.setEstado("Disponible");
        propiedad.setDisponible(true);
        propiedad.setVendedor(new Vendedor());
        propiedad.setGaleria(new Galeria());
        propiedad.setFecha_creacion(LocalDate.now());
        propiedad.setFecha_eliminacion(LocalDate.now());

        lista.add(propiedad);

        Propiedad propiedad2 = new Propiedad();

        propiedad2.setId(2L);
        propiedad2.setPrecio("300");
        propiedad2.setTitulo("Casa en San Isidro");
        propiedad2.setDescripcion("Hermosa casa de dos pisos");
        propiedad2.setM2("1080");
        propiedad2.setBano("3");
        propiedad2.setAno("2015");
        propiedad2.setHabitacion("3");
        propiedad2.setZipcode("151003");
        propiedad2.setDireccion("AV. Roquefeller");
        //https://www.google.com/maps/@-13.0798433,-76.381914,16.5z?entry=ttu
        propiedad2.setLongitud("-13.0798433");
        propiedad2.setLatitud("-76.381914");
        propiedad2.setEstado("Disponible");
        propiedad2.setDisponible(true);
        propiedad2.setVendedor(new Vendedor());
        propiedad2.setGaleria(new Galeria());
        propiedad2.setFecha_creacion(LocalDate.now());
        propiedad2.setFecha_eliminacion(LocalDate.now());

        lista.add(propiedad2);

        return lista;
    }
}
