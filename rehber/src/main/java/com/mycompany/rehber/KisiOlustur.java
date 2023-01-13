
package com.mycompany.rehber;

public class KisiOlustur {

    public String isim;
    public  String soyisim;
    public  String numara;

    public KisiOlustur(String isim, String soyisim, String numara) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.numara = numara;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the soyisim
     */
    public String getSoyisim() {
        return soyisim;
    }

    /**
     * @param soyisim the soyisim to set
     */
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    /**
     * @return the numara
     */
    public String getNumara() {
        return numara;
    }

    /**
     * @param numara the numara to set
     */
    public void setNumara(String numara) {
        this.numara = numara;
    }
    
    
    
}
