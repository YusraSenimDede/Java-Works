
package ınheritancekalitim;

public class Yonetici extends Calisan { // Subclass
    
    private int sorumlu_kisi; // Ekstra Ã– zellik
    
    public Yonetici(String isim, int maas,String departman,int sorumlu_kisi) {
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman;*/
        super(isim,maas,departman);//mirass aldıgım sınıfın constructarını kullanmam icin metod
        
        this.sorumlu_kisi = sorumlu_kisi;
        
    }
    public void zam_yap(int zam_miktari) {
        
        System.out.println("Çalışanlara " + zam_miktari + " tl zam yapıldı");
    }
    public void bilgilerigoster() {
        
        /*System.out.println("Ä°sim :" + getIsim());
        System.out.println("MaaÅŸ :" + getMaas());
        System.out.println("Departman :" + getDepartman());*/
        super.bilgilerigoster();
        
        
        System.out.println("Sorumlu Kişi Sayı: " + this.sorumlu_kisi);
      
    }
    
}
