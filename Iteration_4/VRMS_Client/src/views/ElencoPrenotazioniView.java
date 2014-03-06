/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * start.java
 *
 * Created on 6-set-2011, 17.30.00
 */

package views;

import control.*;
import interfacce_remote.control.*;
import interfacce_remote.entity.*;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import vrms_client.Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;


/**
 *
 * @author Antonio
 */
public class ElencoPrenotazioniView extends javax.swing.JPanel {
    private Main PagePanel;
    private FilmInterface copia= null;
    private float costo;
    private ClienteInterface cliente;

    ControllerPrenotazioneInterface cr;
    ControllerLoginInterface cl;
    ControllerNoleggioInterface cn;
    private int id_noleggio;

  
    

     /** Creates new form start */
   public ElencoPrenotazioniView(Main PanP) {
        initComponents();
	PagePanel = PanP;
       }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLayeredPane1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jLayeredPane1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jLayeredPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLayeredPane1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel8.setText("<Tessera Non Identificata>");

        jLabel15.setText("Inserisci Tessera");

        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setText("jLabel17");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBounds(20, 150, 1330, 30);
        jLayeredPane1.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elenco Prenotazioni");
        jLabel1.setBounds(20, 220, 1330, 40);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Riepilogo Ordini"));

        jLayeredPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLayeredPane2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton2.setText("Indietro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(180, 280, 120, 30);
        jLayeredPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(180, 30, 500, 160);
        jLayeredPane2.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Ritira");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(553, 283, 120, 30);
        jLayeredPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Costo del noleggio: ");
        jLabel2.setBounds(180, 210, 100, 20);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel3.setBounds(300, 210, 380, 20);
        jLayeredPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBounds(184, 240, 500, 20);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBounds(240, 270, 880, 380);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("XYZVideo");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_company.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(556, 556, 556))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBounds(20, 20, 1330, 120);
        jLayeredPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1374, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLayeredPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLayeredPane1AncestorAdded
        // TODO add your handling code here:

}//GEN-LAST:event_jLayeredPane1AncestorAdded

    private void jLayeredPane1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLayeredPane1CaretPositionChanged
        // TODO add your handling code here:
}//GEN-LAST:event_jLayeredPane1CaretPositionChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
            try {
                // TODO add your handling code here:
                cl.Logout(ControllerFactoryClient.getInstance().getTerminale());
            } catch (RemoteException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            PagePanel.activeView("HomeView");

        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PagePanel.activeView("HomeView");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLayeredPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLayeredPane2AncestorAdded
        // TODO add your handling code here
      
      
       ArrayList <TransizioneInterface> prenotazioni= new ArrayList();
        try {
            prenotazioni = cr.RiepilogoPrenotazioni(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            RiempiTabella(prenotazioni);
        } catch (RemoteException ex) {
            Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jLayeredPane2AncestorAdded

    private void jPanel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel3AncestorAdded
        try {
            cl = ControllerFactoryClient.getInstance().getFornitoreInterface().getControllerLogin();
            cr= ControllerFactoryClient.getInstance().getFornitoreInterface().getControllerPrenotazione();
            cn= ControllerFactoryClient.getInstance().getFornitoreInterface().getControllerNoleggio();

        } catch (RemoteException ex) {
            Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            try {
                // TODO add your handling code here:
                cliente = cl.getCliente(ControllerFactoryClient.getInstance().getTerminale());
            } catch (RemoteException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabel8.setText(cliente.getNome() + " " + cliente.getCognome());
            jTextField2.setVisible(false);
            jButton3.setText("Logout");
            int nn;
            try {
                nn = cl.getN_noleggi(ControllerFactoryClient.getInstance().getTerminale());
                jLabel15.setText("Credito Residuo: " + cliente.getTessera_personale().getCredito() + "    Noleggi aperti: " + nn);

            } catch (RemoteException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabel17.setText("");
        } catch (RemoteException ex) {
            Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jPanel3AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    
        TransizioneInterface transizione ;
        try {
            transizione= cr.ottieniTransizione(id_noleggio);
            copia= transizione.getFilm_noleggiato();
           
          int nn=cl.getN_noleggi(ControllerFactoryClient.getInstance().getTerminale());
                if(nn>=3)
              {/*jLabel17.setForeground(new java.awt.Color(255, 0, 0));
               jLabel17.setText("ATTENZIONE! Hai già effettuato tre noleggi. Prima di ritirare questa copia devi effettuare una restituzione");
                */

               JOptionPane.showMessageDialog(PagePanel, "Hai già effettuato tre noleggi. Prima di ritirare questa copia devi effettuare una restituzione", "Attenzione", JOptionPane.ERROR_MESSAGE);
}
                else
                {
                     jLabel17.setText("");
                     transizione.setTipo("noleggio");
                     transizione.setCosto_totale(costo);
                     cl.setN_noleggi(1);
                     int nnn=cl.getN_noleggi(ControllerFactoryClient.getInstance().getTerminale());
                     jLabel15.setText("Credito Residuo: "+ cliente.getTessera_personale().getCredito()+"    Noleggi aperti: "+nnn);


                     cr.RitiraPrenotazione(transizione,cliente);
                     cn.setNoleggio(transizione,ControllerFactoryClient.getInstance().getTerminale());

                }
            


        } catch (Exception ex) {
            Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
        }
        PagePanel.activeView("FinePrenotazioneView");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
            // TODO add your handling code here:
        
        TransizioneInterface transizione;
        JTable table = (JTable) evt.getSource();
        int rigacliccata = table.rowAtPoint(evt.getPoint());
        id_noleggio =(Integer) jTable1.getValueAt(rigacliccata, 0);
        jButton1.setEnabled(true);
        try {
             transizione = cr.ottieniTransizione(id_noleggio);
             copia= transizione.getFilm_noleggiato();
             
             costo= cn.CalcolaTotale(ControllerFactoryClient.getInstance().getTerminale(),transizione,diff(transizione.getData_fine(),transizione.getData_inizio()));
          if(costo> cliente.getTessera_personale().getCredito())
             {
              jLabel3.setText(String.valueOf(costo));
              jLabel4.setForeground(new java.awt.Color(255, 0, 0));
              //jLabel4.setText("ATTENZIONE! Non hai credito sufficiente, recati alla cassa per ricaricare la tua tessera");


               JOptionPane.showMessageDialog(PagePanel, "Non hai credito sufficiente, recati alla cassa per ricaricare la tua tessera", "Attenzione", JOptionPane.ERROR_MESSAGE);
jButton1.setEnabled(false);
             }
          else{
             jLabel4.setText("");
             jLabel3.setText(String.valueOf(costo));
          }
        } catch (Exception ex) {
            Logger.getLogger(ElencoPrenotazioniView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        PagePanel.activeView("HomeView");
}//GEN-LAST:event_jLabel5MouseClicked
   
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

   

    private void RiempiTabella(ArrayList<TransizioneInterface> ordini) throws RemoteException {
        String[] header = {"ID","Titolo Film Ordinato","Data restituzione"};
        Object[][] data= new Object[ordini.size()][header.length];

        Iterator it =ordini.iterator();
        int i=0;
        TransizioneInterface r;
        while (it.hasNext())
        {r=((TransizioneInterface)it.next());
            data[i][0]=r.getID();
            data[i][1]=r.getFilm_noleggiato().getDescrizione_film().getTitolo();
             Calendar calendar = new GregorianCalendar();
             calendar.setTime(r.getData_fine());
            int mese = calendar.get(Calendar.MONTH);
            mese=mese+1;
            data[i][2]=calendar.get(Calendar.DAY_OF_MONTH)+" / "+mese+" / "+calendar.get(Calendar.YEAR);


            


        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(data,header));
    }

   public static int diff(Date date1, Date date2) {
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();

    c1.setTime(date1);
    c2.setTime(date2);
    int diffDay = 0;

    if (c1.before(c2)) {
      diffDay = countDiffDay(c1, c2);
    } else {
      diffDay = countDiffDay(c2, c1);
    }

    return diffDay;
  }

  public static void DateDiff(Date date1, Date date2) {
    int diffDay = diff(date1, date2);
    //System.out.println("Different Day : " + diffDay);
  }

  public static int countDiffDay(Calendar c1, Calendar c2) {
    int returnInt = 0;
    while (!c1.after(c2)) {
      c1.add(Calendar.DAY_OF_MONTH, 1);
      returnInt++;
    }

    if (returnInt > 0) {
      returnInt = returnInt - 1;
    }

    return (returnInt);
  }


}



