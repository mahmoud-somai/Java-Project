//Interface Banque Avec Ses Opérations 
package bankAccount;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankInterface extends Remote {
    
    public String CreationCompte(String Cc, String password, boolean isComptepargne) throws RemoteException;
    public String Consulte(String Cc, String password) throws RemoteException;
    public String Deposer(String NumCompte, String MontantDeposer) throws RemoteException;
    public String Retrait(String Cc, String password, String MontantRetrait) throws RemoteException;
    public String Transferer(String originCc, String originPassword, String NumCompteDestinataire, String MontantTransferer) throws RemoteException;
    public String Historique(ClientInterface client, String NumCompte) throws RemoteException;
}
