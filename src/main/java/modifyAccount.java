
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class modifyAccount {
    
    static void removeAccount(ArrayList<Account> users, String name){
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).name.equals(name)){
                users.remove(i);
            }
        }
    }

    static void modifyEmail(ArrayList<Account> users, String email) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).email.equals(email)) {
                users.set(i, new Account(users.get(i).name, checkEmail.checkEmail(), users.get(i).password, users.get(i).typeaccount));
                dataoutput.userModify();
            }else{
                dataoutput.nonRegisteredUser();
            }
        }
    }

    static void modifyPassword(ArrayList<Account> users, String name, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).password.equals(password) && users.get(i).name.equals(name)) {
                users.set(i, new Account(users.get(i).name, users.get(i).email, checkPassword.checkPasswords(), users.get(i).typeaccount));
                dataoutput.passwordModify();
            } else{
                dataoutput.nonRegisteredUser();
            }
        }
    }
}
