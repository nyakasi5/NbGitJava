/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.plaf.DimensionUIResource;
import model.Kocak;

/**
 *
 * @author Nyakas István <30/7323629>
 */
public class KocakSzerkesztDialog extends javax.swing.JDialog {
    private Kocak kocak;
    private boolean mentes;
    
    public KocakSzerkesztDialog(java.awt.Frame parent, boolean modal, Kocak kocak) {
        super(parent, modal);
        initComponents();
        setTitle("Kocák szerkesztése");
        setResizable(false);
        setLocationRelativeTo(null);
//        setMaximumSize(new Dimension(100,100));
        this.kocak=kocak;
        mentes= false;
        
        if (kocak == null){
             setTitle(" új koca felvétele");
        } else {
             setTitle(" koca szerkesztése");
             tfAnya.setText(kocak.getAnya());
             tfApa.setText(kocak.getApa());
             tfFajta.setText(kocak.getFajta());
             tfCsipszam.setText(kocak.getCsszam());
             tfKocaszam.setText(kocak.getKoszam());
             tfBkerules.setText(kocak.getKocatenydatum());
      
        }
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfAnya = new javax.swing.JTextField();
        tfApa = new javax.swing.JTextField();
        tfFajta = new javax.swing.JTextField();
        tfCsipszam = new javax.swing.JTextField();
        tfKocaszam = new javax.swing.JTextField();
        tfBkerules = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbMegsem = new javax.swing.JButton();
        jbMentes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Anya(4)");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Apa(4)");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Fajta (2)");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Csipszám (11)");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Kocaszám (4)");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Bekerülés dátuma(8)");

        jbMegsem.setText("Mégsem");
        jbMegsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMegsemActionPerformed(evt);
            }
        });

        jbMentes.setText("Mentés");
        jbMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBkerules, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(tfKocaszam)
                    .addComponent(tfCsipszam)
                    .addComponent(tfApa)
                    .addComponent(tfFajta)
                    .addComponent(tfAnya, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMegsem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfAnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbMegsem))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(tfApa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFajta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jbMentes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCsipszam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKocaszam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBkerules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMegsemActionPerformed
          setVisible(false);
    }//GEN-LAST:event_jbMegsemActionPerformed

    private void jbMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMentesActionPerformed
        if (kocak ==null){
            kocak= new Kocak();
        }
        kocak.setAnya(tfAnya.getText());
        kocak.setApa(tfApa.getText());
        kocak.setFajta(tfFajta.getText());
        kocak.setCsszam(tfCsipszam.getText());
        kocak.setKoszam(tfKocaszam.getText());
        kocak.setKocatenydatum(tfBkerules.getText());
            mentes= true;
            setVisible(false);
            System.out.println(kocak);
    }//GEN-LAST:event_jbMentesActionPerformed

    public Kocak getKocak() {
        return kocak;
    }

    public boolean isMentes() {
        return mentes;
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbMegsem;
    private javax.swing.JButton jbMentes;
    private javax.swing.JTextField tfAnya;
    private javax.swing.JTextField tfApa;
    private javax.swing.JTextField tfBkerules;
    private javax.swing.JTextField tfCsipszam;
    private javax.swing.JTextField tfFajta;
    private javax.swing.JTextField tfKocaszam;
    // End of variables declaration//GEN-END:variables
}
