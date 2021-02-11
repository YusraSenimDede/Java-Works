package sınıfnesne;
public class araba {
    //soyut 
    //araba taslagı
    //veri tipi olarak
     private int yil;
     private String  renk;
     private String adi;
     private int beygirGücü;
     private boolean otomatikVitesMi;
    //public degilde private oldugundan erisim olmuyor
     //kapsülleme
     //erisimide methodlarla yapalım
public void setYil(int yil){//icine veri yazmayı sağlıyor
    if (yil<=2017){//public değilde privatela yaptıgımızda methodları kullanarak kontrol edebiliriz
      this.yil=yil;
 //parametre olarak gelen yil bilgisi bu sınıftaki yıl bilgisine atasın  
    }
    else 
        System.out.println("yanlış değer");
}
//veri attım nasıl okucam
public int getYil(){//veri okumak için
    return this.yil;
}
//alt+insert=generate
    //getter ve setter
    //otomatik methodları oluşturdu
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getBeygirGücü() {
        return beygirGücü;
    }

    public void setBeygirGücü(int beygirGücü) {
        this.beygirGücü = beygirGücü;
    }

    public boolean isOtomatikVitesMi() {
        return otomatikVitesMi;
    }

    public void setOtomatikVitesMi(boolean otomatikVitesMi) {
        this.otomatikVitesMi = otomatikVitesMi;
    }



}
