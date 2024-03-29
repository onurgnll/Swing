/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ubs;

import static com.mycompany.ubs.Ubs.ogrenciler;
import static com.mycompany.ubs.Ubs.ogrencilerinisimleri;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Onur
 */
public class OgrenciGirisi extends javax.swing.JFrame {
    Iconlar iconlar = new Iconlar();
    static String isimsoyisim;
    DefaultListModel model = new DefaultListModel();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    public static File dosya = Dosyalar.duyuruFile;
    
    public static DefaultListModel tablemodel = new DefaultListModel();
    static String id;
    public OgrenciGirisi(String isimsoyisim,String girilenid) {
        initComponents();
        this.id = girilenid;
        liste.setModel(model);
        this.isimsoyisim = isimsoyisim;
        jLabel3.setText(isimsoyisim);
        String yer = "students/" + girilenid + ".txt";
        //System.out.println(yer);
        File student = new File(yer);
        if(!student.exists()){
            try {
                student.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(OgretimUyesiGirisi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        DefaultTableModel modell = (DefaultTableModel) tablo.getModel();
        
        try (BufferedReader br = new BufferedReader(new FileReader(yer))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2){
                    String key = parts[0];
                    String value = parts[parts.length - 1];
                    Object[] a = {key,value};
                    modell.addRow(a);
                }
                else if (parts.length == 3){
                    String key = parts[0];
                    String value1 = parts[1];
                    String value = parts[2];
                    Object[] a = {key,value1,value};
                    modell.addRow(a);
                }
            }
        } catch (IOException e) {
          e.printStackTrace();
        }
        
        tablemodel.add(0, "2");
        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
        this.setResizable(false);
        
        try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
            String line;
            String duyuru = ""; 
            while ((line = br.readLine()) != null) {
                duyuru += line + "\n";
                
            }
                jTextArea1.setText(duyuru);
        } catch (IOException e) {
          e.printStackTrace();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        AnaPanel = new javax.swing.JPanel();
        ButtonSınıfı = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        not_goruntule = new javax.swing.JToggleButton();
        devamsizlik = new javax.swing.JToggleButton();
        dilekceYaz = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Ciktilar = new javax.swing.JPanel();
        genel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        devamsizlik_panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liste = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        dilekce_panel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dilekceyazilanyer = new javax.swing.JTextArea();
        gonder = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        not_goruntule_panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AnaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ButtonSınıfı.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setIcon(iconlar.getOkulrenkli());
        jLabel1.setText(" ");
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

        buttonGroup1.add(not_goruntule);
        not_goruntule.setText("Not Görüntüle");
        not_goruntule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        not_goruntule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                not_goruntuleMouseClicked(evt);
            }
        });
        not_goruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                not_goruntuleActionPerformed(evt);
            }
        });

        buttonGroup1.add(devamsizlik);
        devamsizlik.setText("Devamsızlık Bilgisi");
        devamsizlik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devamsizlik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devamsizlikActionPerformed(evt);
            }
        });

        buttonGroup1.add(dilekceYaz);
        dilekceYaz.setText("Dilekçe Yaz");
        dilekceYaz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dilekceYaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dilekceYazActionPerformed(evt);
            }
        });

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel7.setIcon(iconlar.getCikrenkli());
        jLabel7.setText(" ");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonSınıfıLayout = new javax.swing.GroupLayout(ButtonSınıfı);
        ButtonSınıfı.setLayout(ButtonSınıfıLayout);
        ButtonSınıfıLayout.setHorizontalGroup(
            ButtonSınıfıLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonSınıfıLayout.createSequentialGroup()
                .addGroup(ButtonSınıfıLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonSınıfıLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(ButtonSınıfıLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(not_goruntule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(devamsizlik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dilekceYaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ButtonSınıfıLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        ButtonSınıfıLayout.setVerticalGroup(
            ButtonSınıfıLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonSınıfıLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(not_goruntule)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(devamsizlik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dilekceYaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonSınıfıLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonSınıfıLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonSınıfıLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        Ciktilar.setLayout(new java.awt.CardLayout());

        genel.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Duyurular:");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel5.setText("Hoşgeldin");

        javax.swing.GroupLayout genelLayout = new javax.swing.GroupLayout(genel);
        genel.setLayout(genelLayout);
        genelLayout.setHorizontalGroup(
            genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genelLayout.createSequentialGroup()
                .addGroup(genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(genelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        genelLayout.setVerticalGroup(
            genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(102, 102, 102)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        Ciktilar.add(genel, "card5");

        devamsizlik_panel.setBackground(new java.awt.Color(51, 255, 153));
        devamsizlik_panel.setLayout(null);

        liste.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "qwrqw", "qwrqwr" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(liste);

        devamsizlik_panel.add(jScrollPane2);
        jScrollPane2.setBounds(110, 170, 340, 160);

        jLabel6.setIcon(iconlar.getDevamsizlik());
        devamsizlik_panel.add(jLabel6);
        jLabel6.setBounds(210, 20, 180, 130);

        Ciktilar.add(devamsizlik_panel, "card2");

        dilekce_panel.setBackground(new java.awt.Color(255, 102, 255));

        dilekceyazilanyer.setColumns(20);
        dilekceyazilanyer.setRows(5);
        jScrollPane4.setViewportView(dilekceyazilanyer);

        gonder.setText("Gönder");
        gonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderActionPerformed(evt);
            }
        });

        jLabel9.setText(" ");

        javax.swing.GroupLayout dilekce_panelLayout = new javax.swing.GroupLayout(dilekce_panel);
        dilekce_panel.setLayout(dilekce_panelLayout);
        dilekce_panelLayout.setHorizontalGroup(
            dilekce_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dilekce_panelLayout.createSequentialGroup()
                .addGroup(dilekce_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dilekce_panelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dilekce_panelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(gonder)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dilekce_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        dilekce_panelLayout.setVerticalGroup(
            dilekce_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dilekce_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gonder)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Ciktilar.add(dilekce_panel, "card3");

        not_goruntule_panel.setBackground(new java.awt.Color(0, 204, 255));

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders İsmi", "Vize Notu", "Final Notu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablo);

        jLabel8.setIcon(iconlar.getGrade());
        jLabel8.setText(" ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout not_goruntule_panelLayout = new javax.swing.GroupLayout(not_goruntule_panel);
        not_goruntule_panel.setLayout(not_goruntule_panelLayout);
        not_goruntule_panelLayout.setHorizontalGroup(
            not_goruntule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(not_goruntule_panelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, not_goruntule_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        not_goruntule_panelLayout.setVerticalGroup(
            not_goruntule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, not_goruntule_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        Ciktilar.add(not_goruntule_panel, "card4");

        javax.swing.GroupLayout AnaPanelLayout = new javax.swing.GroupLayout(AnaPanel);
        AnaPanel.setLayout(AnaPanelLayout);
        AnaPanelLayout.setHorizontalGroup(
            AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnaPanelLayout.createSequentialGroup()
                .addComponent(ButtonSınıfı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Ciktilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AnaPanelLayout.setVerticalGroup(
            AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonSınıfı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Ciktilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(iconlar.getOkulrenksiz());
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
       jLabel1.setIcon(iconlar.getOkulrenkli());
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        Ubs ubs = new Ubs();
        ubs.setVisible(true);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void not_goruntuleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_not_goruntuleMouseClicked

    }//GEN-LAST:event_not_goruntuleMouseClicked

    private void not_goruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_not_goruntuleActionPerformed
        
        not_goruntule_panel.setVisible(true);
        devamsizlik_panel.setVisible(false);
        dilekce_panel.setVisible(false);
        genel.setVisible(false);
        
    }//GEN-LAST:event_not_goruntuleActionPerformed
    
    private void devamsizlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devamsizlikActionPerformed
        
        not_goruntule_panel.setVisible(false);
        devamsizlik_panel.setVisible(true);
        dilekce_panel.setVisible(false);
        genel.setVisible(false);
        model.removeAllElements();
        try (BufferedReader br = new BufferedReader(new FileReader(Dosyalar.devamsizlikFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=");
                String key = parts[0];
                String value = parts[1];
                if(key.equals(id)){
                    model.addElement(value);
                    
                }
            }
        } catch (IOException e) {
          e.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_devamsizlikActionPerformed

    private void dilekceYazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dilekceYazActionPerformed
   
        not_goruntule_panel.setVisible(false);
        devamsizlik_panel.setVisible(false);
        dilekce_panel.setVisible(true);
        genel.setVisible(false);
    }//GEN-LAST:event_dilekceYazActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        genel.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Ubs ubs = new Ubs();
        this.setVisible(false);
        ubs.setVisible(true);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setIcon(iconlar.getCikrenksiz());
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
       jLabel7.setIcon(iconlar.getCikrenkli());
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setIcon(iconlar.getGradeunr());
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setIcon(iconlar.getGrade());
    }//GEN-LAST:event_jLabel8MouseExited

    private void gonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderActionPerformed
        
        if(!dilekceyazilanyer.getText().equals("")){
            Dosyalar.dosyayadilekceYaz(Dosyalar.dilekceFile, isimsoyisim, dilekceyazilanyer.getText());
            jLabel9.setText("Dilekçe Başarıyla Gönderildi");
            jLabel9.setForeground(Color.GREEN);
        }
        
        
    }//GEN-LAST:event_gonderActionPerformed

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
            java.util.logging.Logger.getLogger(OgrenciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OgrenciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OgrenciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciGirisi(isimsoyisim,id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AnaPanel;
    private javax.swing.JPanel ButtonSınıfı;
    private javax.swing.JPanel Ciktilar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton devamsizlik;
    private javax.swing.JPanel devamsizlik_panel;
    private javax.swing.JToggleButton dilekceYaz;
    private javax.swing.JPanel dilekce_panel;
    private javax.swing.JTextArea dilekceyazilanyer;
    private javax.swing.JPanel genel;
    private javax.swing.JButton gonder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> liste;
    private javax.swing.JToggleButton not_goruntule;
    private javax.swing.JPanel not_goruntule_panel;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
