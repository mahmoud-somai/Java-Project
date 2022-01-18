// GUI représentant l'interface client
package bankAccount;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ClientGUI extends javax.swing.JFrame {

	
    public ClientGUI() {
        
        try {
            
            client = new ClientImplementation(this);
            
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            this.bank = (BankInterface) registry.lookup("Bank");
            
            registry.rebind("Client", client);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
    }

  //Créer les interfaces pour l'utilisateurs
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panelCreationCompte = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        panelConsultation = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        panelTransfert = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPasswordField4 = new javax.swing.JPasswordField();
        panelRetrait = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPasswordField3 = new javax.swing.JPasswordField();
        panelDeposer = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        panelHistorique = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        
// pour la fermeture on clic sur fermer
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
        
//setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Bank");
        
//"background" de l'application
        jPanel1.setBackground(new java.awt.Color(0, 139, 139));
        
//"background" pour la partie des boutons a gauche 
        jPanel2.setBackground(new java.awt.Color(0, 139, 139)); 

//Panel 2
        
// Bouton Consulter
        jButton1.setText("Consulter le solde"); 
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

//bouton transfert  avec sa méthode
        
        jButton2.setText("Effectuer le transfert");  
        jButton2.addActionListener(new java.awt.event.ActionListener() { 
// Méthode De La Bouton "effectuer de transfert" pour deplacer vers l'interface de transfert	
            public void actionPerformed(java.awt.event.ActionEvent evt) {   
                jButton2ActionPerformed(evt);
            }
        });


        jButton3.setText("Retrait ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Déposer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setText("Historique Du Compte");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

//Créer un GroupLayout
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);  
//associer le GroupLayout a Panel2
        jPanel2.setLayout(jPanel2Layout);
//affecter un groupement horizontale pour Panel2
        jPanel2Layout.setHorizontalGroup(
//rendre les elements de GroupLayout De Panel2 parallèle   et les element etre en meme taille , meme demension et parralele entre eux
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
//ajouter un espace entre l'extrimité de panel2 a gauche et les boutons    
            		.addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
// ajouter les boutons qui sont les elements de panel2 
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
// ajouter des espaces entre pour la panel2 a droite
                .addGap(21, 21, 21))
        );
        
 //affecter un groupement verticale pour Panel2       
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
 // ajouter des espaces verticales entre les boutons
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

//Panel3   
        
       
// jPanel3.setBackground(new java.awt.Color(153, 255, 102));
// affecter une bordure a panel3
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.red));
        jPanel3.setLayout(new java.awt.CardLayout());
        
//affecter un background a panel3
        panelCreationCompte.setBackground(new java.awt.Color(100, 149, 237));
        
