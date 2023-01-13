/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rehber;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class rehberFrame extends javax.swing.JFrame {

    Map<String, KisiOlustur> rehber = new TreeMap<>();
    
    
    
    public rehberFrame() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kisiEkle = new javax.swing.JButton();
        kisileriYazdir = new javax.swing.JButton();
        kisiSil = new javax.swing.JButton();
        kisiAra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kisiEkle.setText("Kişi Ekle");
        kisiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisiEkleActionPerformed(evt);
            }
        });

        kisileriYazdir.setText("Kişileri Görüntüle");
        kisileriYazdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisileriYazdirActionPerformed(evt);
            }
        });

        kisiSil.setText("Kişi sil");
        kisiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisiSilActionPerformed(evt);
            }
        });

        kisiAra.setText("Kişi Ara");
        kisiAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisiAraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kisiAra)
                            .addComponent(kisiSil)
                            .addComponent(kisiEkle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(kisileriYazdir)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(kisiEkle)
                .addGap(18, 18, 18)
                .addComponent(kisileriYazdir)
                .addGap(18, 18, 18)
                .addComponent(kisiSil)
                .addGap(18, 18, 18)
                .addComponent(kisiAra)
                .addContainerGap(89, Short.MAX_VALUE))
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

    private void kisileriYazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisileriYazdirActionPerformed
        
        StringBuilder buildedstring = new StringBuilder();
        rehberFrame rehberframe = new rehberFrame();
        
        int i = 0;
        for (Map.Entry<String, KisiOlustur> entry : rehber.entrySet()) {
            i++;
            buildedstring.append(i + ". Kişi -> İsim: " + entry.getValue().isim + "\n               Soyisim: " + entry.getValue().soyisim + "\n               Numara: " + entry.getValue().numara +"\n");
            
        }
        JOptionPane.showMessageDialog(null, buildedstring);
        
    }//GEN-LAST:event_kisileriYazdirActionPerformed

    
    
    private void kisiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisiEkleActionPerformed
        setVisible(false);
        String isim = JOptionPane.showInputDialog("Kişi ismini giriniz");
        String soyisim = JOptionPane.showInputDialog("Kişi soyismini giriniz");
        String numara = JOptionPane.showInputDialog("Kişi telefonunu giriniz");
        
        
        rehber.put(isim,new KisiOlustur(isim, soyisim, numara));                                
        setVisible(true);
    }//GEN-LAST:event_kisiEkleActionPerformed

    
    
    
    private void kisiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisiSilActionPerformed
        
        setVisible(false);
        
        String isim = JOptionPane.showInputDialog("Silinecek Kişinin ismini giriniz");
        
        if (rehber.containsKey(isim)){
            rehber.remove(isim);
            JOptionPane.showMessageDialog(null, isim + " Kişisi Rehberden silindi.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Rehberde Böyle bir kişi bulunmadı");
        }
        
        setVisible(true);
    }//GEN-LAST:event_kisiSilActionPerformed

    
    
    
    private void kisiAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisiAraActionPerformed

        setVisible(false);
        String isim = JOptionPane.showInputDialog("Aranacak Kişinin ismini giriniz");
        
        rehberFrame rehberframe = new rehberFrame();
        
        
        
        
        if (rehber.containsKey(isim)){
            JOptionPane.showMessageDialog(null, "Aranan Kişinin Bilgileri -> \n\nİsim : " + rehber.get(isim).isim +"\nSoyisim : " + rehber.get(isim).soyisim + "\nTelefon : " + rehber.get(isim).numara);
        }
        else{
            JOptionPane.showMessageDialog(null, "Rehberde Böyle bir kişi bulunmadı");
        }
        
        setVisible(true);
    }//GEN-LAST:event_kisiAraActionPerformed

    
    
    
    public static void main(String args[]) {
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rehberFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kisiAra;
    private javax.swing.JButton kisiEkle;
    private javax.swing.JButton kisiSil;
    private javax.swing.JButton kisileriYazdir;
    // End of variables declaration//GEN-END:variables
}
