/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakkam;

/**
 *
 * @author lenovo
 */
public class ajukanJadwal extends javax.swing.JFrame {

    /**
     * Creates new form Mengajukan_jadwal
     */
    public ajukanJadwal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pengajuan_kegiatan = new javax.swing.JPanel();
        Judul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        List_pertanyaan = new javax.swing.JPanel();
        nama_kegiatan = new javax.swing.JPanel();
        pertanyaan = new javax.swing.JLabel();
        jawaban = new javax.swing.JTextField();
        tempat_kegiatan = new javax.swing.JPanel();
        pertanyaan2 = new javax.swing.JLabel();
        jawaban2 = new javax.swing.JTextField();
        waktu_mulai = new javax.swing.JPanel();
        pertanyaan3 = new javax.swing.JLabel();
        jawaban3 = new javax.swing.JTextField();
        waktu_selesai = new javax.swing.JPanel();
        pertanyaan4 = new javax.swing.JLabel();
        jawaban4 = new javax.swing.JTextField();
        penyelenggara = new javax.swing.JPanel();
        pertanyaan5 = new javax.swing.JLabel();
        jawaban5 = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pengajuan_kegiatan.setBackground(new java.awt.Color(0, 102, 102));

        Judul.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mengajukan Jadwal Kegiatan");

