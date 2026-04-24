import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ModImpl extends UnicastRemoteObject implements ModInterface {
    public ModImpl() throws RemoteException {
        super();
    }

    public int mod(int a, int b) throws RemoteException {
        return a % b;
    }
}