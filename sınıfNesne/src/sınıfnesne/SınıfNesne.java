package sınıfnesne;
public class SınıfNesne {
    //soyut ve somut 
    //örnekleme-instance 
  
    public static void main(String[] args) {
        int sayi=55;
        String isim="yusra";
        
       //kendi olusturdugum veri tipim 
       //soyut olan araba sınfımdan somut olan ornek yarattım
        araba sahin=new araba();
        //sahin.yili=2017;
        sahin.setYil(2010);
        System.out.println("Şahinin yılı:"+sahin.getYil());
        
        araba kartal=new araba();//referans tipi 
        //baslangıc noktası tutar adres bilgisi tutar
        kartal.setYil(2015);
        System.out.println("Kartalin yili:"+kartal.getYil());
        
        
        sahin=kartal;
        //sahinin referansını kartala ata
        System.out.println("Şahinin yılı:"+sahin.getYil());
        
        araba serce=new araba();
        serce.setRenk("kırmızı");
        serce.setAdi("Beyaz");
        serce.setBeygirGücü(150);
        
     
    }
    
}
