
package ygslysbirincileri;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        System.out.println("YGS LYS Birinci Bulma ProgramÄ±...");
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "iişlemler...\n"
                          + "1. Eşit ağırlık öğrencileri Birincisi\n"
                          + "2. Sayısal öğrencileri Birincisi";
        
                          
        
        System.out.println("*******************************************");
        System.out.println(islemler);
        System.out.println("*******************************************");

        while (true) {
            System.out.print("çıkış için q'ya basın...");
            String cevap = scanner.nextLine();
            if (cevap.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            // Birinci Ã–ÄŸrenci
            System.out.print("Birinci öğrenci ismi : ");
            String isim1 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik ) : ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();
            
            // Ä°kinci Ã–ÄŸrenci
            System.out.print("ikinci öğrenci ismi : ");
            String isim2 = scanner.nextLine();
            System.out.print("Netler(TÃ¼rkÃ§e Matematik Edebiyat Fizik ) : ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
             scanner.nextLine();   
            // ÃœÃ§Ã¼ncÃ¼ Ã–ÄŸrenci
            
            System.out.print("ÃœÃ§Ã¼ncÃ¼ Ã–ÄŸrenci Ä°smi : ");
            String isim3 = scanner.nextLine();
            System.out.print("Netler(TÃ¼rkÃ§e Matematik Edebiyat Fizik ) : ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Ä°ÅŸlemi Giriniz : ");
            String islem = scanner.nextLine();
            
            
            if (islem.equals("1")){
                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1,isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2,isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3,isim3);
                
                EsitAgirlik birinci = birinci(ogrenci1,ogrenci2, ogrenci3);
                
                System.out.println("Birinci EÅŸit AÄŸÄ±rlÄ±k Ã–ÄŸrencisi : " + birinci.getIsim());
                System.out.println("Ã–ÄŸrenci PuanÄ± : " + birinci.puanHesapla());
                
                
                
                
                
            }
            else if (islem.equals("2")){
                Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1,isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2,isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3,isim3);
                
                Sayisal birinci = birinci(ogrenci1,ogrenci2, ogrenci3);
                
                System.out.println("Birinci Sayısal öğrencisi : " + birinci.getIsim());
                System.out.println("öğrenci Puanı : " + birinci.puanHesapla());
            }
            
            else {
                System.out.println("Geçersiz işlem...");
            }
            
        }
        
        
        
        
    }
    
    public static <E extends Aday> E birinci(E e1,E e2,E e3) {
        
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            
            return e1;
        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            
            return e2;
        }
        else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {
            
            return e3;
        }
        else {
            return e1;
        }
    }
   /* public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            
            System.out.println(e);
            
        }
        
        
    }*/
    
}
