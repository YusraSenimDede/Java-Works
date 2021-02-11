/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosekillerinalanlarınınhesaplanmasi;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Geometrik şekil Hesaplama
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "işlemler...\n"
                          +"1. Kare Alan Hesapla\n"
                          +"2.üçgen Alan Hesapla\n"
                          +"3. Daire Alan Hesapla\n"
                          + "çıkış : q";
        
        while(true) {
            System.out.println(islemler);
            System.out.print("Hangi şeklin Alanını Hesaplamak istiyorsunuz : ");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            if (sekil_turu.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (sekil_turu.equals("1")){
                System.out.print("Karenin Kenarı : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare("Kare1", kenar);
                
                sekil.alanHesapla();
               
            }
            else if (sekil_turu.equals("2")) {
                
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                
                sekil = new Ucgen("Ucgen 1", kenar1, kenar2, kenar3);
                
                sekil.alanHesapla();
                
            }
            else if (sekil_turu.equals("3")){
                System.out.print("Dairenin Yarıçapı : " );
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Daire("Daire 1", yaricap);
                
                sekil.alanHesapla();
                
            }
            else {
                System.out.println("geçersiz işlem....");
            }
            
            
        }
    }
    
}
