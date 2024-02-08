package socola.Russell.inmuebles.services;

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
    @Override
    public void agregar(Vendedor vendedor) {
        vendedorRepository.agregar(vendedor);
    }

    @Override
    public void modificar(Vendedor vendedor, Long id) {
        vendedorRepository.modificar(vendedor,id);
    }

    @Override
    public void eliminar(Long id) {
        vendedorRepository.eliminar(id);
    }

    @Override
    public Vendedor get(Long id) {
        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setDni("2345678");
        vendedor.setApellido("Socola Reyes");
        vendedor.setNombre("Russell Nahum");
        vendedor.setEmail("russell@gmail.com");
        vendedor.setTelefono("+51 4567890");
        return vendedor;
        //return vendedorRepository.get(id);
    }

    @Override
    public List<Vendedor> getAll() {
        List<Vendedor> lista = new ArrayList<>();

        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setDni("2345678");
        vendedor.setApellido("Socola Reyes");
        vendedor.setNombre("Russell Nahum");
        vendedor.setEmail("russell@gmail.com");
        vendedor.setTelefono("+51 4567890");

        lista.add(vendedor);

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setId(1L);
        vendedor2.setDni("2345678");
        vendedor2.setApellido("Socola Reyes");
        vendedor2.setNombre("Russell Nahum");
        vendedor2.setEmail("russell@gmail.com");
        vendedor2.setTelefono("+51 4567890");
        lista.add(vendedor2);

        return lista;
    }
}
