//implementation de l'interface Banque 

 
package bankAccount;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Random;

public class BankImplementation extends UnicastRemoteObject implements BankInterface {
    
    private HashMap<String, Account> compteMap1;
    private HashMap<String, Account> compteMap2;
    private HashMap<Account, ClientInterface> clientNotifiee;
    
   public BankImplementation() throws RemoteException {
   
       this.compteMap1 = new HashMap<>();
       this.compteMap2 = new HashMap<>();
       this.clientNotifiee = new HashMap<>();
   }
   
   public String CreationCompte(String Cc, String password, boolean isComptepargne) throws RemoteException {
       
       if (compteMap2.containsKey(Cc))
           return " Client Déja inscrit ";
       
       Random r = new Random();
       String NumCompte = String.format("%05d", r.nextInt(10000));
       while (compteMap1.containsKey(NumCompte)) 
    	   NumCompte = String.format("%05d", r.nextInt(10000));
       
       Account Compte = new Account(Cc, password, NumCompte, isComptepargne);
       
       compteMap1.put(NumCompte, Compte);
       compteMap2.put(Cc, Compte);
       
       return "Succès !!";
   }
   
   public String Consulte(String Cc, String password) throws RemoteException {
       
       Account Cpt = (Account) compteMap2.get(Cc);
       if (Cpt != null) {
           
           if (Cpt.getPassword().equals(password))
               return String.valueOf(Cpt.Consulte());
            else
               return "Mot De Passe Incorrect";
       }else
           return "Introuvable";
   }
   
   public String Deposer(String NumCompte, String MontantDeposer) throws RemoteException {
   
       Account Cpt = (Account) compteMap1.get(NumCompte);
       if (Cpt != null) {
           
    	   Cpt.Deposer(Float.parseFloat(MontantDeposer));
           if (Cpt.recoitNotifications())
               clientNotifiee.get(Cpt).Notifications("Reçoit De Dépot :  " + MontantDeposer);
           return "Succès !!";
           
       }else
           return "Introuvable";
   }
   
   public String Retrait(String Cc, String password, String MontantRetrait) throws RemoteException {
   
       Account Cpt = (Account) compteMap2.get(Cc);
       if (Cpt != null) {
           
           if (Cpt.getPassword().equals(password)) {
           
        	   Cpt.Retrait(Float.parseFloat(MontantRetrait));
               return "Succès !!";
           }
           else
               return "Mot De Passe Incorrect";
       }else
           return "Introuvable";
   }
   
   public String Transferer(String originCc, String originPassword, String NumCompteDestinataire, String MontantTransferer) throws RemoteException {
   
       Account CompteOrigin = (Account) compteMap2.get(originCc);
       Account CompteDestinataire = (Account) compteMap1.get(NumCompteDestinataire);
       if (CompteOrigin != null && CompteDestinataire != null) {
           
           if (CompteOrigin.getPassword().equals(originPassword)) {
           
               if (CompteDestinataire.recoitNotifications())
                    clientNotifiee.get(CompteDestinataire).Notifications("Reçoit De Transfert :  " + MontantTransferer);
               
               System.out.println("Le Client * "+originCc+ " * fait  un tranfert De  "+MontantTransferer +" Dt vers le Client De Numéro "+NumCompteDestinataire+ "\n");
               CompteOrigin.Retrait(Float.parseFloat(MontantTransferer));
               CompteDestinataire.Deposer(Float.parseFloat(MontantTransferer));
               return "Succès !!";
           }
           else
               return "Mot De Passe Incorrect";
       }else
           return "Introuvable";
   }
   
   public String Historique(ClientInterface client, String NumCompte) throws RemoteException {
   
       Account Cpt = (Account) compteMap1.get(NumCompte);
       if (Cpt != null) {
           
           Cpt.Historique();
           clientNotifiee.put(Cpt, client);
           return "Succès !!";
           
       }else
           return "Introuvable";
   }
}
