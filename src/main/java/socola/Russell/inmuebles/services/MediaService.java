package socola.Russell.inmuebles.services;

import jakarta.transaction.Transactional;
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
    @Transactional
    public void agregar(Media media) {
        mediaRepository.agregar(media);
    }

    @Transactional
    public void modificar(Media media, Long id) {
        media.setId(id);
        mediaRepository.modificar(media);
    }

    @Transactional
    public void eliminar(Long id) {
        mediaRepository.eliminar(id);
    }

    @Transactional
    public Media get(Long id) {
        return mediaRepository.get(id);
    }

    @Transactional
    public List<Media> getAll() {
        return mediaRepository.getAll();
    }
}
