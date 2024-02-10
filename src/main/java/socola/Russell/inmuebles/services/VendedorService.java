package socola.Russell.inmuebles.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import socola.Russell.inmuebles.models.Vendedor;
import socola.Russell.inmuebles.repository.VendedorRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendedorService implements ServiceInterface<Vendedor> {

    @Autowired
    private VendedorRepository vendedorRepository;
    @Transactional
    public void agregar(Vendedor vendedor) {
        vendedorRepository.agregar(vendedor);
    }

    @Transactional
    public void modificar(Vendedor vendedor, Long id){
        vendedor.setId(id);
        vendedorRepository.modificar(vendedor);
    }

    @Transactional
    public void eliminar(Long id) {
        vendedorRepository.eliminar(id);
    }

    @Transactional
    public Vendedor get(Long id) {
        return vendedorRepository.get(id);
    }

    @Transactional
    public List<Vendedor> getAll() {
        return vendedorRepository.getAll();
    }
}
