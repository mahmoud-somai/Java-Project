//Interface Client 
package bankAccount;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInterface extends Remote {
    
    public void Notifications(String message) throws RemoteException;
}
