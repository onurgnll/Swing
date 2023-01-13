
package com.mycompany.ubs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Dosyalar {

    public static File ogrenciFile = new File("veriler/ogrenciler.txt");
    
    public static File ogretimuyesiFile = new File("veriler/ogretimuyeleri.txt");
    
    public static File duyuruFile = new File("veriler/duyuru.txt");
    public static File devamsizlikFile = new File("veriler/devamsizlik.txt");
    public static File dilekceFile = new File("veriler/dilekceler.txt");
    
    public static void dosyayaYaz(File file, String birinci , String ikinci){
        
        FileWriter writer = null;
        
        try {
            writer  = new FileWriter(file,true);
            
            writer.write(birinci + "=" + ikinci + "\n");
            
            
            
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu...");
        }
        finally {
            
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya Kapatılırken bir hata oluştu...");
                }
                
            }
        }
    }public static void dosyayadilekceYaz(File file, String birinci , String ikinci){
        
        FileWriter writer = null;
        
        try {
            writer  = new FileWriter(file,true);
            String replace = ikinci.replace("\n", "");
            writer.write(birinci + "=" + replace + "\n");
            
            
            
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu...");
        }
        finally {
            
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya Kapatılırken bir hata oluştu...");
                }
                
            }
        }
    }
    
    public static void dosyayiTemizle(){
        PrintWriter writer;
        try {
            writer = new PrintWriter(ogrenciFile);
        writer.print("");
        writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dosyalar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void dosyayaYaz(File file, String birinci, String ikinci , String ucuncu){
        
        FileWriter writer = null;
        
        try {
            writer  = new FileWriter(file,true);
            
            writer.write(birinci + "=" + ikinci + "=" + ucuncu +"\n");
            
            
            
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu...");
        }
        finally {
            
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya Kapatılırken bir hata oluştu...");
                }
                
            }
        }
    }
    public static void dosyayaYaz(File file, String birinci){
        
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(duyuruFile, false);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(birinci);
            bWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Dosyalar.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
