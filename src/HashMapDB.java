/**
 * Created by Omkar on 4/26/2108
 */
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public class HashMapDB extends UnicastRemoteObject implements Remoteitf {
    private static final long serialVersionUID = 0;
    private static final Map<String, List> namelist = new HashMap();
    private static final List<Person> num1 = new ArrayList();
    private static final List<Person> num2 = new ArrayList();
    private static final List<Person> num3 = new ArrayList();
    private static final List<Person> num4 = new ArrayList();
    private static final List<Person> num5 = new ArrayList();
    private static final List<Person> num6 = new ArrayList();
    private static final List<String> num7 = new ArrayList();
    private static final List<String> none = new ArrayList();

    HashMapDB () throws RemoteException {
        super();
        namelist.put("Omkar",num6);
        num6.add(new Person("Omkar","Desai"));
        num6.add(new Person("Omkar","Patel"));
        num6.add(new Person("Omkar","Shah"));
        namelist.put("Mark", num1);
        num1.add(new Person("Mark","Iskaros"));
        num1.add(new Person("Mark","Harris"));
        namelist.put("Stella", num2);
        num2.add(new Person("Stella","Pete"));
        num2.add(new Person("Stella","Huggins"));
        num2.add(new Person("Stella","logs"));
        namelist.put("Vishwa", num3);
        num3.add(new Person("Vishwa","Shah"));
        namelist.put("Jim", num4);
        num4.add(new Person("Jim","Cursio"));
        namelist.put("Shohaib", num5);
        num5.add(new Person("Shohaib","Ali"));
        none.add("Not found");

    }

    public List search(String q) throws RemoteException {
        List lst=namelist.get(q);
        if(lst!=null)
            return namelist.get(q);
        else return none;
    }

}

