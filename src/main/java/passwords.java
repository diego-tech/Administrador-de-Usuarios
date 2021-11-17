
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class passwords {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Account> users = new ArrayList();
        int options;

        if (datainput.adminPassword()) {
            do {
                dataoutput.mainMenu();

                options = Integer.parseInt(entrada.next());

                switch (options) {
                case 1:
                    users.add(new Account(checkUserName.checkUserName(), checkEmail.checkEmail(),
                            checkPassword.checkPasswords(), checkAccountName.checkAccountName()));
                    dataoutput.userRegistered();
                    break;
                case 2:
                    if (users.isEmpty()) {
                        dataoutput.nonRegisteredUser();
                    } else {
                        dataoutput.usersAndAccounts();
                        dataoutput.showUsers(users);
                    }
                    break;
                case 3:
                    if (users.isEmpty()) {
                        dataoutput.nonRegisteredUser();
                    } else {
                        dataoutput.showUsersWithSameAccount(users, datainput.askForAccount());
                        dataoutput.usersWithSameAccount();
                    }
                    break;
                case 4:
                    if (users.isEmpty()) {
                        dataoutput.nonRegisteredUser();

                    } else {
                        dataoutput.usersAndAccounts();
                        dataoutput.showUserData(users, datainput.askForName());
                    }
                    break;
                case 5:
                    if (users.isEmpty()) {
                        dataoutput.nonRegisteredUser();
                    } else {
                        modifyAccount.removeAccount(users, datainput.askForName());
                    }

                    break;
                case 6:
                    if (users.isEmpty()) {
                        dataoutput.nonRegisteredUser();
                    } else {
                        modifyAccount.modifyEmail(users, datainput.askForEmail());
                    }
                    break;
                case 7:
                    if (users.isEmpty()) {
                        dataoutput.nonRegisteredUser();
                    } else {
                        modifyAccount.modifyPassword(users, datainput.askForName(), datainput.askForPassword());
                    }
                    break;
                case 8:
                    break;
                }
            } while (options != 8);
        } else {
            System.out.println("No tienes acceso al programa.");
        }

        entrada.close();
    }
}
