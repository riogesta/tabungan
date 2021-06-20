/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static tabungan.Beranda.maximized;

/**
 *
 * @author fauziah khoerunnisa
 */
public class ambilTabungan extends javax.swing.JFrame {

    /**
     * Creates new form ambilTabungan
     */
    static boolean maximized = true;
    int Xmouse;
    int Ymouse;
    
    DefaultTableModel model;
    
    public ambilTabungan() {
        
        // Rounded UI
        //setLayout(null);
        setUndecorated(true);
        //setSize(400,300);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0,0, 524,420, 15,15)); // 0,0, horizontal, vertical, 15,15
        // end-Rounded UI
        
        initComponents();
        fillComboBox();
        tfKodePenabung.setVisible(false);
        tfBebas.setVisible(false);
        
        String [] fieldMasuk = {"Kode","Nama", "Diambil", "Tanggal ambil"};
        model = new DefaultTableModel(fieldMasuk, 0);
        tbAmbilTabung.setModel(model);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        paneDraggable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfBebas = new javax.swing.JTextField();
        tfSaldoAmbil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAmbil = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAmbilTabung = new javax.swing.JTable();
        lblSisa = new javax.swing.JLabel();
        cbPenabung = new javax.swing.JComboBox<>();
        tfKodePenabung = new javax.swing.JTextField();
        dcTanggalAmbil = new com.toedter.calendar.JDateChooser();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ambil Tabungan");
        setPreferredSize(new java.awt.Dimension(524, 420));
        setResizable(false);

        paneDraggable.setBackground(new java.awt.Color(38, 78, 112));
        paneDraggable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paneDraggableMouseDragged(evt);
            }
        });
        paneDraggable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paneDraggableMousePressed(evt);
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

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ambil Tabungan");

        javax.swing.GroupLayout paneDraggableLayout = new javax.swing.GroupLayout(paneDraggable);
        paneDraggable.setLayout(paneDraggableLayout);
        paneDraggableLayout.setHorizontalGroup(
            paneDraggableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDraggableLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        paneDraggableLayout.setVerticalGroup(
            paneDraggableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel2.setText("Nama Penabung");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel3.setText("Tanggal ambil");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel4.setText("Saldo yang diambil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel1.add(tfBebas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 33, -1));
        jPanel1.add(tfSaldoAmbil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 184, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel5.setText("Sisa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        btnAmbil.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        btnAmbil.setText("Ambil");
        btnAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbilActionPerformed(evt);
            }
        });
        jPanel1.add(btnAmbil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 74, 34));

        btnCetak.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });
        jPanel1.add(btnCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 190, -1, 30));

        tbAmbilTabung.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tbAmbilTabung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Tabungan", "Nama", "Saldo yang diambil", "Sisa"
            }
        ));
        tbAmbilTabung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAmbilTabungMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbAmbilTabung);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 450, 140));

        lblSisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSisa.setText("0");
        jPanel1.add(lblSisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        cbPenabung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- pilih -" }));
        cbPenabung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPenabungActionPerformed(evt);
            }
        });
        jPanel1.add(cbPenabung, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 184, -1));
        jPanel1.add(tfKodePenabung, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 27, -1));

        dcTanggalAmbil.setDateFormatString("YYYY-MM-d");
        jPanel1.add(dcTanggalAmbil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 184, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addComponent(paneDraggable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneDraggable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbilActionPerformed
        try {
            
            // ~ cek sisa tabungan
            // cek semua uang yang di ambil
            String sqlAmbil = "SELECT SUM(ambil) FROM tb_ambiltabungan WHERE kode_penabung="+tfKodePenabung.getText()+"";
            // cek semua uang yang di tabung
            String sqlTabungan = "SELECT SUM(nabung) FROM tb_tabungan WHERE kode_penabung="+tfKodePenabung.getText()+"";
            Connection conn = (Connection) tabungan.Conn_db.mysqlconn();
            ResultSet rsAmbil = conn.createStatement().executeQuery(sqlAmbil);
            ResultSet rsTabungan = conn.createStatement().executeQuery(sqlTabungan);
            
            if (rsAmbil.next() & rsTabungan.next()){
                int ambil = rsAmbil.getInt("SUM(ambil)");
                int tabungan = rsTabungan.getInt("SUM(nabung)");
                int sisa = tabungan - ambil;
                
                if (sisa == 0) {
                    JOptionPane.showMessageDialog(this, "saldo kamu "+sisa+" rupiah\npengambilan tidak di perbolehkan ");
                    return ;
                } else if (Integer.parseInt(tfSaldoAmbil.getText()) > sisa) {
                    JOptionPane.showMessageDialog(this, "saldo kamu tidak cukup");
                    return ;
                }
            }
            
            //Connection conn = (Connection) tabungan.Conn_db.mysqlconn();
            conn.createStatement().executeUpdate("INSERT INTO tb_ambiltabungan VALUES(null, '"+tfKodePenabung.getText()+"', '"+tfSaldoAmbil.getText()+"', '"+((JTextField)dcTanggalAmbil.getDateEditor().getUiComponent()).getText()+"')");
            JOptionPane.showMessageDialog(this, "Tersimpan!");
            resetAmbilTabungan();
            showDataNabung();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal tersimpan!\n"+e);
        }
    }//GEN-LAST:event_btnAmbilActionPerformed

    private void cbPenabungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPenabungActionPerformed
        // TODO add your handling code here:
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
            
            // ~ cek sisa tabungan
            // cek semua uang yang di ambil
            String sqlAmbil = "SELECT SUM(ambil) FROM tb_ambiltabungan WHERE kode_penabung="+Integer.parseInt(kode)+"";
            // cek semua uang yang di tabung
            String sqlTabungan = "SELECT SUM(nabung) FROM tb_tabungan WHERE kode_penabung="+Integer.parseInt(kode)+"";
            
            ResultSet rsAmbil = conn.createStatement().executeQuery(sqlAmbil);
            ResultSet rsTabungan = conn.createStatement().executeQuery(sqlTabungan);
            
            if (rsAmbil.next() & rsTabungan.next()){
                int ambil = rsAmbil.getInt("SUM(ambil)");
                int tabungan = rsTabungan.getInt("SUM(nabung)");
                
                int sisa = tabungan - ambil;
                lblSisa.setText(Integer.toString(sisa));
            }
            
            
            tfKodePenabung.setText(kode);
            tfBebas.setText(n);
        } catch (Exception e) {
          
        }
    }//GEN-LAST:event_cbPenabungActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        try {
            Connection koneksi = tabungan.Conn_db.mysqlconn();
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("cetakAmbilTabungan.jasper"), null, koneksi);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void paneDraggableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneDraggableMouseDragged
        // TODO add your handling code here:
        if(maximized){
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - Xmouse, y - Ymouse);
        }
    }//GEN-LAST:event_paneDraggableMouseDragged

    private void paneDraggableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneDraggableMousePressed
        // TODO add your handling code here:
        Xmouse =  evt.getX();
        Ymouse =  evt.getY();
    }//GEN-LAST:event_paneDraggableMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new Beranda().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(18, 43, 64));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setBackground(new Color(38,78,112));
    }//GEN-LAST:event_jLabel1MouseExited

    private void tbAmbilTabungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAmbilTabungMouseClicked
        // TODO add your handling code here:
        int i = tbAmbilTabung.getSelectedRow();
        infoAmbilTabungan info = new infoAmbilTabungan();
        
        if(i > -1){
            
            String kodeAmbil = model.getValueAt(i, 0).toString();
            String nama = model.getValueAt(i, 1).toString();
            String ambil = model.getValueAt(i, 2).toString();
            String tgl = model.getValueAt(i, 3).toString();
            info.getData(kodeAmbil, ambil, nama, tgl);
            
            this.dispose();
        }
    }//GEN-LAST:event_tbAmbilTabungMouseClicked

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
            java.util.logging.Logger.getLogger(ambilTabungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ambilTabungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ambilTabungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ambilTabungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ambilTabungan().setVisible(true);
            }
        });
    }
    
    public void resetAmbilTabungan () {
        tfKodePenabung.setText(null);
        cbPenabung.setSelectedItem(null);
        ((JTextField)dcTanggalAmbil.getDateEditor().getUiComponent()).setText(null);
        tfSaldoAmbil.setText(null);
        lblSisa.setText("0");
    }
    
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
    
    public void showDataNabung(){
        int row = tbAmbilTabung.getRowCount();
        for(int i = 0 ; i < row ; i++){
            model.removeRow(0);
        }
        
        try{
            String sql = "SELECT tb_ambiltabungan.kode_ambil, tb_penabung.nama, tb_ambiltabungan.ambil , DATE_FORMAT(tb_ambiltabungan.tgl_ambil, '%d-%M-%Y')\n" +
                            "FROM tb_penabung\n" +
                            "INNER JOIN tb_ambiltabungan ON tb_ambiltabungan.kode_penabung = tb_penabung.kode_penabung";
                    
            Connection conn = (Connection) tabungan.Conn_db.mysqlconn();
            ResultSet rs = conn.createStatement().executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4)});
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "kesalahan\n"+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmbil;
    private javax.swing.JButton btnCetak;
    private javax.swing.JComboBox<String> cbPenabung;
    private com.toedter.calendar.JDateChooser dcTanggalAmbil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSisa;
    private javax.swing.JPanel paneDraggable;
    private javax.swing.JTable tbAmbilTabung;
    private javax.swing.JTextField tfBebas;
    private javax.swing.JTextField tfKodePenabung;
    private javax.swing.JTextField tfSaldoAmbil;
    // End of variables declaration//GEN-END:variables
}
