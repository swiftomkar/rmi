/**
 * Created by Omkar on 4/26/2108
 */
import java.io.Serializable;

public class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String firstname;
    private String lastname;

    Person(String myfirstname, String mylastname){
        this.firstname = myfirstname;
        this.lastname = mylastname;
    }
    public String toString() {
        return firstname +" "+ lastname;
    }
}
