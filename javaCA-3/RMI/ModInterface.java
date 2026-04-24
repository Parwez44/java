import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ModInterface extends Remote {
    int mod(int a, int b) throws RemoteException;
}