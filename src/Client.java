/**
 * Created by Omkar on 4/26/2108
 */
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        //======================================================
        String locator = "rmi://155.246.213.12:9999/myserver";
        //======================================================
        for(int j=10;j<100;) {
            try {
                System.out.println("search firstname:");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                Remoteitf rts = (Remoteitf) Naming.lookup(locator);
                for (int i = 0; i < rts.search(line).size(); i++) {
                    System.out.println((rts.search(line)).get(i));
                }
            } catch (Exception c) {
                System.out.println("Client error");
            }
        }
    }


}
