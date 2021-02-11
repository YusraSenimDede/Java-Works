package calisanlarprogrami;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ã‡alÄ±ÅŸanlar ProgramÄ±
        
        Calisan SÄ±nÄ±fÄ± Å�eklinde Bir Ãœst SÄ±nÄ±f
        
        Calisan SÄ±nÄ±fÄ±ndan TÃ¼reyen Yazilimci adÄ±nda Bir Alt SÄ±nÄ±f
        Calisan SÄ±nÄ±fÄ±ndan TÃ¼reyen Yonetici adÄ±nda Bir Alt SÄ±nÄ±f

        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ã‡alÄ±ÅŸanlar ProgramÄ±na HoÅŸgeldiniz...");
        
        String islemler = "Ä°ÅŸlemler...\n"
                          + "1. YazÄ±lÄ±mcÄ± Ä°ÅŸlemleri\n"
                          + "2. YÃ¶netici Ä°ÅŸlemleri\n"
                          + "Ã‡Ä±kÄ±ÅŸ Ä°Ã§in q'ya basÄ±n";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while (true) {
            System.out.print("Ä°ÅŸlemi SeÃ§iniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Ã‡Ä±kÄ±lÄ±yor...");
                break;
                
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Mustafa Murat","CoÅŸkun", 567,"Python,C,Java");
                String yazilimci_islem = "1. Format At\n"
                                         +"2. Bilgileri GÃ¶ster\n"
                                         + "Ã‡Ä±kÄ±ÅŸ iÃ§in q'ya basÄ±n";
                System.out.println(yazilimci_islem);
                
                while (true) {
                    System.out.print("Ä°ÅŸlemi SeÃ§iniz : ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.out.println("YazÄ±lÄ±mcÄ± Ä°ÅŸlemlerinden Ã‡Ä±kÄ±lÄ±yor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        
                        System.out.print("Ä°ÅŸletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        
                    }
                    else if (y_islem.equals("2")){
                        
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("GeÃ§ersiz YazÄ±lÄ±mcÄ± Ä°ÅŸlemi...");
                    }
                    
                }
                
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Serhat","Say", 123, 10);
                
                String yonetici_islem = "YÃ¶netici Ä°ÅŸlemleri\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri GÃ¶ster\n"
                                        + "Ã‡Ä±kÄ±ÅŸ iÃ§in q'ya basÄ±n";
                System.out.println(yonetici_islem);
                
                while (true) {
                    System.out.println("Ä°ÅŸlemi SeÃ§iniz: ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("YÃ¶netici Ä°ÅŸlemlerinden Ã‡Ä±kÄ±lÄ±yor...");
                        break;
                        
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("YÃ¶neticinin ne kadar zam yapmasÄ±nÄ± istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                        
                    }
                    else if (y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                        
                    }
                    else {
                        System.out.println("GeÃ§ersiz YÃ¶netici Ä°ÅŸlemi....");
                    }
                    
                    
                }
                
            }
            else {
                System.out.println("GeÃ§ersiz Ä°ÅŸlem....");
            }
            
            
        }
        
        
    }
}


