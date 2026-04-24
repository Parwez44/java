import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatApp extends Remote {
    String getResponse(String message) throws RemoteException;
}