
package com.mycompany.stokuygulamasi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Stokuygulamasi extends javax.swing.JFrame {

    public static TreeMap kullanicilar = new TreeMap();
    
    public static File dosya = new File("kullanici.txt");
    
    
    
    public Stokuygulamasi() {
        
        initComponents();
        this.setTitle("Giriş Yap");
        this.setResizable(false);
    }

    public String getLoginid() {
        return login_id.getText();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login_id = new javax.swing.JTextField();
        login_pw = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        kayitol_button = new javax.swing.JButton();
        login_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setText("Şifre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(login_pw, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(login_id))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        kayitol_button.setText("Kayıt Ol");
        kayitol_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitol_buttonActionPerformed(evt);
            }
        });

        login_button.setText("Giriş Yap");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(kayitol_button)
                .addGap(60, 60, 60)
                .addComponent(login_button)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitol_button)
                    .addComponent(login_button))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayitol_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitol_buttonActionPerformed
        setVisible(false);
        RegisterEkrani registerekrani = new RegisterEkrani();
        registerekrani.setVisible(true);
    }//GEN-LAST:event_kayitol_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        
        
        
        String id = login_id.getText();
        String pw = new String(login_pw.getPassword());
        
        
        
        if(kullanicilar.containsKey(login_id.getText())){
            if (pw.equals(kullanicilar.get(id))){
                JOptionPane.showMessageDialog(null, "Giriş Başarılı", "Başarılı" , JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                Stokekrani stokekrani = new Stokekrani(login_id.getText());
                stokekrani.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Yanlış Şifre Girdiniz", "Uyarı" , JOptionPane.WARNING_MESSAGE);
            }
            
        }
        else{
            int option = JOptionPane.showConfirmDialog(null, "Böyle Bir Kullanıcı Bulunmadı\nKayıt Olmak İstermisin" , "Bilgi" , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION){
                setVisible(false);
                RegisterEkrani a = new RegisterEkrani();
                a.setVisible(true);
                
            }
            else if (option == JOptionPane.NO_OPTION){
                
            }
            else {
                
            }
                    
        }
        
        
    }//GEN-LAST:event_login_buttonActionPerformed

    
    
    
    
    
    public static void main(String args[]) {
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=");
                String key = parts[0];
                String value = parts[1];
                kullanicilar.put(key, value);
            }
        } catch (IOException e) {
          e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stokuygulamasi().setVisible(true);
            }
          
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kayitol_button;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField login_id;
    private javax.swing.JPasswordField login_pw;
    // End of variables declaration//GEN-END:variables

}
