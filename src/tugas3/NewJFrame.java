/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author RANGGA
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        bgbutton = new javax.swing.ButtonGroup();
        lblnama = new javax.swing.JLabel();
        lbllahir = new javax.swing.JLabel();
        lbljeniskelamin = new javax.swing.JLabel();
        lblhobi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txthasil = new javax.swing.JTextArea();
        txtnama = new javax.swing.JTextField();
        txtlahir = new javax.swing.JTextField();
        jrpria = new javax.swing.JRadioButton();
        jrwanita = new javax.swing.JRadioButton();
        cbjalan = new javax.swing.JCheckBox();
        cbolahraga = new javax.swing.JCheckBox();
        cbtidur = new javax.swing.JCheckBox();
        cbbaca = new javax.swing.JCheckBox();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnama.setText("NAMA");

        lbllahir.setText("TTL");

        lbljeniskelamin.setText("JENIS KELAMIN");

        lblhobi.setText("HOBI");

        txthasil.setColumns(20);
        txthasil.setRows(5);
        jScrollPane1.setViewportView(txthasil);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txtlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlahirActionPerformed(evt);
            }
        });

        jrpria.setText("PRIA");

        jrwanita.setText("WANITA");
        jrwanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrwanitaActionPerformed(evt);
            }
        });

        cbjalan.setText("JALAN");
        cbjalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjalanActionPerformed(evt);
            }
        });

        cbolahraga.setText("OLAHRAGA");

        cbtidur.setText("TIDUR");

        cbbaca.setText("BACA");

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnama)
                            .addComponent(lbllahir))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbljeniskelamin)
                            .addComponent(lblhobi))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbjalan)
                            .addComponent(jrwanita)
                            .addComponent(jrpria)
                            .addComponent(cbolahraga)
                            .addComponent(cbbaca)
                            .addComponent(cbtidur)
                            .addComponent(btnok))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnama)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllahir)
                    .addComponent(txtlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbljeniskelamin)
                    .addComponent(jrpria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrwanita)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhobi)
                    .addComponent(cbjalan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbolahraga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbtidur)
                .addGap(18, 18, 18)
                .addComponent(btnok)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlahirActionPerformed

    private void jrwanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrwanitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrwanitaActionPerformed

    private void cbjalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjalanActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        if(txtNama.getText().equals("")||txtLahir.getText().equals("")||bgButton.getSelection().equals("")){
           textHasil.setText("jangan kosong");
    }//GEN-LAST:event_btnokActionPerformed
}else{
       String jeniskelamin;
       StringBuffer hobi = new StringBuffer();
       if(jrPria.isSelected())
           jeniskelamin="Pria";
       else
           jeniskelamin="Wanita";
       if(cbBaca.isSelected()){
           hobi.append(cbBaca.getText()+""+",");
       }
       if(cbOlahraga.isSelected()){
           hobi.append(cbOlahraga.getText()+""+",");
       }
       if(cbJalan.isSelected()){
           hobi.append(cbJalan.getText()+""+",");
       }
       if(cbTidur.isSelected()){
           hobi.append(cbTidur.getText()+""+",");
       }
textHasil.setText("Nama : "+txtNama.getText()+"\n" +"Lahir : "+txtLahir.getText()+"\n"+"Gender : "+JenKel+"\n"+"Hobi : "+hobi.toString());
    }                                     


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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgbutton;
    private javax.swing.JButton btnok;
    private javax.swing.JCheckBox cbbaca;
    private javax.swing.JCheckBox cbjalan;
    private javax.swing.JCheckBox cbolahraga;
    private javax.swing.JCheckBox cbtidur;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrpria;
    private javax.swing.JRadioButton jrwanita;
    private javax.swing.JLabel lblhobi;
    private javax.swing.JLabel lbljeniskelamin;
    private javax.swing.JLabel lbllahir;
    private javax.swing.JLabel lblnama;
    private javax.swing.JTextArea txthasil;
    private javax.swing.JTextField txtlahir;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
