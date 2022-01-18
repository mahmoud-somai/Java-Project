// ***Classe SERVEUR***


package bankAccount;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    
    public static void main(String[] args) {
    
        try {
            
            BankInterface banque = new BankImplementation();
            
            Registry Registry = LocateRegistry.createRegistry(1099);
            Registry.rebind("Bank", banque);
            System.out.println("Server is Connected \n");
            
        } catch (RemoteException ex) {
    /**/        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
