/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package armstrongsayisibulma;

import java.util.Scanner;

/**
 *
 * @author YÜSRA SENİM DEDE
 */
public class ArmstrongSayisiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Girilen bir sayının armstrong sayısı olup olmadığını bulma
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayıs)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
    
        Bu programı do while döngüsü yardımıyla yapabiliriz.
        önceden do while ile basamak değeri bulma .
        bu sefer basamak değerinin basamak sayısı kadar üssünü alıcaz 
        toplam değeri bulacaz.
        sonra kullanıcaıdan aldıgımız degere eşitlemeye çalışacaz
       
        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak Sayısı : ");
        int basamak_sayisi = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            
        }while(gecici_sayi > 0);
        
        if (sayi == toplam) {
            
            System.out.println("Bu sayı bir armstrong sayısıdır...");
        }
        else {
            System.out.println("Bu ssayı bir armstrong sayısı değildir...");
        }
        
        
        
    }
    }
    

