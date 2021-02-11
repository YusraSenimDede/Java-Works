package ınterfaceler;
public class MakineMuhendisi implements IMuhendis, ICalisma{

    @Override
    public void calis() {
        System.out.println("Makine MÃ¼hendisi Ã§alÄ±ÅŸÄ±yor...");
    }
    
    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    
    @Override
    public void askerlik_durumu_sorgula() {
        
        if (askerlik) {
            
            System.out.println("AskerliÄŸimi YaptÄ±m.");
            
        }
        else {
            System.out.println("AskerliÄŸimi henÃ¼z yapmadÄ±m.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
         return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil) {
            System.out.println("Adli Sicil KaydÄ±m Bulunuyor.");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydÄ±m bulunmuyor.");
            
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        
        if (array.length == 0 ) {
            System.out.println("Herhangi bir iÅŸ tecrÃ¼bem bulunmuyor...");
        }
        else {
            
            System.out.println("Makine MÃ¼hendisi olarak ÅŸu ÅŸirketlerde Ã§alÄ±ÅŸtÄ±m.");
            for (int i = 0 ; i < array.length ;i++) {
                System.out.println(array[i]);
                
            }
        }
    }
    public void referans_getir(String[] array) {
        
        if (array.length == 0) {
            System.out.println("Herhangi bir referansÄ±m bulunmuyor...");
        }
        else {
            System.out.println("ReferanslarÄ±m...");
            for (int i = 0 ; i < array.length ;i++) {
                System.out.println(array[i]);
                
            }
            
        }
    }
    
    
}
