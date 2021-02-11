
public class Main {

    public static void main(String[] args) {
        // Object Oriented(Nesne Yönelimli) ATM Programı

        // Login Classı Kullanıcı Girişini Kontrol Edecek.
        // Hesap Classı Hesap işlemlerini Yapacak.
        // ATM ise atmmizi Çalıştıracak
        ATM atm = new ATM();

        Hesap hesap = new Hesap("Mustafa Murat", "12345", 2000);

        atm.calis(hesap);
        System.out.println("Programdan  Çalıştırılıyor...");

    }

}
