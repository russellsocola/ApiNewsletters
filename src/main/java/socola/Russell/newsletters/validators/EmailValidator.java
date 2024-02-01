package socola.Russell.newsletters.validators;

public class EmailValidator {
    public boolean esValido(String email) {
        if (!email.contains("@")){
            return false;
        } else if (!email.contains(".")) {
            return false;
        } else if (email.endsWith("@")) {
            return false;
        } else if (email.contains(" ")) {
            return false;
        } else if (email.length() > 255) {
            return false;
        }
        return true;
    }
}