//affecter le Fond Comic Sans MS pour le texte
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        
// affecter le couleur blanc pour le texte
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    
        jLabel1.setText("Titulaire du compte :");

  /*    jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
*/
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mot de passe");

        jButton5.setText("Créer Une Compte");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type De Compte :");

 // ajouter une liste déroulante 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Compte Courante","compte épargne" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        
 //Groupement des elements Panel3 ** Create Account ** et le mettre en une bonne positions pour l'utilisateur
       
        javax.swing.GroupLayout panelCreationCompteLayout = new javax.swing.GroupLayout(panelCreationCompte);
        panelCreationCompte.setLayout(panelCreationCompteLayout);
        panelCreationCompteLayout.setHorizontalGroup(
            panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreationCompteLayout.createSequentialGroup()
                .addGroup(panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreationCompteLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton5))
                    .addGroup(panelCreationCompteLayout.createSequentialGroup()
                        .addGap(22, 34, 34)
                        .addGroup(panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCreationCompteLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCreationCompteLayout.createSequentialGroup()
                                .addGroup(panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelCreationCompteLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(105, 105, 105))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreationCompteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelCreationCompteLayout.setVerticalGroup(
            panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreationCompteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelCreationCompteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton5)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jPanel3.add(panelCreationCompte, "card2");
        
//panel  de consultation du solde  
        panelConsultation.setBackground(new java.awt.Color(100, 149, 237));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Titulaire De Compte");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mot De Passe");

        jButton6.setText("Consulter Solde");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Solde Du Compte:");

        javax.swing.GroupLayout panelConsultationLayout = new javax.swing.GroupLayout(panelConsultation);
        panelConsultation.setLayout(panelConsultationLayout);
        panelConsultationLayout.setHorizontalGroup(
            panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultationLayout.createSequentialGroup()
                .addGroup(panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultationLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton6))
                    .addGroup(panelConsultationLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConsultationLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(67, 67, 67)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConsultationLayout.createSequentialGroup()
                                .addGroup(panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addGroup(panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(jTextField2))))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelConsultationLayout.setVerticalGroup(
            panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultationLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton6)
                .addGap(57, 57, 57)
                .addGroup(panelConsultationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jPanel3.add(panelConsultation, "card2");

    
        panelTransfert.setBackground(new java.awt.Color(100, 149, 237));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Titulaire De Compte");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mot De Passe ");

        jButton7.setText("Consulter Solde");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Solde De Compte:");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Compte du bénéficiaire");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Montant à transférer");

        jButton8.setText("transferer");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTransfertLayout = new javax.swing.GroupLayout(panelTransfert);
        panelTransfert.setLayout(panelTransfertLayout);
        panelTransfertLayout.setHorizontalGroup(
            panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransfertLayout.createSequentialGroup()
                .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransfertLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTransfertLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelTransfertLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTransfertLayout.createSequentialGroup()
                                .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(28, 28, 28)
                                .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField4)))))
                    .addGroup(panelTransfertLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButton7)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panelTransfertLayout.setVerticalGroup(
            panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransfertLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton7)
                .addGap(40, 40, 40)
                .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelTransfertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.add(panelTransfert, "card2");

        panelRetrait.setBackground(new java.awt.Color(100, 149, 237));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Titulaire du compte :");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mot De Passe:");

        jButton10.setText("Consulter Solde");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Solde De Compte :");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Montant à Retrait:");

        jButton11.setText("Retrait");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRetraitLayout = new javax.swing.GroupLayout(panelRetrait);
        panelRetrait.setLayout(panelRetraitLayout);
        panelRetraitLayout.setHorizontalGroup(
            panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRetraitLayout.createSequentialGroup()
                .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRetraitLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRetraitLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRetraitLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRetraitLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton11))
                                    .addGroup(panelRetraitLayout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(89, 89, 89))
                            .addGroup(panelRetraitLayout.createSequentialGroup()
                                .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(33, 33, 33)
                                .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13)
                                    .addComponent(jPasswordField3)))))
                    .addGroup(panelRetraitLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton10)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panelRetraitLayout.setVerticalGroup(
            panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRetraitLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton10)
                .addGap(27, 27, 27)
                .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelRetraitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton11)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel3.add(panelRetrait, "card2");

  
        panelDeposer.setBackground(new java.awt.Color(100, 149, 237));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Compte du bénéficiaire:");

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Montant A Déposer:");

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jButton12.setText("Déposer");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeposerLayout = new javax.swing.GroupLayout(panelDeposer);
        panelDeposer.setLayout(panelDeposerLayout);
        panelDeposerLayout.setHorizontalGroup(
            panelDeposerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeposerLayout.createSequentialGroup()
                .addGroup(panelDeposerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeposerLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelDeposerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDeposerLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(29, 29, 29)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDeposerLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(63, 63, 63)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDeposerLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton12)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelDeposerLayout.setVerticalGroup(
            panelDeposerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeposerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelDeposerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelDeposerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton12)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jPanel3.add(panelDeposer, "card2");

        panelHistorique.setBackground(new java.awt.Color(100, 149, 237));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); 
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Numero Du Compte:");

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jButton14.setText("Recevoir l'Historique");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHistoriqueLayout = new javax.swing.GroupLayout(panelHistorique);
        panelHistorique.setLayout(panelHistoriqueLayout);
        panelHistoriqueLayout.setHorizontalGroup(
            panelHistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoriqueLayout.createSequentialGroup()
                .addGroup(panelHistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHistoriqueLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel20)
                        .addGap(29, 29, 29)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHistoriqueLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton14)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        panelHistoriqueLayout.setVerticalGroup(
            panelHistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoriqueLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelHistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(jButton14)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jPanel3.add(panelHistorique, "card2");

    jPanel17.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel17, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // methode bouton **Consulter Solde**
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        jTextField2.setText("");
        jPasswordField2.setText("");
        jTextField5.setText("");
        
        jPanel3.removeAll();
        jPanel3.add(panelConsultation);
        jPanel3.revalidate();
    }

    
 // Action pour la bouton de **Créer une compte** 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
       
        
        String Cc = jTextField1.getText();
        String passwordClient = String.valueOf(jPasswordField1.getPassword());
        int comboIndex = jComboBox1.getSelectedIndex();
        
        boolean isComptepargne = true;
        if (comboIndex == 0)
            isComptepargne = false;
        
        try {
            String result = bank.CreationCompte(Cc, passwordClient, isComptepargne);
            
            JOptionPane.showMessageDialog(this, result);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
        
            jTextField1.setText("");
            jPasswordField1.setText("");
            jComboBox1.setSelectedIndex(0);
        }
    }
    
    //Action pour la liste deroulante
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    
    //Action pour la bouton **consulter le solde** 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String Cc = jTextField2.getText();
        String password = String.valueOf(jPasswordField2.getPassword());
        
        try {
            
            String result = bank.Consulte(Cc, password);
            if (result.equals("Mot De Passe Incorrect") || result.equals("Introuvable")) {
                
                JOptionPane.showMessageDialog(this, result);
                jTextField2.setText("");
                jPasswordField2.setText("");
            } else
                jTextField5.setText(result);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    
    //Action pour la bouton ** Consulter Solde **
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        
        
        String Cc = jTextField6.getText();
        String password = String.valueOf(jPasswordField4.getPassword());
        
        try {
            
            String result = bank.Consulte(Cc, password);
            if (result.equals("Mot De Passe Incorrect") || result.equals("Introuvable")) {
                
                JOptionPane.showMessageDialog(this, result);
                jTextField11.setText("");
                jPasswordField3.setText("");
            } else
                jTextField8.setText(result);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    
    //Action pour la bouton **Effectuer le transfert **
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        jPanel3.removeAll();
        jPanel3.add(panelTransfert);
        jPanel3.revalidate();
    }
  
    
    //Action pour la bouton **Transferer**
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String originCc = jTextField6.getText();
        String originPassword = String.valueOf(jPasswordField4.getPassword());
        
        String NumCompteDestinataire = jTextField9.getText();
        String MontantTransferer = jTextField10.getText();
        
        try {
            
            String result = bank.Transferer(originCc, originPassword, NumCompteDestinataire, MontantTransferer);
            JOptionPane.showMessageDialog(this, result);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        
            jPasswordField4.setText("");
            jTextField6.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField8.setText("");
        }
    }

   
    //Action pour la bouton **Retrait**
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        jTextField11.setText("");
        jPasswordField3.setText("");
        jTextField13.setText("");
        jTextField15.setText("");
        
        jPanel3.removeAll();
        jPanel3.add(panelRetrait);
        jPanel3.revalidate();
    }

    
    //Action pour la bouton **Historique**
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        jPanel3.removeAll();
        jPanel3.add(panelHistorique);
        jPanel3.revalidate();
    }

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {

    }
    
    
    //Action pour la bouton **Consulter le Solde**
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String Cc = jTextField11.getText();
        String password = String.valueOf(jPasswordField3.getPassword());
        
        try {
            
            String result = bank.Consulte(Cc, password);
            if (result.equals("Mot De Passe Incorrect") || result.equals("Introuvable")) {
                
                JOptionPane.showMessageDialog(this, result);
                jTextField11.setText("");
                jPasswordField3.setText("");
            } else
                jTextField13.setText(result);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    
    //Action pour la bouton **Retrait**
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        String MontantRetrait = jTextField15.getText();
        
        String Cc = jTextField11.getText();
        String password = String.valueOf(jPasswordField3.getPassword());
        
        try {
            
            String result = bank.Retrait(Cc, password, MontantRetrait);
            JOptionPane.showMessageDialog(this, result);
 
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        
            jTextField11.setText("");
            jPasswordField3.setText("");
            jTextField13.setText("");
            jTextField15.setText("");
        }
    }


    //Action pour la bouton **Déposer**
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String NumCompte = jTextField14.getText();
        String MontantDeposer = jTextField16.getText();
        
        try {
            
            String result = bank.Deposer(NumCompte, MontantDeposer);
            JOptionPane.showMessageDialog(this, result);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        
            jTextField14.setText("");
            jTextField16.setText("");
        }    
    }

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    
  //Action pour la bouton **Recevoir Les Modifications**
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
         
        String NumCompte = jTextField19.getText();
        try {
            
            String res = bank.Historique(this.client, NumCompte);
            JOptionPane.showMessageDialog(this, res);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
  //Action pour la bouton **Déposer**
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        
        jPanel3.removeAll();
        jPanel3.add(panelDeposer);
        jPanel3.revalidate();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
  
    }

  
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }

 //Declaration des variables    
    private BankInterface bank;
    private ClientImplementation client;


    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panelConsultation;
    private javax.swing.JPanel panelCreationCompte;
    private javax.swing.JPanel panelDeposer;
    private javax.swing.JPanel panelHistorique;
    private javax.swing.JPanel panelTransfert;
    private javax.swing.JPanel panelRetrait;
}
