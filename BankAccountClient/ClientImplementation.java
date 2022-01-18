//Implémentation client

package bankAccount;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

public class ClientImplementation extends UnicastRemoteObject implements ClientInterface {
    
    private ClientGUI gui;
    
    public ClientImplementation (ClientGUI gui) throws RemoteException {
    
        this.gui = gui;
    }
    
    public void showNotification(String message) throws RemoteException {
    
        JOptionPane.showMessageDialog(gui, message);
    }
}
