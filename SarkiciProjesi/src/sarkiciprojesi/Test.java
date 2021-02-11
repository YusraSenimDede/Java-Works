package sarkiciprojesi;
import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar(); //ilk olarak kullanmam gereken bir obje belirlemeyelim sarkicilar clasından
    //main metoduna yazmadım cunku diger fonk bu objeye erişemeyeceğimiz için
    //özellik olarak yazdım
    //burada baska bir objeyi bu clasın icine aldık yani biz burada composition yapmış olduk
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir() {
        
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
        
    }
    public static void sarkici_goruntule() {
        sarkicilar.sarkicilari_bastir();
        
    }
    public static void sarkici_ekle(){
        
        System.out.println("Eklemek istediğiniz  Şarkıcının ismi:");
        
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
        
    }
    public static void sarkici_guncelle() {
        
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3...)");
        
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        String yeni_isim = scanner.nextLine();
        
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon - 1);//indeks oldugu icin arraylerde 1 girilirse 0. indeks olur
        
    }
    public static void sil() {
        
        System.out.println("Silmek istediğiniz pozisyon (1,2,3....)");
        
        int pozisyon = scanner.nextInt();
        
        sarkicilar.sarkici_sil(pozisyon-1);
        
        
    }
    public static void ara() {
        
        System.out.println("Aramak istediğiniz  Şarkıcı:");
        
        String isim = scanner.nextLine();
        
        sarkicilar.sarkici_ara(isim);
        
        
    }
    public static void main(String[] args) {
        
        System.out.println("\t  Şarkıcı Uygulamasına Hoşgeldiniz...");
        
        islemleri_bastir();
        
        boolean cikis = false;
        
        int islem;
        
        while(!cikis)// sonsuz döngüye giriyor demekk
        {
            System.out.println("Bir işlem sesiniz:");
            
            islem = scanner.nextInt();
            //baska bir islem alıcaksak enterı da giriş olarak algılıyordu burada sıkıntı cıkarıyordu
            
            scanner.nextLine();
            
            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    //true yaptıgımz zaman döngü ssona ermiş oluyor
                    cikis = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
           
                
                
            }
            
            
        }
    
    }}
