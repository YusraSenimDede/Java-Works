
package encapsulation;

public class Main {

  public static void main(String[] args) {
   
        /*Abone abone = new Abone();
        
        abone.isim = "Mustafa Murat CoÅŸkun";
        abone.bakiye = 200;
        abone.sehir = "Ankara";
        
        abone.dogalgaz_kullan(200);*/
        
        GelismisAbone abone = new GelismisAbone("Mustafa Murat CoÅŸkun",200,"Ankara");
        abone.bakiye_ogren();
        
        
        
        
        
        
    }
}
