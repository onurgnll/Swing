
package com.mycompany.tombala;

import java.util.Random;

public class RandomElementDondur {

    
    static int a ;
    
    public String randomElementDondurveSil(){
        
        
        Random random = new Random();
        
        int silinecekindex;
        
        silinecekindex = random.nextInt(0,Tombala.list.size());
        String silinenvalue = Tombala.list.get(silinecekindex);
        Tombala.list.remove(silinecekindex);
        
        
        
        return silinenvalue;
        
        
        
        
    }
    
    
}
