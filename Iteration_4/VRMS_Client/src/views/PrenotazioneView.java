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


import control.ControllerFactoryClient;
import interfacce_remote.control.*;
import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.FilmInterface;
import interfacce_remote.entity.TerminaleInterface;
import interfacce_remote.entity.TesseraInterface;
import interfacce_remote.entity.TransizioneInterface;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import vrms_client.Main;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;



/**
 *
 * @author Antonio
 */
public class PrenotazioneView extends javax.swing.JPanel {
    private Main PagePanel;
    private String combo="Tutti";
    private FilmInterface copia;
    private ArrayList <FilmInterface> film;
    private int id_film;
    private ClienteInterface cliente;
    private float costo;
    private TerminaleInterface terminale;
    private Date data_rientro;
    private int id_copia;
    private static int id_noleggio;
    private static String formato;
    ControllerLoginInterface cl;
    ControllerRicercaInterface cr;
    ControllerPrenotazioneInterface cp ;
   
    public static String getFormato() {
        return formato;
    }

    public static int getId_noleggio() {
        return id_noleggio;
    }


  
    
    /** Creates new form start */
    public PrenotazioneView(Main PanP) {
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
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel20 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

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

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrizione Film"));
        jLayeredPane2.setMaximumSize(new java.awt.Dimension(651, 500));
        jLayeredPane2.setMinimumSize(new java.awt.Dimension(651, 500));
        jLayeredPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLayeredPane2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setText("Titolo:");
        jLabel3.setBounds(30, 50, 60, 10);
        jLayeredPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Genere:");
        jLabel4.setBounds(30, 70, 60, 14);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Anno:");
        jLabel5.setBounds(30, 90, 60, 14);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("Durata:");
        jLabel6.setBounds(30, 110, 60, 14);
        jLayeredPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("Costo:");
        jLabel7.setBounds(30, 130, 60, 14);
        jLayeredPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setText("<Genere>");
        jLabel9.setBounds(110, 70, 110, 14);
        jLayeredPane2.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setText("<Anno>");
        jLabel10.setBounds(110, 90, 110, 14);
        jLayeredPane2.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setText("<Durata>");
        jLabel11.setBounds(110, 110, 120, 14);
        jLayeredPane2.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setText("<Costo>");
        jLabel12.setBounds(110, 130, 120, 14);
        jLayeredPane2.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel13.setBounds(340, 20, 300, 250);
        jLayeredPane2.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setText("<Titolo>");
        jLabel14.setBounds(110, 40, 90, 30);
        jLayeredPane2.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane2.setBounds(20, 280, 610, 160);
        jLayeredPane2.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Cambia Film");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(500, 460, 130, 30);
        jLayeredPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(20, 190, 650, 500);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Noleggia Copia"));
        jLayeredPane3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLayeredPane3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel18.setBounds(130, 80, 110, -1);
        jLayeredPane4.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel19.setBounds(250, 50, 370, -1);
        jLayeredPane4.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        jScrollPane1.setBounds(82, 40, 460, 100);
        jLayeredPane4.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBounds(20, 30, 630, 170);
        jLayeredPane3.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel20.setText("Numero giorni del ");
        jLabel20.setBounds(10, 54, 160, 30);
        jLayeredPane5.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner1.setEnabled(false);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jSpinner1.setBounds(180, 50, 40, 30);
        jLayeredPane5.add(jSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Prenota");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(523, 223, 100, 30);
        jLayeredPane5.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSpinner2.setBounds(180, 60, -1, -1);
        jLayeredPane5.add(jSpinner2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBounds(20, 220, 630, 260);
        jLayeredPane3.add(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(680, 190, 670, 500);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("XYZVideo");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_company.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel21)
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
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBounds(20, 20, 1330, 120);
        jLayeredPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLayeredPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLayeredPane1AncestorAdded
        // TODO add your handling code here:
       
        

    }//GEN-LAST:event_jLayeredPane1AncestorAdded
    
    private void jLayeredPane1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLayeredPane1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLayeredPane1CaretPositionChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        PagePanel.activeView("StartView");
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
            try {
                // TODO add your handling code here:
                cl.Logout(ControllerFactoryClient.getInstance().getTerminale());
            } catch (RemoteException ex) {
                Logger.getLogger(PrenotazioneView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(PrenotazioneView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(PrenotazioneView.class.getName()).log(Level.SEVERE, null, ex);
            }
            PagePanel.activeView("HomeView");
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLayeredPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLayeredPane2AncestorAdded
        // TODO add your handling code here:
   
        try {
             
                cl= ControllerFactoryClient.getInstance().getFornitoreInterface().getControllerLogin();
                cp= ControllerFactoryClient.getInstance().getFornitoreInterface().getControllerPrenotazione();
                cr= ControllerFactoryClient.getInstance().getFornitoreInterface().getControllerRicerca();
                cliente= cl.getCliente(ControllerFactoryClient.getInstance().getTerminale());
                DescrizioneInterface d;
                jLabel8.setText(cliente.getNome() +" " +cliente.getCognome());
                jTextField2.setVisible(false);
                jButton3.setText("Logout");
                String id_t= cliente.getTessera_personale().getCodice();
                int nn = cl.getN_noleggi(ControllerFactoryClient.getInstance().getTerminale());
                jLabel15.setText("Credito Residuo: "+ cliente.getTessera_personale().getCredito()+"    Noleggi aperti: "+nn);
                jLabel17.setText("");
                terminale = cl.CaricaTerminale();
                VisualizzaDate();
            

        } catch (Exception ex) {
            Logger.getLogger(NoleggioView.class.getName()).log(Level.SEVERE, null, ex);
        }


       try {
             film = cp.OttieniCopie(cr.getDesc((ControllerFactoryClient.getInstance().getTerminale())).getID());
           
           

        } catch (Exception ex) {
            Logger.getLogger(NoleggioView.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            DescrizioneInterface d= cp.OttieniDescrizione(cr.getDesc(ControllerFactoryClient.getInstance().getTerminale()).getID());
            jLabel14.setText( d.getTitolo());
            jLabel9.setText( d.getGenere().getNome());
            jLabel10.setText( String.valueOf(d.getAnno()));
            jLabel11.setText( String.valueOf(d.getDurata()));
            jLabel12.setText(String.valueOf(d.getCosto()));
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(d.getLocandina())));
            jTextArea1.setText(d.getTrama());

        } catch (Exception ex) {
            Logger.getLogger(NoleggioView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLayeredPane2AncestorAdded

    private void jLayeredPane3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLayeredPane3AncestorAdded
       
      
        try {
            // TODO add your handling code here:
            
        } catch (Exception ex) {
            Logger.getLogger(NoleggioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLayeredPane3AncestorAdded

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        if((Integer) jSpinner1.getValue()>0)
          jButton1.setEnabled(true);
        
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            // TODO add your handling code here:
             try {
            TransizioneInterface noleggio= cp.NuovaTransizione();


                copia = cp.CercaCopia(id_film);
           
            noleggio.setFilm_noleggiato(copia);
            noleggio.setTessera(cliente.getTessera_personale());
            noleggio.setOrigine_noleggio(terminale);
            noleggio.setAperto(true);
            noleggio.setTipo("prenotazione");
            noleggio.setData_inizio(data_rientro);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data_rientro);
            calendar.add(Calendar.DATE, (Integer) jSpinner1.getValue());
            Date data_fine = calendar.getTime();
            noleggio.setData_fine(data_fine);
            costo = 0;
            noleggio.setCosto_totale(costo);

          
                id_noleggio = cp.ConfermaPrenotazione(noleggio, cliente, costo);
           
            PagePanel.activeView("RiepilogoPrenotazioneView");
             } catch (Exception ex) {
                Logger.getLogger(PrenotazioneView.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       
        jSpinner1.setEnabled(true);
         JTable table = (JTable) evt.getSource();
         int rigacliccata = table.rowAtPoint(evt.getPoint());
        
         String id = jTable1.getValueAt(rigacliccata, 0).toString();
         id_film=Integer.parseInt(id);
         data_rientro=(Date)jTable1.getValueAt(rigacliccata, 1);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        PagePanel.activeView("HomeView");
}//GEN-LAST:event_jLabel21MouseClicked
 
     private void VisualizzaDate() throws Exception{
      
       
        ArrayList<TransizioneInterface> elenco_trans;
       
       elenco_trans= cp.OttieniTransizioni(cr.getDesc(ControllerFactoryClient.getInstance().getTerminale()).getID(),cp.getFormato());
       
     
       RiempiTabella(elenco_trans);

       
  
     }

    private int CercaCopia() throws RemoteException {
       int r=0;
       Iterator iter= film.iterator();
       boolean trovato=false;
               int i=0;
       while(iter.hasNext() && trovato==false)
         {  Object key = iter.next();
            if(film.get(i).getFormato_film().getNome_formato().equals(combo)  )
            {
                r = film.get(i).getID();
                trovato=true;
                copia=film.get(i);

            }
            i++;
        }
       return r;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void RiempiTabella(ArrayList<TransizioneInterface> elenco_trans) throws RemoteException, Exception {
       
        
        String[] header = {"ID","Data rientro"};
        Object[][] data= new Object[elenco_trans.size()][header.length];

        Iterator it =elenco_trans.iterator();
        int i=0;
        TransizioneInterface d;
        while (it.hasNext())

        {   d= (TransizioneInterface) it.next();
            data[i][0]=d.getFilm_noleggiato().getID();
            data[i][1]=d.getData_fine();
          // data[i][2]=d.getGenere();
            //data[i][3]=d.getAnno();
            //data[i][4]=d.getDurata();
            //data[i][5]=d.getCosto();*/
        i++;
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(data,header));
   
    }

}
