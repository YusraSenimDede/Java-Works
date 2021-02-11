/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikvefizikproblemleri;

import java.util.Scanner;

public class Main {
    // Basit Matematik ve Fizik Problemler
    // Daire Alan - Matematik
    // ÃœÃ§gen Cevresi - Matematik
    // 3 Boyutlu Vektorlerin Ä°Ã§ Ã‡arpÄ±mÄ± - Fizik
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Problemleri ProgramÄ±na HoÅŸgeldiniz...");
        
        String islemler = "Ä°ÅŸlemler...\n"
                          + "1. Daire AlanÄ± Hesaplama\n"
                          + "2. ÃœÃ§gen Ã‡evresi Hesaplama\n"
                          + "3. 2 VektÃ¶rÃ¼n Ä°Ã§ Ã‡arpÄ±mÄ±nÄ± Hesaplama\n"
                          + "Ã‡Ä±kÄ±ÅŸ :  q";
        
        while(true) {
            System.out.println(islemler);
            System.out.print("işlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan Ã‡Ä±kÄ±lÄ±yor...");
                break;
                
            }
            else if (islem.equals("1")){
                
                System.out.print("Dairenin YarÄ±Ã§apÄ± : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.daireAlan(yaricap);
                
            }
            else if (islem.equals("2")){
                System.out.print("Kenar  1: ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
                
            }
            else if (islem.equals("3")){
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");
                
                Problem.Fizik.icCarpim(vec1, vec2);
                
            }
            else {
                System.out.println("GeÃ§ersiz iÅŸlem...");
                
            }
        }
    }
    
    
}
