/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faiz;

import java.util.Scanner;

/**
 *
 * @author YÜSRA SENİM DEDE
 */
public class Faiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         Faiz Uygulaması
         Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
         bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
        
         Faiz Oranı : %6 Faiz Oranı

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz Oranı %6");

        int anapara, vade;
        System.out.print("Yatırmak istediğiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz ? ");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faizOrani = 0.06;

        for (int i = 1; i <= vade; i++) {

            toplampara = (toplampara * faizOrani) + toplampara;

            System.out.println(i + ".yılın sonunda toplam para : " + (int) toplampara);

        }
    }

}
