/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalıtım;

/**
 *
 * @author YÜSRA SENİM DEDE
 */
public class Kalıtım {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Etcil a=new Etcil();
          a.Beslenme();
          a.CeneYapisi();
          a.Hayvan();
          a.Solunum();
          a.YasadigiYer(); */
		
		Balik a=new Balik();
		a.Beslenme();
        a.CeneYapisi();
        a.Solunum();
        a.YasadigiYer();
		}
 }
 class Hayvan{
	public Hayvan() {
		System.out.println("Kurucu fonksiyon olustu");
		//?? void olustu mu???? set ve get 
	}
	public void Hayvan() {
		System.out.println("Kurucu fonksiyon olustu??");
		//?? Kurucu void olustu mu???? set ve get 
	}	
	public void Beslenme() {
		System.out.println("Her Hayvan beslenir");
	}
	public void YasadigiYer() {
		System.out.println("Her Havada-Karada-Suda yaşar");
	}
	public void Solunum() {
		System.out.println("Her Hayvan nefes alir");
	}
	public void CeneYapisi() {
		System.out.println("Her hayvan acilip kapanan ceneye sahiptir");
	}
}
 class Etcil extends Hayvan{
	@Override
	public void Beslenme() {
		System.out.println("Hayvanlar etle beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("Kesici dislerden olusur");
	}
	public void MideYapisi() {
		System.out.println("Tek bölmeden olusan Mide");
	}
}
 class Otcul extends Hayvan{
	@Override
	public void Beslenme() {
		System.out.println("Hayvanlar otla beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("Öğütücü dislerden olusur");
	}
	public void MideYapisi() {
		System.out.println("Dört bölmeden olusan Mide");
	}
}
 class Balik extends Otcul{
	@Override
	public void Beslenme() {
		System.out.println("Balıklar otla-etle beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("Parçalayıcı dislerden olusur");
	}
	@Override
	public void Solunum() {
		System.out.println("Solungaç solunumu yaparlar");
	}
	@Override
	public void YasadigiYer() {
		System.out.println("Suda yasarlar");
	}

    
    
}
