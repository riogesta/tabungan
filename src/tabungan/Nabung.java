/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riogesta
 */
public class Nabung extends javax.swing.JFrame {

    /**
     * Creates new form nabung
     */
    static boolean maximized = true;
    int Xmouse;
    int Ymouse;
    
    DefaultTableModel model;
    
    public Nabung() {
        
        // Rounded UI
        //setLayout(null);
        setUndecorated(true);
        //setSize(400,300);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0,0, 712,447, 15,15)); // 0,0, horizontal, vertical, 15,15
        // end-Rounded UI
        
        initComponents();
        //
        fillComboBox();
        //
        tfKodePenabung.setVisible(false);
        tfNamaPenabung.setVisible(false);
        //
        String [] fieldMasuk = {"Kode","Nama", "Nabung", "Tanggal"};
        model = new DefaultTableModel(fieldMasuk, 0);
        tbNabung.setModel(model);
        showDataNabung();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDraggable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbPenabung = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfNabung = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dcTanggal = new com.toedter.calendar.JDateChooser();
        tfKodePenabung = new javax.swing.JTextField();
        tfNamaPenabung = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNabung = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nabung");

        panelDraggable.setBackground(new java.awt.Color(38, 78, 112));
        panelDraggable.setPreferredSize(new java.awt.Dimension(54, 30));
        panelDraggable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelDraggableMouseDragged(evt);
            }
        });
        panelDraggable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelDraggableMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(38, 78, 112));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back(white).png"))); // NOI18N
        jLabel1.setText("Kembali");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nabung");

        javax.swing.GroupLayout panelDraggableLayout = new javax.swing.GroupLayout(panelDraggable);
        panelDraggable.setLayout(panelDraggableLayout);
        panelDraggableLayout.setHorizontalGroup(
            panelDraggableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDraggableLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelDraggableLayout.setVerticalGroup(
            panelDraggableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDraggableLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setPreferredSize(new java.awt.Dimension(712, 399));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel2.setText("Penabung");

        cbPenabung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- pilih -" }));
        cbPenabung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPenabungActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel3.setText("Nabung");

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel5.setText("Tanggal");

        dcTanggal.setDateFormatString("d - MMMM - yyyy");

        btnSimpan.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        tbNabung.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbNabung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nama", "tanggal", "nabung"
            }
        ));
        tbNabung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNabungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNabung);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbPenabung, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNabung, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfNamaPenabung, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfKodePenabung, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbPenabung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dcTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNabung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNamaPenabung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKodePenabung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDraggable, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelDraggable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbPenabungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPenabungActionPerformed
        try {
            String sql = "SELECT * FROM tb_penabung WHERE nama = ?";
            Connection conn = (Connection) tabungan.Conn_db.mysqlconn();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cbPenabung.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            
            String n = "" ;
            String kode = "" ;
            while(rs.next()){
                n = (String) rs.getString("nama");
                kode = (String) rs.getString("kode_penabung");
                
            }
            
            tfKodePenabung.setText(kode);
            tfNamaPenabung.setText(n);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_cbPenabungActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            Connection conn = (Connection) tabungan.Conn_db.mysqlconn();
            conn.createStatement().executeUpdate("INSERT INTO tb_tabungan VALUES(null, '"+tfKodePenabung.getText()+"', '"+tfNabung.getText()+"', '"+((JTextField)dcTanggal.getDateEditor().getUiComponent()).getText()+"')");
            JOptionPane.showMessageDialog(this, "Tersimpan!");
            resetNabung();
            showDataNabung();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal tersimpan!\n"+e);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Kembali ke beranda
        new Beranda().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void panelDraggableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDraggableMouseDragged
        // TODO add your handling code here:
        if(maximized){
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - Xmouse, y - Ymouse);
        }
    }//GEN-LAST:event_panelDraggableMouseDragged

    private void panelDraggableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDraggableMousePressed
        // TODO add your handling code here:
        Xmouse =  evt.getX();
        Ymouse =  evt.getY();
    }//GEN-LAST:event_panelDraggableMousePressed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(18, 43, 64));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(38,78,112));
        
    }//GEN-LAST:event_jLabel1MouseExited

    private void tbNabungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNabungMouseClicked
        // TODO add your handling code here:
        int i = tbNabung.getSelectedRow();
        infoNabung in = new infoNabung();
        
        if(i > -1){
            
            String kodeNabung = model.getValueAt(i, 0).toString();
            String nama = model.getValueAt(i, 1).toString();
            String nabung = model.getValueAt(i, 2).toString();
            //String tgl = model.getValueAt(i, 3).toString();
            in.getData(kodeNabung, nama, nabung);
            
            this.dispose();
        }
    }//GEN-LAST:event_tbNabungMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nabung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nabung().setVisible(true);
            }
        });
    }
        
    // menampilkan data database ke combo box
    public void fillComboBox(){
        try {
            Connection conn = (Connection) tabungan.Conn_db.mysqlconn();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_penabung");
            
            while(rs.next()){
                cbPenabung.addItem(rs.getString("nama"));
            }
            
//            rs.close();
//            st.close();
//            conn.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Gagal menampilkan data penabung\n"+e);
        }
    }
    
    public void resetNabung(){
        tfKodePenabung.setText(null);
        cbPenabung.setSelectedItem("- pilih -");
        dcTanggal.setCalendar(null);
        tfNabung.setText(null);
    }
    
    public void showDataNabung(){
        
        int row = tbNabung.getRowCount();
        for(int i = 0 ; i < row ; i++){
            model.removeRow(0);
        }
        
        try{
            String sql = "SELECT tb_tabungan.kode_tabungan ,tb_penabung.nama, tb_tabungan.nabung, tb_tabungan.tgl "
                    + "FROM tb_penabung "
                    + "INNER JOIN tb_tabungan ON tb_tabungan.kode_penabung = tb_penabung.kode_penabung";
            Connection conn = (Connection) tabungan.Conn_db.mysqlconn();
            ResultSet rs = conn.createStatement().executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4)});
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "kesalahan\n"+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbPenabung;
    private com.toedter.calendar.JDateChooser dcTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDraggable;
    private javax.swing.JTable tbNabung;
    private javax.swing.JTextField tfKodePenabung;
    private javax.swing.JTextField tfNabung;
    private javax.swing.JTextField tfNamaPenabung;
    // End of variables declaration//GEN-END:variables
}
