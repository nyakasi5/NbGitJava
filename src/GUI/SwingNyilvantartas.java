/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Dbmodel;
import model.Imodel;

/**
 *
 * @author Nyakas István <30/7323629>
 */
public class SwingNyilvantartas extends javax.swing.JFrame {
// a Dbmodel-ből egy model típusú objektumot készítünk
    private Imodel model;
    
    public SwingNyilvantartas() {
        initComponents();
        //a JFrame címe
        setTitle("Koca nyilvántartás V1.0");
        // képernyőn elhelyezése
        setLocationRelativeTo(null);
        // teljes ablakméret beállítása
        setExtendedState(this.MAXIMIZED_BOTH);
        // adatbázis kapcsolat
        String connURL = "jdbc:mysql://localhost:3306/sertes";
        String user = "root";
        String pass = "1234";
        
        try {
            Connection conn= DriverManager.getConnection(connURL,user,pass);
            model = new Dbmodel(conn);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, ex,"Adatbázis hiba!",
                         JOptionPane.ERROR_MESSAGE);
        }
                      
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miexportalas = new javax.swing.JMenuItem();
        miImportalas = new javax.swing.JMenuItem();
        miKilepes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miKanok = new javax.swing.JMenuItem();
        miKocak = new javax.swing.JMenuItem();
        miTenyesztes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("FÁJL");

        miexportalas.setText("Exportálás");
        jMenu1.add(miexportalas);

        miImportalas.setText("Importálás");
        jMenu1.add(miImportalas);

        miKilepes.setText("Kilépés");
        miKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKilepesActionPerformed(evt);
            }
        });
        jMenu1.add(miKilepes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("ADATOK");

        miKanok.setText("Kanok");
        miKanok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKanokActionPerformed(evt);
            }
        });
        jMenu2.add(miKanok);

        miKocak.setText("Kocák");
        miKocak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKocakActionPerformed(evt);
            }
        });
        jMenu2.add(miKocak);

        miTenyesztes.setText("Tenyésztés");
        miTenyesztes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTenyesztesActionPerformed(evt);
            }
        });
        jMenu2.add(miTenyesztes);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("RIPORTOK");

        jMenuItem4.setText("Kész listák");
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Paraméteres listák");
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("SEGÍTSÉG");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKilepesActionPerformed
      System.exit(0);
    }//GEN-LAST:event_miKilepesActionPerformed

    private void miKocakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKocakActionPerformed
        
        KocakDialog kocakd = new KocakDialog(this,true, model);
       kocakd.setVisible(true);
    }//GEN-LAST:event_miKocakActionPerformed

    private void miTenyesztesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTenyesztesActionPerformed
        TenyesztesDialog tenyd=new TenyesztesDialog(this, true, model);
        tenyd.setVisible(true);
    }//GEN-LAST:event_miTenyesztesActionPerformed

    private void miKanokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKanokActionPerformed
       KanokDialog kanokd= new KanokDialog(this,true, model);
       kanokd.setVisible(true);
    }//GEN-LAST:event_miKanokActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SwingNyilvantartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingNyilvantartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingNyilvantartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingNyilvantartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingNyilvantartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem miImportalas;
    private javax.swing.JMenuItem miKanok;
    private javax.swing.JMenuItem miKilepes;
    private javax.swing.JMenuItem miKocak;
    private javax.swing.JMenuItem miTenyesztes;
    private javax.swing.JMenuItem miexportalas;
    // End of variables declaration//GEN-END:variables
}
