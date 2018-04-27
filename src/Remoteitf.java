/**
 * Created by Omkar on 4/26/2108
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Remoteitf extends Remote {
    List search(String s)throws RemoteException;
}
