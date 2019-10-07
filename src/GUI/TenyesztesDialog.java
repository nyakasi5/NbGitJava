/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import model.Imodel;
import model.Kanok;
import model.Kocak;
import model.Tenyesztes;



/**
 *
 * @author Nyakas István <30/7323629>
 */
public class TenyesztesDialog extends javax.swing.JDialog implements TableModelListener {

    private java.awt.Frame parent;
    private Imodel model;
    private List<Kanok> kanok;
    private List<Kocak> kocak;
    private List<Tenyesztes> tenyesztes;
    private Map<Integer, Kocak> KocakMap;
    private Map<Integer, Kanok> KanokMap;
    private Map<Integer, Tenyesztes> TenyesztesMap; 
    
    public TenyesztesDialog(java.awt.Frame parent, boolean modal, Imodel model) {
        super(parent, modal);
        initComponents();
         setTitle("Tenyésztési adatok módosítása és felvitele");
         setResizable(false);
        // képernyőn elhelyezése
        
        setLocationRelativeTo(null);
        // teljes ablakméret beállítása
       this.parent= parent;
       this.model=model;
       try {
            kocak = model.getAllKocak();
            KocakMap = model.getKocakMap();

            cbKocak.setModel(new DefaultComboBoxModel(kocak.toArray()));


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex,
                    "Adatbázis hiba!", JOptionPane.ERROR_MESSAGE);
        }
       
                     

//DefaultTableModel dtm = (DefaultTableModel) tblTenyesztes.getModel();
//        dtm.addTableModelListener(this);
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSzerkeszt = new javax.swing.JButton();
        jbOk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTenyesztes = new javax.swing.JTable();
        cbKocak = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jbTermekenyites = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbSzerkeszt.setText("Szerkeszt");

        jbOk.setText("OK");
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });

        tblTenyesztes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "T. id", "term.i dátum", "Kan neve", "UH vizsg. dátuma", "UH eredm.", "Fialás dátuma", "Fialt élő db", "Fialt holt db", "Választás dátuma", "Választás élő db", "Választás holt db", "Megjegyzés"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTenyesztes);

        cbKocak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKocakActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Koca:");

        jbTermekenyites.setText("új termékenyítés");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(cbKocak, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbSzerkeszt)
                .addGap(34, 34, 34)
                .addComponent(jbTermekenyites)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addComponent(jbOk, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSzerkeszt)
                            .addComponent(jbTermekenyites)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKocak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        cbKocak.getAccessibleContext().setAccessibleParent(cbKocak);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        // ablak bezárása
        setVisible(false);
    }//GEN-LAST:event_jbOkActionPerformed

    private void cbKocakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKocakActionPerformed

//        Kocak kivalasztott= (Kocak) cbKocak.getSelectedItem();
//
//        if (kivalasztott != null) {
//
//            try {
//                Kocak = model.getAllKocak(kivalasztott);
//
//                refreshTable();
//
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(rootPane, ex,
//                        "Adatbázis hiba!", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    }                  
// alapbeállítás az első koszam
        
        // Itt választjuk ki az adatbázisból a koszamot és feltöltjük at táblázatott a 
        // kiválasztott koca termékenyítési adataival (Iid) sorrendben
        
    }//GEN-LAST:event_cbKocakActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbKocak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbOk;
    private javax.swing.JButton jbSzerkeszt;
    private javax.swing.JButton jbTermekenyites;
    private javax.swing.JTable tblTenyesztes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");  }
}
