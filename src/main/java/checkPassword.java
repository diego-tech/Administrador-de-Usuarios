
/**
 *
 * @author diego
 */
public class checkPassword {

    public static String checkPasswords() {
        String answer = "Si";

        if (datainput.askForPasswordType().equals(answer)) {
            return checkNumPassword();
        } else {
            return checkPassword();
        }
    }

    /**
     * Comprueba que los métodos son correctos, por lo cuál la contraseña lo es.
     *
     * @return incorrectPassword dependiendo de si la contraseña es correcta o no.
     */
    public static String checkPassword() {
        char[] caracteresEspeciales = { 'º', 'ª', '!', '|', '"', '@', '·', '#', '$', '~', '%', '&', '¬', '/', '(', ')',
                '=', '?', '¿', '¡', '^', '*', '+', '[', ']', '¨', '{', '}', '-', '<', '>', '.', '_', ';', ',', ':' };

        boolean incorrectPassword = true;
        String password;

        do {
            dataoutput.passwordMenu();
            password = datainput.askForPassword();
            if (userPassword(password)) {
                if ((containsLetter(password)) && (containsNumbers(password)) && (containsUppercase(password))
                        && (containsEspecialCharacters(password, caracteresEspeciales))) {
                    incorrectPassword = false;
                }
            }
        } while (incorrectPassword);
        return password;
    }

    public static String checkNumPassword() {
        String password;

        boolean incorrectNumPassword = true;

        do {
            dataoutput.numpasswordMenu();
            password = datainput.askForNumPassword();
            if (containsNumbers(password)) {
                incorrectNumPassword = false;
            }
        } while (incorrectNumPassword);
        return password;
    }

    /**
     * Comprueba que la contraseña tenga mínimo 8 caracteres.
     *
     * @param userpassword (Variable de la contraseña del usuario)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean userPassword(String userpassword) {
        if (userpassword.length() >= 8) {
            return true;
        } else {
            System.out.println("La contraseña debe de tener mínimo 8 caracteres.");
            return false;
        }
    }

    /**
     * Comprueba que la contraseña contiene letras minúsculas.
     *
     * @param userpassword (Variable de la contraseña del usuario)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean containsLetter(String userpassword) {
        for (int i = 0; i < userpassword.length(); i++) {
            char actualCharacter = userpassword.charAt(i);
            if (actualCharacter >= 'a' && actualCharacter <= 'z') {
                return true;
            }
        }
        System.out.println("La Contraseña debe de contener Letras.");
        return false;
    }

    /**
     * Comprueba que la contraseña contenga números.
     *
     * @param userpassword (Variable de la contraseña del usuario)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean containsNumbers(String userpassword) {
        for (int i = 0; i < userpassword.length(); i++) {
            char actualCharacter = userpassword.charAt(i);
            if ((actualCharacter >= '0' && actualCharacter <= '9')) {
                return true;
            }
        }
        System.out.println("La Contraseña debe contener Números");
        return false;
    }

    /**
     * Comprueba que la contraseña contiene letras mayúsculas.
     *
     * @param userpassword (Variable de la contraseña del usuario)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean containsUppercase(String userpassword) {
        for (int i = 0; i < userpassword.length(); i++) {
            char actualCharacter = userpassword.charAt(i);
            if (actualCharacter >= 'A' && actualCharacter <= 'Z') {
                return true;
            }
        }
        System.out.println("La Contraseña debe contener Letras Mayúsculas");
        return false;
    }

    /**
     * Comprueba que la contraseña contiene caracteres especiales.
     *
     * @param userpassword         (Variable de la contraseña del usuario)
     * @param caracteresEspeciales (Array en el que se encuentra todos los
     *                             caracteres especiales válidos)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean containsEspecialCharacters(String userpassword, char[] caracteresEspeciales) {
        for (int i = 0; i < caracteresEspeciales.length; i++) {
            char actualCharacter = caracteresEspeciales[i];
            for (int j = 0; j < userpassword.length(); j++) {
                if (userpassword.charAt(j) == actualCharacter) {
                    return true;
                }
            }
        }
        System.out.println("La contraseña debe contener Caracteres Especiales");
        return false;
    }
}
