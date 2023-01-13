
package com.mycompany.tombala;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tombala extends javax.swing.JFrame {
    public static ArrayList<String> list = new ArrayList<String>();
    static int topsayisi;
    static Random random = new Random();
    private static final int bir = random.nextInt(1,10);
    private static final int onbir = random.nextInt(10,16);
    private static final int oniki = random.nextInt(16,20);
    private static final int yirmibir = random.nextInt(20,30);
    private static final int otuzbir = random.nextInt(30,36);
    private static final int otuziki = random.nextInt(36,40);
    private static final int kirkbir = random.nextInt(40,50);
    private static final int ellibir = random.nextInt(50,56);
    private static final int elliiki = random.nextInt(56,60);
    private static final int altmisbir = random.nextInt(60,70);
    private static final int yetmisbir = random.nextInt(70,76);
    private static final int yetmisiki = random.nextInt(76,80);
    private static final int seksenbir = random.nextInt(80,84);
    private static final int sekseniki = random.nextInt(84,87);
    private static final int seksenuc = random.nextInt(87,90);
    RandomElementDondur randomElementDondur = new RandomElementDondur();
    public Tombala() {
        initComponents();
        
        rakam.setText(Integer.toString(bir));
        on1.setText(Integer.toString(onbir));
        on2.setText(Integer.toString(oniki));
        yirmi1.setText(Integer.toString(yirmibir));
        otuz1.setText(Integer.toString(otuzbir));
        otuz2.setText(Integer.toString(otuziki));
        kirk1.setText(Integer.toString(kirkbir));
        elli1.setText(Integer.toString(ellibir));
        elli2.setText(Integer.toString(elliiki));
        altmis1.setText(Integer.toString(altmisbir));
        yetmis1.setText(Integer.toString(yetmisbir));
        yetmis2.setText(Integer.toString(yetmisiki));
        seksen1.setText(Integer.toString(seksenbir));
        seksen2.setText(Integer.toString(sekseniki));
        seksen3.setText(Integer.toString(seksenuc));
        
        int i ; 
        for(i = 1 ; i< 90 ; i++){
            list.add(Integer.toString(i));
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sayi_paneli = new javax.swing.JPanel();
        cikan_sayi = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CekilenTopsayisi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        seksen1 = new javax.swing.JLabel();
        seksen3 = new javax.swing.JLabel();
        otuz1 = new javax.swing.JLabel();
        seksen2 = new javax.swing.JLabel();
        yetmis1 = new javax.swing.JLabel();
        elli1 = new javax.swing.JLabel();
        yirmi1 = new javax.swing.JLabel();
        on1 = new javax.swing.JLabel();
        on2 = new javax.swing.JLabel();
        yetmis2 = new javax.swing.JLabel();
        elli2 = new javax.swing.JLabel();
        altmis1 = new javax.swing.JLabel();
        otuz2 = new javax.swing.JLabel();
        kirk1 = new javax.swing.JLabel();
        rakam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tombala");
        getContentPane().setLayout(null);

        sayi_paneli.setBackground(new java.awt.Color(255, 204, 0));

        cikan_sayi.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        cikan_sayi.setText("0");

        jButton1.setText("Yeni Sayi Çek");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Çekilen Top Sayısı =");

        CekilenTopsayisi.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel3.setText("Çekilen Sayı : ");

        javax.swing.GroupLayout sayi_paneliLayout = new javax.swing.GroupLayout(sayi_paneli);
        sayi_paneli.setLayout(sayi_paneliLayout);
        sayi_paneliLayout.setHorizontalGroup(
            sayi_paneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sayi_paneliLayout.createSequentialGroup()
                .addGroup(sayi_paneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sayi_paneliLayout.createSequentialGroup()
                        .addGap(132, 217, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cikan_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(sayi_paneliLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CekilenTopsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1)
                .addGap(147, 147, 147))
        );
        sayi_paneliLayout.setVerticalGroup(
            sayi_paneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sayi_paneliLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(sayi_paneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sayi_paneliLayout.createSequentialGroup()
                        .addGroup(sayi_paneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cikan_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sayi_paneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CekilenTopsayisi))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sayi_paneliLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(28, 28, 28))))
        );

        getContentPane().add(sayi_paneli);
        sayi_paneli.setBounds(6, 0, 700, 120);

        seksen1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seksen1.setText("seksen1");
        getContentPane().add(seksen1);
        seksen1.setBounds(640, 160, 37, 25);

        seksen3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seksen3.setText("seksen3");
        getContentPane().add(seksen3);
        seksen3.setBounds(630, 260, 50, 25);

        otuz1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        otuz1.setText("otuz1");
        getContentPane().add(otuz1);
        otuz1.setBounds(260, 150, 40, 25);

        seksen2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seksen2.setText("seksen2");
        getContentPane().add(seksen2);
        seksen2.setBounds(640, 210, 37, 25);

        yetmis1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yetmis1.setText("yetmis1");
        getContentPane().add(yetmis1);
        yetmis1.setBounds(560, 160, 50, 25);

        elli1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elli1.setText("elli1");
        getContentPane().add(elli1);
        elli1.setBounds(420, 150, 40, 25);

        yirmi1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yirmi1.setText("yirmi1");
        getContentPane().add(yirmi1);
        yirmi1.setBounds(180, 200, 40, 25);

        on1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        on1.setText("on1");
        getContentPane().add(on1);
        on1.setBounds(110, 150, 40, 25);

        on2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        on2.setText("on2");
        getContentPane().add(on2);
        on2.setBounds(110, 260, 40, 25);

        yetmis2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yetmis2.setText("yetmis2");
        getContentPane().add(yetmis2);
        yetmis2.setBounds(550, 260, 66, 25);

        elli2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elli2.setText("elli2");
        getContentPane().add(elli2);
        elli2.setBounds(410, 260, 30, 25);

        altmis1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        altmis1.setText("altmis1");
        getContentPane().add(altmis1);
        altmis1.setBounds(480, 210, 63, 25);

        otuz2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        otuz2.setText("otuz2");
        getContentPane().add(otuz2);
        otuz2.setBounds(260, 260, 40, 25);

        kirk1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kirk1.setText("kirk1");
        getContentPane().add(kirk1);
        kirk1.setBounds(340, 210, 30, 25);

        rakam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rakam.setText("rakam");
        getContentPane().add(rakam);
        rakam.setBounds(30, 210, 40, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Onur\\Documents\\NetBeansProjects\\tombala\\indir.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 120, 710, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void alkisSesi() {
        
        try {
                File file = new File("tombala.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
         
               } catch (Exception e) {
                   
                System.err.println(e.getMessage());
        }
        
        
    }
    public void buldunSesi() {
        
        try {
                File file = new File("bulunca.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
         
               } catch (Exception e) {
                   
                System.err.println(e.getMessage());
        }
        
        
    }
    public void sayicekildiSesi() {
        
        try {
                File file = new File("topcekme.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
         
               } catch (Exception e) {
                   
                System.err.println(e.getMessage());
        }
        
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            sayicekildiSesi();
            topsayisi++;
            CekilenTopsayisi.setText(Integer.toString(topsayisi));
            
            String c = randomElementDondur.randomElementDondurveSil();
            
            cikan_sayi.setText(c);
            String b = "Ok";
            
            
            if(c.equals(Integer.toString(bir))){
                rakam.setText(b);
                rakam.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(oniki))){
                on2.setText(b);
                on2.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(onbir))){
                on1.setText(b);
                on1.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(yirmibir))){
                yirmi1.setText(b);
                yirmi1.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(otuzbir))){
                otuz1.setText(b);
                otuz1.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(otuziki))){
                otuz2.setText(b);
                otuz2.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(kirkbir))){
                kirk1.setText(b);
                kirk1.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(ellibir))){
                elli1.setText(b);
                elli1.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(elliiki))){
                elli2.setText(b);
                elli2.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(altmisbir))){
                altmis1.setText(b);
                altmis1.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(yetmisbir))){
                yetmis1.setText(b);
                yetmis1.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(yetmisiki))){
                yetmis2.setText(b);
                yetmis2.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(seksenbir))){
                seksen1.setText(b);
                seksen1.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(sekseniki))){
                seksen2.setText(b);
                seksen2.setForeground(Color.GREEN);
                buldunSesi();
            }
            else if(c.equals(Integer.toString(seksenuc))){
                seksen3.setText(b);
                seksen3.setForeground(Color.GREEN);
                buldunSesi();
            }
        
            if(rakam.getText() == b &&  on2.getText() == b && on1.getText() == b &&yirmi1.getText() == b &&otuz1.getText() == b &&otuz2.getText() == b &&kirk1.getText() == b &&elli1.getText() == b &&elli2.getText() == b &&altmis1.getText() == b &&yetmis1.getText() == b &&yetmis2.getText() == b &&seksen1.getText() == b &&on2.getText() == b &&seksen2.getText() == b &&seksen3.getText() == b){
                
                alkisSesi();
                try {
                Thread.sleep(1000);
                JOptionPane.showMessageDialog(null,"Tebrikler Tombala Yaptın." , "Tombala", JOptionPane.INFORMATION_MESSAGE );
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tombala.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.exit(0);
            }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {

        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tombala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CekilenTopsayisi;
    private javax.swing.JLabel altmis1;
    private javax.swing.JLabel cikan_sayi;
    private javax.swing.JLabel elli1;
    private javax.swing.JLabel elli2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel kirk1;
    private javax.swing.JLabel on1;
    private javax.swing.JLabel on2;
    private javax.swing.JLabel otuz1;
    private javax.swing.JLabel otuz2;
    private javax.swing.JLabel rakam;
    private javax.swing.JPanel sayi_paneli;
    private javax.swing.JLabel seksen1;
    private javax.swing.JLabel seksen2;
    private javax.swing.JLabel seksen3;
    private javax.swing.JLabel yetmis1;
    private javax.swing.JLabel yetmis2;
    private javax.swing.JLabel yirmi1;
    // End of variables declaration//GEN-END:variables
}
