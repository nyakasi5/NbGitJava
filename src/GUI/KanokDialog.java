/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Imodel;
import model.Kanok;


/**
 *
 * @author Nyakas István <30/7323629>
 */
public class KanokDialog extends javax.swing.JDialog {
private Imodel model;
private Frame parent; //Az új gomb kattintásnál a diagram megjelenítése

 public void refreshList(){
      try {
        //feltöltjuk a list-et adatokkal
        List<Kanok> kanok = model.getAllKanok();
        lstKanok.setListData( kanok.toArray());
    
    } catch (SQLException ex) {
         JOptionPane.showMessageDialog(rootPane, ex,"Adatbázis refresh hiba!",
                         JOptionPane.ERROR_MESSAGE); 
    }
 }

    public KanokDialog(java.awt.Frame parent, boolean modal,Imodel model) {
        super(parent, modal);
        initComponents();
        
        this.model= model;
        this.parent=parent;
        
        setTitle("Kanok szerkesztése");
        setLocationRelativeTo(parent);
   
        refreshList();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstKanok = new javax.swing.JList();
        jbUj = new javax.swing.JButton();
        jbSzerkeszt = new javax.swing.JButton();
        jbTorol = new javax.swing.JButton();
        jbOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstKanok.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstKanok);

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
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbSzerkeszt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbTorol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbUj, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSzerkeszt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbTorol)
                        .addGap(101, 101, 101)
                        .addComponent(jbOk))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
//        a this itt a kanokdialog ablakot jelenti 
        this.setVisible(false);
    }//GEN-LAST:event_jbOkActionPerformed

    private void jbTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTorolActionPerformed
       Kanok kivalasztottkan= (Kanok) lstKanok.getSelectedValue();
       if (kivalasztottkan !=null){
         int valasz=  JOptionPane.showConfirmDialog(rootPane, "Biztosan törölni akarod?", "Törlési megerősítés", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if (valasz == JOptionPane.YES_OPTION){
             try {
                 model.removeKanok(kivalasztottkan);
                 refreshList();
             } catch (SQLException ex) {
               JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
             }
       }    
       } else {
           JOptionPane.showMessageDialog(rootPane,"Válassz ki valakit a törléshez", "Nincs semmi kiválasztva", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jbTorolActionPerformed

    private void jbUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUjActionPerformed
        KanokSzerkesztDialog kansz= new KanokSzerkesztDialog(parent, true,  null);
       kansz.setVisible(true); // kinyitjuk a dialogust
       // a Mégsem vagy a Mentés gombra kattintunk A boolean mentes változó 
       // fogja megmondani melyiket nyomtuk meg
       if(kansz.isMentes()){
           Kanok r=kansz.getKanok();
            try {
                model.addKanok(r);  // adatbázisba beírtuk
                refreshList();      // frissítjük a változásokkal a List-et
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis új hiba ", JOptionPane.ERROR_MESSAGE);
             }
       }
       
       
    }//GEN-LAST:event_jbUjActionPerformed

    private void jbSzerkesztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSzerkesztActionPerformed
        Kanok kivalaszKanok=(Kanok)lstKanok.getSelectedValue();
        if (kivalaszKanok !=null){
        KanokSzerkesztDialog kansz= new KanokSzerkesztDialog(parent, true,  kivalaszKanok);
      kansz.setVisible(true);
       if(kansz.isMentes()){
           Kanok r=kansz.getKanok();
            try {
                model.updateKanok(r);  // adatbázisba beírtuk
                refreshList();      // frissítjük a változásokkal a List-et
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
             }     
    }//GEN-LAST:event_jbSzerkesztActionPerformed
        else{
            JOptionPane.showMessageDialog(parent, "Válassz ki valakit!", "Nincs senki kiválasztva", JOptionPane.ERROR_MESSAGE);
                          
        }
    }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbOk;
    private javax.swing.JButton jbSzerkeszt;
    private javax.swing.JButton jbTorol;
    private javax.swing.JButton jbUj;
    private javax.swing.JList lstKanok;
    // End of variables declaration//GEN-END:variables
}
