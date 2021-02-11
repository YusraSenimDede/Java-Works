package constructorerisimbelirleyiciler;

import java.util.ArrayList;
import java.util.List;

public class ConstructorErisimbelirleyiciler {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Dikdortgen d1=new Dikdortgen();
        d1.en=5;
        d1.boy=10;
        System.out.println("Dikdörtgenin alanı:"+d1.alanHesapla());
        
        
         Dikdortgen d2=new Dikdortgen();
        d2.en=3;
        d2.boy=8;
        System.out.println("2.Dikdörtgenin alanı:"+d2.alanHesapla());

    }
    
}
