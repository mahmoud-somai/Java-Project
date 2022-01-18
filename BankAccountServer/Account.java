// Classe Compte Qui Contient les Operations 
package bankAccount;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Account {
    
    private final String Cc; //Cc :Compte Client
    private final String clientPassword;
    private final String NumCompte;
    private float Consulte;
    private boolean recoitHistorique;
    private final boolean isComptepargne;
    
    public Account(String Cc, String clientPassword, String NumCompte, boolean isComptepargne) {
    
        this.Cc = Cc;
        this.clientPassword = clientPassword;
        this.isComptepargne = isComptepargne;
        this.NumCompte = NumCompte;
        this.Consulte = 0.0f;
        this.recoitHistorique = false;
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, 'Le ' dd  MMM, yyyy ' à ' HH:mm:ss a ");
        LocalDateTime localDate=LocalDateTime.now();
        System.out.println("Date De Création  "+dtf.format(localDate));
        System.out.println("Compte Créer");
        System.out.println("Nom De Client: " + Cc);
        System.out.println("Numéro Du Compte: " + NumCompte);
        if (isComptepargne)
            System.out.println("Type Du Compte: Compte épargne");
        else
            System.out.println("Type Du Compte: Compte Courante");
        System.out.println("---------------------------------------------");
    }
    
    public String getCc() {return Cc;}
    public String getPassword() {return clientPassword;}
    public boolean recoitNotifications() {return recoitHistorique;}
    
    public synchronized float Consulte() {
      	LocalTime localDate=LocalTime.now();
    	DateTimeFormatter dtf=DateTimeFormatter.ofPattern(" HH:mm:ss a ");
    	
        
        System.out.println(dtf.format(localDate)+ "\n Le Compte Du Numéro   " + NumCompte + " Consulte: " + this.Consulte);
        System.out.println("---------------------------------------------");
        return Consulte;
    }
    
    public void Historique() {
    	LocalTime localDate=LocalTime.now();
    	DateTimeFormatter dtf=DateTimeFormatter.ofPattern(" HH:mm:ss a ");
    
        this.recoitHistorique = true;
        System.out.println(dtf.format(localDate)+ " \n Le Compte Du Numéro  " + NumCompte + " \n Historique : " );
        System.out.println("---------------------------------------------");
    }
    
    public synchronized void Deposer(float montant) {
    	LocalTime localDate=LocalTime.now();
    	DateTimeFormatter dtf=DateTimeFormatter.ofPattern(" HH:mm:ss a ");
    
        this.Consulte += montant;
        System.out.println(dtf.format(localDate)+ "\n Le Compte Du Numéro  " + this.NumCompte + " Deposer: " + montant);
        System.out.println("---------------------------------------------");
    }
    
    public synchronized void Retrait(float montant) {
    	LocalTime localDate=LocalTime.now();
    	DateTimeFormatter dtf=DateTimeFormatter.ofPattern(" HH:mm:ss a ");
    
        this.Consulte -= montant;
        System.out.println(dtf.format(localDate)+ " \n Le Compte Du Numéro  " + this.NumCompte + " Retrait : " + montant);
        System.out.println("---------------------------------------------");
    }
}
