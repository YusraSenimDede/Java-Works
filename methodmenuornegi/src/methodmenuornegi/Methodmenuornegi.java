package methodmenuornegi;
import java.util.Scanner;
public class Methodmenuornegi {

    public static void main(String[] args) {
        
        int kullaniciSecimi=0;
        int sayi1,sayi2;
      /*
        while(kullaniciSecimi!=5){
        kullaniciSecimi=menuGoster();
        }
        */
      for(;;){
           Scanner tara= new Scanner(System.in);
          kullaniciSecimi=menuGoster();
         if(kullaniciSecimi==5)
              break;
          System.out.println("Lütfen birinci sayıyı giriniz:");
          sayi1=tara.nextInt();
          System.out.println("Lütfen ikinci sayıyı giriniz:");
          sayi2=tara.nextInt();
               
         switch(kullaniciSecimi){
              case 1:
                  topla(sayi1,sayi2);
                  break;
              case 2:
                  farkinibul(sayi1,sayi2);
                  break;
              case 3:
                  carpiminiBul(sayi1,sayi2);
                          
                  break;
              case 4:
                  bolumunuBul(sayi1,sayi2);
                         
                  break;
              
              case 5:
                  break;      
          } 
      }
    }
    public static int menuGoster(){
    System.out.println("***************MENU******************");
    System.out.println("1-Toplamını bul");
    System.out.println("2-Farkını bul");
    System.out.println("3-Çarpımını bul");
    System.out.println("4-Bölümü bul");
    System.out.println("5-Çıkış");
    
    Scanner tara=new Scanner(System.in);
    int secim=0;
    secim=tara.nextInt();
    return secim;
         }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Toplam:"+(sayi1+sayi2));
    }

    public static void farkinibul(int sayi1, int sayi2) {
        System.out.println("Fark:"+(sayi1-sayi2));
    }

    public static void carpiminiBul(int sayi1, int sayi2) {
         System.out.println("Çarpım:"+(sayi1*sayi2));
    }

    public static void bolumunuBul(int sayi1, int sayi2) {
       System.out.println("Bol:"+(sayi1/sayi2));
    }
            }
    

