
/**
 *
 * @author diego
 */
public class checkEmail {

    /**
     * Comprueba que los métodos son correctos, por lo cuál el email lo es.
     *
     * @return incorrectMail dependiendo de si está bien o no.
     */
    public static String checkEmail() {

        int posicionArroba = 0;
        int posicionPunto = 0;

        boolean incorrectMail = true;
        String email;
        String nombre;
        String dominio;
        String extension;

        do {
            dataoutput.emailMenu();
            email = datainput.askForEmail();

            if (comprobacionCaracteres(email, posicionArroba, posicionPunto)) {
                nombre = partirNombre(email);
                dominio = partirDominio(email);
                extension = partirExtension(email);

                if ((comprobacionDominio(dominio)) && (comprobacionNombre(nombre)) && (comprobacionExtension(extension)) && (comprobacionNumero(email)) && (comprobacionLetrasNumeros(nombre)) && (comprobacionExtensionLetras(extension))) {
                    incorrectMail = false;
                }
            }
        } while (incorrectMail);
        return email;
    }

    /**
     * Comprueba que el arroba y el punto están bien ordenados.
     *
     * @param email (Variable del email del usuario)
     * @param posicionArroba (Variable del Arroba)
     * @param posicionPunto (Variable del Punto)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean comprobacionCaracteres(String email, int posicionArroba, int posicionPunto) {
        posicionArroba = email.indexOf('@');
        posicionPunto = email.indexOf('.');

        if (posicionArroba < posicionPunto) {
            return true;
        } else {
            System.out.println("No puedes introducir el punto antes del arroba.");
            return false;
        }
    }

    /**
     * Comprueba que el email no comienza por un número.
     *
     * @param email (Variable del email del usuario)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean comprobacionNumero(String email) {
        if (Character.isDigit(email.charAt(0))) {
            System.out.println("El email no puede comenzar por un número");
            return false;
        }
        return true;
    }

    /**
     * Comprueba el cachito desde el comienzo del email hasta el arroba.
     *
     * @param email (Variable del email del usuario)
     * @return Retorna el substring del trozo.
     */
    public static String partirNombre(String email) {
        return email.substring(0, email.indexOf('@'));
    }

    /**
     * Comprueba el cachito desde el arroba del email hasta el punto.
     *
     * @param email (Variable del email del usuario)
     * @return Retorna el substring del trozo.
     */
    public static String partirDominio(String email) {
        return email.substring(email.indexOf('@') + 1, email.indexOf('.'));
    }

    /**
     * Comprueba el cachito desde el punto del email hasta el final.
     *
     * @param email (Variable del email del usuario)
     * @return Retorna el substring del trozo.
     */
    public static String partirExtension(String email) {
        return email.substring(email.indexOf('.'), email.length());
    }

    /**
     * Comprueba la longitud del nombre.
     *
     * @param nombre (Variable del cacho desde el principio al arroba del email)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean comprobacionNombre(String nombre) {
        if (nombre.length() <= 10) {
            return true;
        } else {
            System.out.println("El nombre solo puede contener 10 caracteres o menos.");
            return false;
        }
    }

    /**
     * Comprueba que el nombre solo contiene letras minúsculas, números y letras
     * mayúsculas
     *
     * @param nombre (Variable del cacho desde el principio al arroba del email)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean comprobacionLetrasNumeros(String nombre) {
        for (int i = 0; i < nombre.length(); i++) {
            char caracterActual = nombre.charAt(i);
            if (!((caracterActual >= 'a' && caracterActual <= 'z') || (caracterActual >= '0' && caracterActual <= '9') || (caracterActual >= 'A' && caracterActual <= 'Z'))) {
                System.out.println("El nombre solo puede contener letras y numeros.");
                return false;
            }
        }
        return true;
    }

    /**
     * Comprueba que el dominio solo contiene letras minúsculas.
     *
     * @param dominio (Variable del cacho desde el arroba al punto del email)
     * @return
     */
    public static boolean comprobacionDominio(String dominio) {
        for (int i = 0; i < dominio.length(); i++) {
            char caracterActual = dominio.charAt(i);
            if (caracterActual >= 'a' && caracterActual <= 'z') {
                return true;
            }
        }
        System.out.println("El dominio debe contener unicamente letras.");
        return false;
    }

    /**
     * Comprueba que la extensión sea de máximo 3 caracteres.
     *
     * @param extension (Variable del cacho desde el punto al final del email)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean comprobacionExtension(String extension) {
        if (extension.length() < 3) {
            System.out.println("La extensión tiene que tener mínimo 2 letras.");
            return false;
        } else if (extension.length() > 4) {
            System.out.println("La extensión no puede tener más de 3 letras.");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Comprueba que la extensión solo contenga letras minúsculas.
     *
     * @param extension (Variable del cacho desde el punto al final del email)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean comprobacionExtensionLetras(String extension) {
        for (int i = 0; i < extension.length(); i++) {
            char caracterActual = extension.charAt(i);
            if (caracterActual >= 'a' && caracterActual <= 'z') {
                return true;
            }
        }
        System.out.println("La extension debe contener unicamente letras.");
        return false;
    }
}
