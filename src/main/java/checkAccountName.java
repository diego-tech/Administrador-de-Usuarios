
/**
 *
 * @author diego
 */
public class checkAccountName {
      public static String checkAccountName() {
        String name;

        boolean incorrectName = true;

        do {
            dataoutput.typeaccountMenu();
            name = datainput.askForAccount();
            if (comprobacionLetrasNumeros(name)) {
                incorrectName = false;
            }
        } while (incorrectName);
        return name;
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
            if (!((caracterActual >= 'a' && caracterActual <= 'z') || (caracterActual >= 'A' && caracterActual <= 'Z'))) {
                System.out.println("El nombre solo puede contener letras.");
                return false;
            }
        }
        return true;
    }
}
