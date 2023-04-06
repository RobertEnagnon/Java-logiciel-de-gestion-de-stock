/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet_youtube_produit;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author liamsi
 */
public class Produit extends javax.swing.JFrame {

    /**
     * Creates new form utilisateur
     */
    ResultSet rs;
    db_connection db;
    public Produit() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        table();
    }
     public void table() {
        String t[] = {"id","code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
        rs = db.querySelect(t, "produit");
        tbl_prod.setModel(new ResultSetTableModel(rs));
    }
     void actualiser() {
        txtid.setText("");
        txtref.setText("");
        txtdes.setText("");
        txtran.setText("");txtfou.setText("");txtrem.setText("");txtpri.setText("");
        txtsto.setText("");}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prod = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtran = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtref = new javax.swing.JTextField();
        txtrem = new javax.swing.JTextField();
        txtpri = new javax.swing.JTextField();
        txtsto = new javax.swing.JTextField();
        txtfou = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        comrech = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtrech = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 590));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(231, 248, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 900));
        jPanel1.setLayout(null);

        tbl_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "code_produit", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_prod);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 840, 150);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 300, 120, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(130, 300, 110, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setText("supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(240, 300, 130, 40);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setText("code produit   :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 10, 80, 27);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setText("fournisseur  :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(260, 10, 90, 20);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setText("remise   % :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(280, 50, 70, 27);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setText("reference    :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 50, 70, 27);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setText("deseignation    :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 100, 90, 27);
        jPanel2.add(txtdes);
        txtdes.setBounds(120, 100, 100, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel12.setText("prix   :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(290, 100, 70, 27);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel13.setText("stock   :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(280, 140, 70, 27);
        jPanel2.add(txtran);
        txtran.setBounds(120, 140, 100, 30);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel14.setText("rangement   :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 150, 90, 27);
        jPanel2.add(txtid);
        txtid.setBounds(120, 10, 100, 30);
        jPanel2.add(txtref);
        txtref.setBounds(120, 50, 100, 30);
        jPanel2.add(txtrem);
        txtrem.setBounds(360, 50, 100, 30);
        jPanel2.add(txtpri);
        txtpri.setBounds(360, 100, 100, 30);
        jPanel2.add(txtsto);
        txtsto.setBounds(360, 140, 100, 30);
        jPanel2.add(txtfou);
        txtfou.setBounds(360, 10, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 370, 500, 190);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("recherche ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(0, 140, 131, 40);

        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock" }));
        jPanel3.add(comrech);
        comrech.setBounds(40, 70, 240, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("recherche par catégorie :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 30, 250, 30);
        jPanel3.add(txtrech);
        txtrech.setBounds(140, 140, 180, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(500, 270, 330, 290);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setText("actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(370, 300, 130, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel6.setText("Gestion des produits ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 40, 410, 50);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Réalisée par Ronasdev ---- Email: ronasdev@gmail.com --- contact: (+229) 96 75 58 19");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 420, 700, 40);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Auteur : Ronasdev");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtid.getText().equals("") || txtref.getText().equals("") || txtdes.getText().equals("")
                || txtfou.getText().equals("") || txtran.getText().equals("") || txtrem.getText().equals("")
                || txtpri.getText().equals("") || txtsto.getText().equals("")
                ) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
            String[] inf = {txtid.getText(), txtref.getText(), txtdes.getText(),txtran.getText(),txtfou.getText()
            ,txtrem.getText(),txtpri.getText(),txtsto.getText()};
            System.out.println(db.queryInsert("produit", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtid.getText().equals("") || txtref.getText().equals("") || txtdes.getText().equals("")
                || txtfou.getText().equals("") || txtran.getText().equals("") || txtrem.getText().equals("")
                || txtpri.getText().equals("") || txtsto.getText().equals("")
                ) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
                  String[] colon = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
              String[] inf = {txtid.getText(), txtref.getText(), txtdes.getText(),txtran.getText(),txtfou.getText()
            ,txtrem.getText(),txtpri.getText(),txtsto.getText()};
            String id = String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("produit", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 String id = String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suuprimer", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("produit", "id=" + id);
        } else {
            return;
        }
        table();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
actualiser(); table();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (comrech.getSelectedItem().equals("code_produit")) {
                rs = db.querySelectAll("produit", "code_produit LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("reference")) {
                rs = db.querySelectAll("produit", "reference LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("deseignation")) {
                rs = db.querySelectAll("produit", "deseignation LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("rangement")) {
                rs = db.querySelectAll("produit", "rangement LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("fournisseur")) {
                rs = db.querySelectAll("produit", "fournisseur LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("remise")) {
                rs = db.querySelectAll("produit", "remise LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("prix")) {
                rs = db.querySelectAll("produit", "prix LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("stock")) {
                rs = db.querySelectAll("produit", "stock LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            
            
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prodMouseClicked
        txtid.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 1)));
        txtref.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 2)));
        txtdes.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 3)));
        txtran.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 4)));
txtfou.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 5)));
txtrem.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 6)));
txtpri.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 7)));
txtsto.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 8)));

       
    }//GEN-LAST:event_tbl_prodMouseClicked

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
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comrech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_prod;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtfou;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpri;
    private javax.swing.JTextField txtran;
    private javax.swing.JTextField txtrech;
    private javax.swing.JTextField txtref;
    private javax.swing.JTextField txtrem;
    private javax.swing.JTextField txtsto;
    // End of variables declaration//GEN-END:variables
}
