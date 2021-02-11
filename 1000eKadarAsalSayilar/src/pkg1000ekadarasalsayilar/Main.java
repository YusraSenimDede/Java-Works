/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1000ekadarasalsayilar;

/**
 *
 * @author YÜSRA SENİM DEDE
 */
public class Main {

    /*1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdırın.
        
        Asal Sayı : 1'e ve kendisinden başka hiçbir sayıyabölünmeyen sayıya asal sayı denir.*/ 
    
       public static boolean asalMi(int sayi) {
        
        for (int i = 2 ; i < sayi;i++) {
            
            if (sayi % i == 0){
                return false;
                
            }
        }
        return true;
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
           for (int i = 2 ; i < 1000 ; i++) {
            
            if (asalMi(i)){
                System.out.println(i);
                
            }
        }
    }
    
}
