
package oppgiris;


public class OPPGiris {

  
    public static void main(String[] args) {
        araba araba1 = new araba();
        araba1.renk = "kırmızı";
        araba1.kapilar=4;
        araba1.tekerlekler=4;
        araba1.motor="16V";
        araba1.model="Fiat";
        System.out.println(araba1.motor);
        System.out.println(araba1.kapilar);
        System.out.println(araba1.tekerlekler); 
        System.out.println(araba1.model);
    }
     
}
