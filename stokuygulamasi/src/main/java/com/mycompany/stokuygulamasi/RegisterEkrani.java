
package com.mycompany.stokuygulamasi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegisterEkrani extends javax.swing.JFrame {

    
    public RegisterEkrani() {
        initComponents();
        this.setTitle("Kayıt Ol");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        register_id = new javax.swing.JTextField();
        register_pw = new javax.swing.JPasswordField();
        register_code = new javax.swing.JPasswordField();
        register_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));

        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setText("Şifre:");

        jLabel3.setText("Kayıt olmak İçin Kod:");

        register_button.setText("Kayıt Ol");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(register_code, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(register_pw)
                            .addComponent(register_id)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(register_button)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(register_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(register_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(register_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(register_button)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        
        String kullaniciadi = register_id.getText();
        String pw = new String(register_pw.getPassword());
        String code = new String(register_code.getPassword());
        
        
        if (code.equals("3210")){
            Stokuygulamasi.kullanicilar.put(kullaniciadi, pw);
            JOptionPane.showMessageDialog(null, "Başarıyla Kayıt Yapıldı" , "Başarılı" , JOptionPane.INFORMATION_MESSAGE);
            if (!Stokuygulamasi.dosya.exists()){
                try {
                    Stokuygulamasi.dosya.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(RegisterEkrani.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                FileWriter yazici1 = null;
                try {
                    yazici1 = new FileWriter(Stokuygulamasi.dosya,true);
                } catch (IOException ex) {
                    Logger.getLogger(RegisterEkrani.class.getName()).log(Level.SEVERE, null, ex);
                }
                BufferedWriter yazici = new BufferedWriter(yazici1);
                
                try {
                    yazici.append(kullaniciadi + "=");
                } catch (IOException ex) {
                    Logger.getLogger(RegisterEkrani.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    yazici.append(pw + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(RegisterEkrani.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    yazici.close();
                } catch (IOException ex) {
                    Logger.getLogger(RegisterEkrani.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            setVisible(false);
            Stokuygulamasi yeni = new Stokuygulamasi();
            yeni.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kodu Yanlış girdiniz Yöneticiniz ile iletişime Geçin" , "Uyarı !" , JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_register_buttonActionPerformed

    
    public static void main(String args[]) {
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton register_button;
    private javax.swing.JPasswordField register_code;
    private javax.swing.JTextField register_id;
    private javax.swing.JPasswordField register_pw;
    // End of variables declaration//GEN-END:variables
}
