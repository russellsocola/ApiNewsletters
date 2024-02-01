package socola.Russell.newsletters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import socola.Russell.newsletters.models.Lead;
import socola.Russell.newsletters.repository.EmailRepository;
import socola.Russell.newsletters.validators.EmailValidator;

@RestController
public class NewslettersController {

    @Autowired
    private EmailRepository repositorioDeEmails;

    @PostMapping("/api/newsletters")
    public String registrar(@RequestBody Lead lead){

        String email = lead.getEmail();

        EmailValidator emailValidator = new EmailValidator();
        if (!emailValidator.esValido(email)){
            return "El email no es valido ";
        }
        repositorioDeEmails.guardarEmail(email);
        return "Email guardado " + email;
    }

    @PostMapping("/api/newsletters/unsuscribe")
    public String eliminar(@RequestBody Lead lead){
        String email = lead.getEmail();
        repositorioDeEmails.eliminarEmail(email);

        return "Email eliminado " + email;
    }

    @PostMapping("/api/newsletters/list")
    public String listar(@RequestBody Lead lead){
        String email = lead.getEmail();
        repositorioDeEmails.eliminarEmail(email);

        return "Email eliminado " + email;
    }
}
