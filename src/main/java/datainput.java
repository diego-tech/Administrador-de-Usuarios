
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
public class datainput {

    static Scanner entrada = new Scanner(System.in);

    static String askAdminPassword() {
        System.out.println("Introduce la contraseña del administrador: (admin)");
        String adminpassword = entrada.nextLine();
        return adminpassword;
    }

    public static boolean adminPassword() {
        String adminpassword = askAdminPassword();
        return "admin".equals(adminpassword);
    }

    static String askForName() {
        System.out.println("Nombre del usuario: ");
        String name = entrada.nextLine();
        return name;
    }

    static String askForEmail() {
        System.out.println("Email del usuario ");
        String email = entrada.nextLine();
        return email;
    }

    static String askForPassword() {
        System.out.println("Contraseña del usuario ");
        String password = entrada.nextLine();
        return password;
    }

    static String askForNumPassword() {
        System.out.println("Contraseña numérica del usuario ");
        String numpassword = entrada.nextLine();
        return numpassword;
    }

    static String askForAccount() {
        System.out.println("Que tipo de cuenta quieres: (Facebook, Instagram, Gmail, Banco, ...)");
        String account = entrada.nextLine();
        return account;
    }

    static String askForNewEmail() {
        System.out.println("Introduzca el nuevo email: ");
        String newemail = entrada.nextLine();
        return newemail;
    }

    static String askForNewPassword() {
        System.out.println("Introduzca la nueva contraseña: ");
        String newpassword = entrada.nextLine();
        return newpassword;
    }

    static String askForPasswordType() {
        System.out.println("¿Quieres contraseña numérica? (Si/No)");
        String passwordtype = entrada.nextLine();
        return passwordtype;
    }
}
