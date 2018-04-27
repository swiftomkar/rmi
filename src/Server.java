/**
 * Created by Omkar on 4/26/2108
 */

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        //=====================================================
        String locator="rmi://155.246.213.12:9999/myserver";
        //=====================================================
        try {
            LocateRegistry.createRegistry(9999);
            HashMapDB DB = new HashMapDB();
            Naming.rebind(locator, DB);
            System.out.println("Server started ");
            System.out.println(locator);
            System.out.println("Now please run Client.java");
        } catch (Exception s) {
            System.out.println("Server Error");
        }
    }
}