        javax.swing.GroupLayout JudulLayout = new javax.swing.GroupLayout(Judul);
        Judul.setLayout(JudulLayout);
        JudulLayout.setHorizontalGroup(
            JudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JudulLayout.setVerticalGroup(
            JudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JudulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        List_pertanyaan.setBackground(new java.awt.Color(0, 153, 153));

        nama_kegiatan.setBackground(new java.awt.Color(0, 153, 153));

        pertanyaan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pertanyaan.setForeground(new java.awt.Color(255, 255, 255));
        pertanyaan.setText("Nama Kegiatan     :");

        jawaban.setForeground(new java.awt.Color(153, 153, 153));
        jawaban.setText("nama kegiatan");
        jawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nama_kegiatanLayout = new javax.swing.GroupLayout(nama_kegiatan);
        nama_kegiatan.setLayout(nama_kegiatanLayout);
        nama_kegiatanLayout.setHorizontalGroup(
            nama_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nama_kegiatanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pertanyaan, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        nama_kegiatanLayout.setVerticalGroup(
            nama_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nama_kegiatanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nama_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nama_kegiatanLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pertanyaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jawaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        tempat_kegiatan.setBackground(new java.awt.Color(0, 153, 153));

        pertanyaan2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pertanyaan2.setForeground(new java.awt.Color(255, 255, 255));
        pertanyaan2.setText("Tempat Kegiatan  :");

        jawaban2.setForeground(new java.awt.Color(153, 153, 153));
        jawaban2.setText("tempat kegiatan");
        jawaban2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawaban2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tempat_kegiatanLayout = new javax.swing.GroupLayout(tempat_kegiatan);
        tempat_kegiatan.setLayout(tempat_kegiatanLayout);
        tempat_kegiatanLayout.setHorizontalGroup(
            tempat_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tempat_kegiatanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pertanyaan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jawaban2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        tempat_kegiatanLayout.setVerticalGroup(
            tempat_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tempat_kegiatanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tempat_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tempat_kegiatanLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pertanyaan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jawaban2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        waktu_mulai.setBackground(new java.awt.Color(0, 153, 153));

        pertanyaan3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pertanyaan3.setForeground(new java.awt.Color(255, 255, 255));
        pertanyaan3.setText("Waktu Mulai         :");

        jawaban3.setForeground(new java.awt.Color(153, 153, 153));
        jawaban3.setText("waktu mulai");
        jawaban3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawaban3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout waktu_mulaiLayout = new javax.swing.GroupLayout(waktu_mulai);
        waktu_mulai.setLayout(waktu_mulaiLayout);
        waktu_mulaiLayout.setHorizontalGroup(
            waktu_mulaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waktu_mulaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pertanyaan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jawaban3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        waktu_mulaiLayout.setVerticalGroup(
            waktu_mulaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, waktu_mulaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(waktu_mulaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(waktu_mulaiLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pertanyaan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jawaban3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        waktu_selesai.setBackground(new java.awt.Color(0, 153, 153));

        pertanyaan4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pertanyaan4.setForeground(new java.awt.Color(255, 255, 255));
        pertanyaan4.setText("Waktu Selesai       :");

        jawaban4.setForeground(new java.awt.Color(153, 153, 153));
        jawaban4.setText("waktu selesai");
        jawaban4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawaban4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout waktu_selesaiLayout = new javax.swing.GroupLayout(waktu_selesai);
        waktu_selesai.setLayout(waktu_selesaiLayout);
        waktu_selesaiLayout.setHorizontalGroup(
            waktu_selesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waktu_selesaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pertanyaan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jawaban4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        waktu_selesaiLayout.setVerticalGroup(
            waktu_selesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, waktu_selesaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(waktu_selesaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(waktu_selesaiLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pertanyaan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jawaban4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        penyelenggara.setBackground(new java.awt.Color(0, 153, 153));

        pertanyaan5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pertanyaan5.setForeground(new java.awt.Color(255, 255, 255));
        pertanyaan5.setText("Penyelenggara     :");

        jawaban5.setForeground(new java.awt.Color(153, 153, 153));
        jawaban5.setText("nama lembaga");
        jawaban5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawaban5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout penyelenggaraLayout = new javax.swing.GroupLayout(penyelenggara);
        penyelenggara.setLayout(penyelenggaraLayout);
        penyelenggaraLayout.setHorizontalGroup(
            penyelenggaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penyelenggaraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pertanyaan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jawaban5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        penyelenggaraLayout.setVerticalGroup(
            penyelenggaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyelenggaraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penyelenggaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penyelenggaraLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pertanyaan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jawaban5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout List_pertanyaanLayout = new javax.swing.GroupLayout(List_pertanyaan);
        List_pertanyaan.setLayout(List_pertanyaanLayout);
        List_pertanyaanLayout.setHorizontalGroup(
            List_pertanyaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nama_kegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tempat_kegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(waktu_mulai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(waktu_selesai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(penyelenggara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        List_pertanyaanLayout.setVerticalGroup(
            List_pertanyaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List_pertanyaanLayout.createSequentialGroup()
                .addComponent(nama_kegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempat_kegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waktu_mulai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waktu_selesai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(penyelenggara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Submit.setBackground(new java.awt.Color(0, 102, 102));
        Submit.setText("Kirim");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Kembali.setBackground(new java.awt.Color(0, 102, 102));
        Kembali.setText("Kembali");

        javax.swing.GroupLayout Pengajuan_kegiatanLayout = new javax.swing.GroupLayout(Pengajuan_kegiatan);
        Pengajuan_kegiatan.setLayout(Pengajuan_kegiatanLayout);
        Pengajuan_kegiatanLayout.setHorizontalGroup(
            Pengajuan_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pengajuan_kegiatanLayout.createSequentialGroup()
                .addGroup(Pengajuan_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pengajuan_kegiatanLayout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(Kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Pengajuan_kegiatanLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(List_pertanyaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        Pengajuan_kegiatanLayout.setVerticalGroup(
            Pengajuan_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pengajuan_kegiatanLayout.createSequentialGroup()
                .addComponent(Judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(List_pertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pengajuan_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(Kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pengajuan_kegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pengajuan_kegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jawabanActionPerformed

    private void jawaban2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawaban2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jawaban2ActionPerformed

    private void jawaban3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawaban3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jawaban3ActionPerformed

    private void jawaban4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawaban4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jawaban4ActionPerformed

    private void jawaban5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawaban5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jawaban5ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(ajukanJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajukanJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajukanJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajukanJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajukanJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Judul;
    private javax.swing.JButton Kembali;
    private javax.swing.JPanel List_pertanyaan;
    private javax.swing.JPanel Pengajuan_kegiatan;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jawaban;
    private javax.swing.JTextField jawaban2;
    private javax.swing.JTextField jawaban3;
    private javax.swing.JTextField jawaban4;
    private javax.swing.JTextField jawaban5;
    private javax.swing.JPanel nama_kegiatan;
    private javax.swing.JPanel penyelenggara;
    private javax.swing.JLabel pertanyaan;
    private javax.swing.JLabel pertanyaan2;
    private javax.swing.JLabel pertanyaan3;
    private javax.swing.JLabel pertanyaan4;
    private javax.swing.JLabel pertanyaan5;
    private javax.swing.JPanel tempat_kegiatan;
    private javax.swing.JPanel waktu_mulai;
    private javax.swing.JPanel waktu_selesai;
    // End of variables declaration//GEN-END:variables
}
