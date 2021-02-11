/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticanahtarkelimesi;


public class Seyirci {
    
    private String isim;
    
    private static int seyirci_sayisi = 0;
    
    
    public Seyirci(String isim) {
        this.isim = isim;
        
        seyirci_sayisi++;
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void oyun_seyret() {
        
        System.out.println(isim + " oyun seyrediyor...");
    }
    public static int getSeyirciSayisi() {
        return seyirci_sayisi;
        
    }
}
