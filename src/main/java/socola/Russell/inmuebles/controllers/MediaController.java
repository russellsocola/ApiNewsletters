package socola.Russell.inmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socola.Russell.inmuebles.models.Media;
import socola.Russell.inmuebles.services.MediaService;

import java.util.List;

@RestController
public class MediaController implements InterfaceCrontroller<Media> {

    @Autowired
    private MediaService mediaService;
    @PostMapping("/api/media")
    public void agregar(Media media) {
        mediaService.agregar(media);
    }

    @PutMapping("/api/media/{id}")
    public void modificar(Media media, Long id) {
        mediaService.modificar(media,id);
    }

    @DeleteMapping("/api/media/{id}")
    public void eliminar(Long id) {
        mediaService.eliminar(id);
    }

    @GetMapping("/api/media/{id}")
    public Media get(Long id) {
        return mediaService.get(id);
    }

    @GetMapping("/api/media")
    public List<Media> getAll() {
        return mediaService.getAll();
    }
}
