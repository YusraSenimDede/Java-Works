/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdisicikisprogrami;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("YatÄ±rdÄ±ÄŸÄ±nÄ±z HarÃ§ Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir siyasi yasaÄŸÄ±nÄ±z bulunuyor mu(evet ya da hayÄ±r) ? ");
        
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            
            this.siyasiYasak = true;
        } 
        else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayÄ±r)");
        
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet") ){
            this.vizeDurumu = true;
            
        }
        else {
            this.vizeDurumu = false;
        }
        
        
        
        
        
    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc < 15) {
            
            System.out.println("LÃ¼tfen yurtdÄ±ÅŸÄ± Ã§Ä±kÄ±ÅŸ harcÄ±nÄ± tam yatÄ±rÄ±n...");
            return false;
        }
        else {
            System.out.println("YurtdÄ±ÅŸÄ± harcÄ± iÅŸlemi tamam!");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasaÄŸÄ±nÄ±z bulunuyor.YurtdÄ±ÅŸÄ±na Ã§Ä±kamazsÄ±nÄ±z...");
            return false;
        }
        else {
            System.out.println("Siyasi yasaÄŸÄ±nÄ±z bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            
            System.out.println("Vize iÅŸlemleri tamam!");
            return true;
        }
        else {
            System.out.println("Vizeniz gideceÄŸiniz Ã¼lkeye bulunmamaktadÄ±r...");
            return false;
        }

    }
    
    
}
