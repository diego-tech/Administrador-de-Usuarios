
/**
 *
 * @author diego
 */
public class Account {   
    
    //Atributos
    String name;
    String email;
    String password;
    String typeaccount;
    
    public Account(String name, String email, String password, String typeaccount) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.typeaccount = typeaccount;
    }

    @Override
    public String toString() {
        return name + " " + email + " " + password + " " + typeaccount;
    }    
}
