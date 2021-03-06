/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengelolaanKRS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author ASUS
 */
public class TabelInputKRS extends javax.swing.JFrame {
    DefaultTableModel mod;
    private String SQL;
    /**
     * Creates new form TabelInputKRS
     */
    public TabelInputKRS() {
        initComponents();
        input();
        tampilandata();
        setLocationRelativeTo(this);
    }

    private void input(){
        textno.setText(null);
        textkode.setText(null);
        textmata_kuliah.setText(null);
        textdosen.setText(null);
        textsks.setText(null);
        textkelas.setText(null);
        
    }
    
    private void tampilandata(){
        mod = new DefaultTableModel();
        mod.addColumn("No");
        mod.addColumn("Kode");
        mod.addColumn("Mata_Kuliah");
        mod.addColumn("Dosen");
        mod.addColumn("SKS");
        mod.addColumn("Kelas");
        tabelinputkrs.setModel(mod);
        Connection conn=Koneksi.getConnection();
        try{
            java.sql.Statement smt = conn.createStatement();
            SQL ="Select*from tb_input";
            java.sql.ResultSet res = smt.executeQuery(SQL);
            while(res.next()){
                mod.addRow(new Object[]{
                    res.getString("No"),
                    res.getString("Kode"),
                    res.getString("Mata_Kuliah"),
                    res.getString("Dosen"),
                    res.getString("SKS"),
                    res.getString("Kelas"),
                    
                });
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textno = new javax.swing.JTextField();
        textkode = new javax.swing.JTextField();
        textmata_kuliah = new javax.swing.JTextField();
        textdosen = new javax.swing.JTextField();
        textsks = new javax.swing.JTextField();
        textkelas = new javax.swing.JTextField();
        btncreate = new javax.swing.JButton();
        btnread = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelinputkrs = new javax.swing.JTable();
        btncetak = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\aulia bc 2.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\aulia bc 2.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setText("DATA INPUT KRS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kode");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mata_Kuliah");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Dosen");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("SKS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Kelas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 30));
        jPanel1.add(textno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 290, 30));
        jPanel1.add(textkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 290, 30));
        jPanel1.add(textmata_kuliah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 290, 30));
        jPanel1.add(textdosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 290, 30));
        jPanel1.add(textsks, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 290, 30));
        jPanel1.add(textkelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 290, 30));

        btncreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncreate.setText("CREATE");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        jPanel1.add(btncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        btnread.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnread.setText("READ");
        btnread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreadActionPerformed(evt);
            }
        });
        jPanel1.add(btnread, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        tabelinputkrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Mata_Kuliah", "Dosen", "SKS", "Kelas"
            }
        ));
        tabelinputkrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelinputkrsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelinputkrs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 690, 120));

        btncetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncetak.setText("CETAK");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });
        jPanel1.add(btncetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 80, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PengelolaanKRS/aulia bc 2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try{
            String sql = "UPDATE tb_input SET Kode ='"+textkode.getText()+"', Mata_Kuliah='"+textmata_kuliah.getText()+"', Dosen='"+textdosen.getText()+"', SKS='"+textsks.getText()+"', Kelas='"+textkelas.getText()+"' WHERE No= '"+textno.getText()+"'";
            java.sql.Connection conn=(Connection) Koneksi.getConnection();
            java.sql.PreparedStatement smt = conn.prepareStatement(sql);
            smt.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal di SImpan"+e.getMessage());
        }
        tampilandata();
        input();
    }                                         

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {  
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
       MenuUtama xx;
       xx = new MenuUtama();
       xx.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int i = tabelinputkrs.getSelectedRow();
        if(i == -1){
            return;
        }
        
        String No = (String)mod.getValueAt(i, 0);
        
        int question =JOptionPane.showConfirmDialog(null, "Yakin Data Akan Terhapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(question == JOptionPane.OK_OPTION){
        try{
            Connection conn = Koneksi.getConnection();
            String sql = "DELETE FROM tb_input WHERE No = ?";
            try (PreparedStatement p = conn.prepareStatement(sql)) {
                String no = null;
                p.setString(1, No);
                p.executeUpdate();
            }
            JOptionPane.showMessageDialog(null,"Data Berhasil Terhapus");
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
        if(question == JOptionPane.CANCEL_OPTION){
    }                                         
       
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        try{
            Connection conn = Koneksi.getConnection();
            PreparedStatement smt = conn.prepareStatement
            ("insert into tb_input (No, Kode, Mata_kuliah, Dosen, SKS, Kelas)value(?,?,?,?,?,?)");
            smt.setString(1, textno.getText());
            smt.setString(2, textkode.getText());
            smt.setString(3, textmata_kuliah.getText());
            smt.setString(4, textdosen.getText());
            smt.setString(5, textsks.getText());
            smt.setString(6, textkelas.getText());
            smt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Sukses Ditambahkan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            tampilandata();
            input();
        }catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreadActionPerformed
        try{
            Connection conn = Koneksi.getConnection();
            PreparedStatement smt = conn.prepareStatement
            ("insert into tb_input (No, Kode, Mata_kuliah, Dosen, SKS, Kelas)value(?,?,?,?,?,?)");
            smt.setString(1, textno.getText());
            smt.setString(2, textkode.getText());
            smt.setString(3, textmata_kuliah.getText());
            smt.setString(4, textdosen.getText());
            smt.setString(5, textsks.getText());
            smt.setString(6, textkelas.getText());
            smt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Sukses Disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            tampilandata();
            input();
        }catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnreadActionPerformed

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        try{
           JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("report2.jasper"), null, Koneksi.getConnection());
           JasperViewer.viewReport(jp, false);
       
       }catch (JRException e){
           JOptionPane.showMessageDialog(rootPane, e);
       }
    }//GEN-LAST:event_btncetakActionPerformed

    private void tabelinputkrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelinputkrsMouseClicked
try{
             Connection conn = Koneksi.getConnection();
             int row = tabelinputkrs.getSelectedRow();
             String tabel_klik = (tabelinputkrs.getModel().getValueAt(row, 0).toString());
             java.sql.Statement smt = conn.createStatement();
             java.sql.ResultSet sql = smt.executeQuery("select * from tb_input where No = '"+tabel_klik+"'");
              
             if (sql.next()){
                 String No=sql.getString("No");
                 textno.setText(No);
                 String Kode=sql.getString("Kode");
                 textkode.setText(Kode);
                 String Mata_Kuliah=sql.getString("Mata_Kuliah");
                 textmata_kuliah.setText(Mata_Kuliah);
                 String Dosen=sql.getString("Dosen");
                 textdosen.setText(Dosen);
                 String SKS=sql.getString("SKS");
                 textsks.setText(SKS);
                 String Kelas=sql.getString("Kelas");
                 textkelas.setText(Kelas);
             }
             
             }catch (SQLException e){}        // TODO add your handling code here:
    }//GEN-LAST:event_tabelinputkrsMouseClicked

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
            java.util.logging.Logger.getLogger(TabelInputKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelInputKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelInputKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelInputKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TabelInputKRS().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnread;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelinputkrs;
    private javax.swing.JTextField textdosen;
    private javax.swing.JTextField textkelas;
    private javax.swing.JTextField textkode;
    private javax.swing.JTextField textmata_kuliah;
    private javax.swing.JTextField textno;
    private javax.swing.JTextField textsks;
    // End of variables declaration//GEN-END:variables
}
