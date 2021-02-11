/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınterfaceler;
//bu interfaceden bir tane obje olusturamadıgımız ıcın public.. gibi erisim beliryeci yazmamıza gerek kalmıyor
//simdilik dönüş tipini yazıcaz
public interface IMuhendis {
    
    void askerlik_durumu_sorgula();//metod yazıcaz ama içine 
    String mezuniyet_ortalamasi(double derece);
    void adli_sicil_sorgula();
    void is_tecrubesi(String[] array);

    
    
    
    
}