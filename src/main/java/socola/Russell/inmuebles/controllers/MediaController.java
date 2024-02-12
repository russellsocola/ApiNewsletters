package socola.Russell.inmuebles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import socola.Russell.inmuebles.models.Media;
import socola.Russell.inmuebles.services.MediaService;

import java.util.List;

@RestController
public class MediaController implements InterfaceCrontroller<Media> {

    @Autowired
    private MediaService mediaService;
    @PostMapping("/api/media")
    public ResponseEntity<String> agregar(Media media) {
        try {
            mediaService.agregar(media);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar a la media : "+ ex.getMessage());
        }
    }

    @PutMapping("/api/media/{id}")
    public ResponseEntity<String> modificar(Media media, Long id) {
        try {
            mediaService.modificar(media,id);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al modificar la media: "+ ex.getMessage());
        }

    }

    @DeleteMapping("/api/media/{id}")
    public ResponseEntity<String> eliminar(Long id) {
        try {
            mediaService.eliminar(id);
            return ResponseEntity.ok().build();
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar de la media"+ ex.getMessage());
        }
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
