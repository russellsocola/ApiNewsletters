package socola.Russell.inmuebles.services;

import jakarta.transaction.Transactional;
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
    @Transactional
    public void agregar(Propiedad propiedad){
        propiedadRepository.agregar(propiedad);
    }
    @Transactional
    public void modificar(Propiedad propiedad, Long id){
        propiedad.setId(id);
        propiedadRepository.modificar(propiedad);
    }
    @Transactional
    public void eliminar(Long id){
        propiedadRepository.eliminar(id);
    }

    @Override
    public Propiedad get(Long id){
        return propiedadRepository.get(id);
    }

    @Override
    public List<Propiedad> getAll(){
        return propiedadRepository.getAll();
    }
}
