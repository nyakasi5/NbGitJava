/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import model.Kanok;

/**
 *
 * @author Nyakas István <30/7323629>
 */
public class KanokSzerkesztDialog extends javax.swing.JDialog {

    private Kanok kanok;
    private boolean mentes;
    
    
    public KanokSzerkesztDialog(java.awt.Frame parent, boolean modal, Kanok kanok) {
        super(parent, modal);
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(parent);
//        
        this.kanok=kanok;
        mentes= false;
        
        if (kanok == null){
             setTitle(" új kan felvétele");
        } else {
             setTitle(" kan szerkesztése");
             tfKanneve.setText(kanok.getKannev());
             tfKanfajtaja.setText(kanok.getKanfajta());
             tfKanbekerulesdatuma.setText(kanok.getKbekerules());
      
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfKanneve = new javax.swing.JTextField();
        tfKanfajtaja = new javax.swing.JTextField();
        tfKanbekerulesdatuma = new javax.swing.JTextField();
        jbMegsem = new javax.swing.JButton();
        jbMentes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Kan neve");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Fajtája");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Bekerülés dátuma");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfKanneve, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(tfKanfajtaja)
                    .addComponent(tfKanbekerulesdatuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMegsem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfKanneve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMegsem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfKanfajtaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfKanbekerulesdatuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jbMentes)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMegsemActionPerformed
      this.setVisible(false);
    }//GEN-LAST:event_jbMegsemActionPerformed

    private void jbMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMentesActionPerformed
        if (kanok ==null){
            kanok= new Kanok();
        }
        kanok.setKannev(tfKanneve.getText());
        kanok.setKanfajta(tfKanfajtaja.getText());
        kanok.setKbekerules(tfKanbekerulesdatuma.getText());
            mentes= true;
            setVisible(false);
            System.out.println(kanok);
    }//GEN-LAST:event_jbMentesActionPerformed

    public Kanok getKanok() {
        return kanok;
    }

    public boolean isMentes() {
        return mentes;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbMegsem;
    private javax.swing.JButton jbMentes;
    private javax.swing.JTextField tfKanbekerulesdatuma;
    private javax.swing.JTextField tfKanfajtaja;
    private javax.swing.JTextField tfKanneve;
    // End of variables declaration//GEN-END:variables
}
