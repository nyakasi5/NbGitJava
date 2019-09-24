/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Kocak;
import model.Imodel;



/**
 *
 * @author Nyakas István <30/7323629>
 */
public class KocakDialog extends javax.swing.JDialog {
    private Imodel model;
    private Frame parent; //Az új gomb kattintásnál a diagram megjelenítése
   
    public void refreshList(){
        try {
            List<Kocak> kocak = model.getAllKocak();
        lstKocak.setListData( kocak.toArray());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex,"Adatbázis hiba!",
                         JOptionPane.ERROR_MESSAGE);   
        } 
    }
    
    
    public KocakDialog(java.awt.Frame parent, boolean modal,Imodel model) {
        super(parent, modal);
        initComponents();
        
        this.model=model;
        this.parent=parent;
        
        setTitle("Kocák szerkesztése");
        setLocationRelativeTo(null);
        
        refreshList();
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstKocak = new javax.swing.JList();
        jbUj = new javax.swing.JButton();
        jbSzerkeszt = new javax.swing.JButton();
        jbTorol = new javax.swing.JButton();
        jbOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstKocak.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstKocak);

        jbUj.setText("ÚJ");
        jbUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUjActionPerformed(evt);
            }
        });

        jbSzerkeszt.setText("SZERKESZT");
        jbSzerkeszt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSzerkesztActionPerformed(evt);
            }
        });

        jbTorol.setText("TÖRÖL");
        jbTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTorolActionPerformed(evt);
            }
        });

        jbOk.setText("OK");
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbSzerkeszt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbTorol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbUj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSzerkeszt)
                        .addGap(18, 18, 18)
                        .addComponent(jbTorol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbOk))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jbOkActionPerformed

    private void jbTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTorolActionPerformed
        Kocak kivalasztottkoca= (Kocak) lstKocak.getSelectedValue();
       if (kivalasztottkoca !=null){
         int valasz=  JOptionPane.showConfirmDialog(rootPane, "Biztosan törölni akarod?",
                       "Törlési megerősítés", JOptionPane.YES_NO_OPTION,
                       JOptionPane.QUESTION_MESSAGE);
           if (valasz== JOptionPane.YES_OPTION){
             try {
                 model.removeKocak(kivalasztottkoca);
                 refreshList();
             } catch (SQLException ex) {
               JOptionPane.showMessageDialog(rootPane, ex, 
                             "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
            }
           }
       } else {
           JOptionPane.showMessageDialog(rootPane,"Válassz ki valakit a törléshez",
                         "Nincs semmi kiválasztva", JOptionPane.ERROR_MESSAGE);
       } 
    }//GEN-LAST:event_jbTorolActionPerformed

    private void jbUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUjActionPerformed
         KocakSzerkesztDialog kocsz= new KocakSzerkesztDialog(parent, true,  null);
         pack();
         setPreferredSize(new Dimension(100,100));
         kocsz.setVisible(true);
       
       if(kocsz.isMentes()){
           Kocak r=kocsz.getKocak();
            try {
                model.addKocak(r);  // adatbázisba beírtuk
                refreshList();      // frissítjük a változásokkal a List-et
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
             }
       }
       
       
    }//GEN-LAST:event_jbUjActionPerformed

    private void jbSzerkesztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSzerkesztActionPerformed
         Kocak kivalaszKocak=(Kocak)lstKocak.getSelectedValue();
        if (kivalaszKocak !=null){
        KocakSzerkesztDialog kocsz= new KocakSzerkesztDialog(parent, true,  kivalaszKocak);
      kocsz.setVisible(true);
       if(kocsz.isMentes()){
           Kocak r=kocsz.getKocak();
            try {
                model.updateKocak(r);  // adatbázisba beírtuk
                refreshList();      // frissítjük a változásokkal a List-et
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
             }
       }

    }
    }//GEN-LAST:event_jbSzerkesztActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbOk;
    private javax.swing.JButton jbSzerkeszt;
    private javax.swing.JButton jbTorol;
    private javax.swing.JButton jbUj;
    private javax.swing.JList lstKocak;
    // End of variables declaration//GEN-END:variables
}
