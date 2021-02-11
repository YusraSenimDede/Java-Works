/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicigirisiprogrami;

import java.util.Scanner;

/**
 *
 * @author YÜSRA SENİM DEDE
 */
public class KullaniciGirisiProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // while döngüsü yardımıyla bir kullanıcı girişi yazma.

        Scanner scanner = new Scanner(System.in, "ISO-8859-9");//Türkçe karakter problemi için

        int giris_hakki = 3;

        String sys_kullanici_adi = "Yüsra Senim";
        String sys_parola = "86953849";

        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("*****************************");

        while (true) {
            System.out.print("Kullanıcı Adı : ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola : ");
            String parola = scanner.nextLine();
            //stringler == ile kontrol edilemez
            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {//parola==sys_parola yapamıyorum sorun cıkarıyor
                System.out.println("Hoşgeldiniz.. " + kullanici);
                break;
            } else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {

                System.out.println("Parolanız Yanlış...");
                giris_hakki -= 1;

                System.out.println("Giriş Hakkı : " + giris_hakki);

            } else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {

                System.out.println("Kullanıcı Adını Yanlış...");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı : " + giris_hakki);

            } else {
                System.out.println("Kullanıcı Adını ve Parolanız Hatalı...");

                giris_hakki -= 1;
                System.out.println("Giriş Hakkı : " + giris_hakki);

            }
            if (giris_hakki == 0) {

                System.out.println("Giriş Hakkını  Bitti. Tekar bekleriz....");
                break;
            }

        }
    }

}
