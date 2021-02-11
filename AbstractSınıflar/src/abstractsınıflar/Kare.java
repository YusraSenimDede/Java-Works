/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractsınıflar;


public class Kare extends Sekil{
    private int kenar;
    
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
        
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanÄ± " + (kenar * kenar) + " dir ");
        
        
    }
    public void cevre_hesapla() {
        
        System.out.println(getIsim() + "in Ã§evresi " + (4 * kenar));
        
    }
}
