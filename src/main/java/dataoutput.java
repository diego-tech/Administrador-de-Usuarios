
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diego
 */
public class dataoutput {

    static Scanner entrada = new Scanner(System.in);

    static int showUsers(ArrayList<Account> users) {
        for (int i = 0; i < users.size(); i++) {
            Account user = users.get(i);
            System.out.println(i + 1 + " - Nombre: " + user.name + "; Email: " + user.email + "; Contraseña: " + user.password + "; Cuenta: " + user.typeaccount);
        }
        return -1;
    }

    static void showUserData(ArrayList<Account> users, String name) {
        int position = -1;
        for (int i = 0; i < users.size(); i++) {
            Account user = users.get(i);
            if (user.name.equals(name)) {
                System.out.println("··················");
                System.out.println("DATOS DEL USUARIO");
                System.out.println("··················");
                System.out.println(i + 1 + " - Nombre: " + user.name + "; Email: " + user.email + "; Contraseña:" + user.password + "; Cuenta: " + user.typeaccount);
                position++;
            }
        }
        if (position == -1) {
            System.out.println("Este usuario no está registrado.");
            System.out.println("-------------------------------");
        }
    }

    static void showUsersWithSameAccount(ArrayList<Account> users, String typeaccount) {
        int position = -1;
        for (int i = 0; i < users.size(); i++) {
            Account account = users.get(i);
            if (account.typeaccount.equals(typeaccount)) {
                System.out.println(i + 1 + " - Nombre: " + account.name + "; Email: " + account.email + "; Contraseña:" + account.password + "; Cuenta: " + account.typeaccount);
                position++;
            }
        }
        if (position == -1) {
            System.out.println("Este tipo de cuenta no está registrada.");
            System.out.println("---------------------------------------");
        }
    }

    static void mainMenu() {
        System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-");
        System.out.println("1 - Añadir Usuarios.");
        System.out.println("2 - Mostrar todos los Usuarios Existentes.");
        System.out.println("3 - Mostrar los usuarios con el mismo tipo de cuenta.");
        System.out.println("4 - Datos de un Usuario.");
        System.out.println("5 - Eliminar Usuarios.");
        System.out.println("6 - Modificar Email del Usuario.");
        System.out.println("7 - Modificar Contraseña.");
        System.out.println("8 - Salir.");
        System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-");
    }

    static void userMenu() {
        System.out.println("El nombre de usuario debe contener:");
        System.out.println(" - Debe contener únicamente letras.");
        System.out.println("·············································");
    }

    static void emailMenu() {
        System.out.println("El email debe contener:");
        System.out.println(" - Tener la forma: nombre@dominio.ext");
        System.out.println(" - No puede comenzar por un número.");
        System.out.println(" - El nombre tiene que ser como máximo 10 caracteres.");
        System.out.println(" - El dominio solo puede contener letras.");
        System.out.println(" - Debe tener un @ y un . obligatoriamente.");
        System.out.println(" - La extension solo puede contener letras y debe ser máximo 3 caracteres.");
        System.out.println("·············································");
    }

    static void passwordMenu() {
        System.out.println("La contraseña debe contener:");
        System.out.println(" - Mínimo 8 caracteres.");
        System.out.println(" - Mínimo debe contener una letra minúscula.");
        System.out.println(" - Mínimo debe contener una letra mayúscula.");
        System.out.println(" - Mínimo debe contener un número.");
        System.out.println(" - Mínimo debe contener un caracter especial.");
        System.out.println("·············································");
    }

    static void numpasswordMenu() {
        System.out.println("La contraseña numérica debe contener:");
        System.out.println(" - Unicamente carácteres numéricos.");
        System.out.println("·············································");
    }

    static void typeaccountMenu() {
        System.out.println("El tipo de cuenta debe contener:");
        System.out.println(" - Debe contener únicamente letras.");
        System.out.println("·············································");
    }

    static void nonRegisteredUser() {
        System.out.println("No existen usuarios registrados");
        System.out.println("·······························");
    }

    static void userRegistered() {
        System.out.println("····················");
        System.out.println("USUARIO REGISTRADO :)");
        System.out.println("·····················");
    }

    static void usersAndAccounts() {
        System.out.println("USUARIOS Y CONTRASEÑAS");
        System.out.println("······················");
    }

    static void usersWithSameAccount() {
        System.out.println("USUARIOS CON EL MISMO TIPO DE CUENTA");
        System.out.println("··················");
    }

    static void userModify() {
        System.out.println("EMAIL MODIFICAD0 :)");
        System.out.println("··················");
    }

    static void passwordModify() {
        System.out.println("CONTRASEÑA MODIFICADA :)");
        System.out.println("··················");
    }
}
