
/**
 *
 * @author diego
 */
public class checkUserName {

    public static String checkUserName() {
        String name;

        boolean incorrectName = true;

        do {
            dataoutput.userMenu();
            name = datainput.askForName();
            if (checkLettersAndNumbers(name)) {
                incorrectName = false;
            }
        } while (incorrectName);
        return name;
    }

    /**
     * Comprueba que el nombre solo contiene letras minúsculas, números y letras
     * mayúsculas
     *
     * @param name (Variable del cacho desde el principio al arroba del email)
     * @return Retorna un true o false dependiendo de si es incorrecto o no.
     */
    public static boolean checkLettersAndNumbers(String name) {
        for (int i = 0; i < name.length(); i++) {
            char actualCharacter = name.charAt(i);
            if (!((actualCharacter >= 'a' && actualCharacter <= 'z')
                    || (actualCharacter >= 'A' && actualCharacter <= 'Z'))) {
                System.out.println("El nombre solo puede contener letras.");
                return false;
            }
        }
        return true;
    }
}
