package socola.Russell.inmuebles.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import socola.Russell.inmuebles.models.Media;
import socola.Russell.inmuebles.repository.MediaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MediaService implements ServiceInterface<Media> {

    @Autowired
    private MediaRepository mediaRepository;
    @Override
    public void agregar(Media media) {
        mediaRepository.agregar(media);
    }

    @Override
    public void modificar(Media media, Long id) {
        mediaRepository.modificar(media,id);
    }

    @Override
    public void eliminar(Long id) {
        mediaRepository.eliminar(id);
    }

    @Override
    public Media get(Long id) {
        Media media = new Media();
        media.setId(1L);
        media.setNombre("Archivito");
        media.setUrllocal("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.archdaily.pe%2Fpe%2F979044%2Fcasa-de-casas-yuso&psig=AOvVaw2ZxSoD9VfyCRUKxHjfy_v5&ust=1707500104541000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCLD3sd6jnIQDFQAAAAAdAAAAABAE");

        return media;
    }

    @Override
    public List<Media> getAll() {
        List<Media> lista = new ArrayList<>();
        Media media = new Media();
        media.setId(1L);
        media.setNombre("Archivito");
        media.setUrllocal("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.archdaily.pe%2Fpe%2F979044%2Fcasa-de-casas-yuso&psig=AOvVaw2ZxSoD9VfyCRUKxHjfy_v5&ust=1707500104541000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCLD3sd6jnIQDFQAAAAAdAAAAABAE");
        lista.add(media);

        Media media2 = new Media();
        media2.setId(1L);
        media2.setNombre("Archivito");
        media2.setUrllocal("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.archdaily.pe%2Fpe%2F979044%2Fcasa-de-casas-yuso&psig=AOvVaw2ZxSoD9VfyCRUKxHjfy_v5&ust=1707500104541000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCLD3sd6jnIQDFQAAAAAdAAAAABAE");
        lista.add(media2);
        return lista;
    }
}
