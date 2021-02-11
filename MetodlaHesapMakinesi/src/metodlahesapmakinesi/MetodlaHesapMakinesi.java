/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodlahesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author YÜSRA SENİM DEDE
 */
public class MetodlaHesapMakinesi {

    /**
     * @param args the command line arguments
     */
        /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya Ã§alÄ±ÅŸÄ±n.
    Toplama ve Ã‡arpma metodlarÄ±nÄ± 2 veya 3 parametre alacak ÅŸekilde tasarlayÄ±n.

    */   
    public static int cikarma(int a,int b) {
        
        return (a - b);
        
    }
    public static double bolme(int a,int b) {
        return ((double)a / b);
        
    }
    public static int toplama(int a,int b){
        
        return (a + b);
        
    }
    public static int toplama(int a,int b,int c) {
        
        return (a + b + c);
    }
    public static int carpma(int a,int b) {
        
        return a * b;
    }
    public static int carpma(int a,int b,int c) {
        return a * b * c;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String islemler =  "1. Toplama Ä°ÅŸlemi\n"
                           +"2. Ã‡Ä±karma Ä°ÅŸlemi\n"
                           + "3. Ã‡arpma Ä°ÅŸlemi\n"
                           + "4. BÃ¶lme Ä°ÅŸlemi\n"
                           + "Ã‡Ä±kÄ±ÅŸ iÃ§in q'ya basÄ±n.";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true) {
            System.out.print("Ä°ÅŸlemi SeÃ§iniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Ã‡Ä±kÄ±lÄ±yor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("KaÃ§ deÄŸer toplayacaksÄ±nÄ±z ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayÄ±larÄ±n toplamlarÄ± : " + (toplama(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayÄ±larÄ±n toplamlarÄ± : " + (toplama(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun iÃ§in uygun metod bulunmuyor...");
                }
                
                
            }
            else if (islem.equals("2")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen SayÄ±larÄ± FarklarÄ± : " + cikarma(a, b));
                
            }
            else if (islem.equals("3")){
                System.out.print("KaÃ§ deÄŸer Ã§arpacaksÄ±nÄ±z ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayÄ±larÄ±n Ã§arpÄ±mlarÄ± : " + (carpma(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayÄ±larÄ±n Ã§arpÄ±mlarÄ± : " + (carpma(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun iÃ§in uygun metod bulunmuyor...");
                }
                
            }
            else if (islem.equals("4")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen SayÄ±larÄ±n BÃ¶lÃ¼mÃ¼ : " + bolme(a, b));
                
            }
            else {
                System.out.println("GeÃ§ersiz Ä°ÅŸlem...");
            }
            
            
            
        }
        
    }
    
}
