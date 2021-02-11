
package methodlar;

public class Methodlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // belli bir yapının içine atssam lazım oldugunda adını soylesem  ve kullansam
        // bir kutuya koysam ve ona etiket versem 
        //o etiketede menuyu goster desem her menuyu cagırdıgımda karsıma cıksa
        //bu yapıya method denir
        //aynı amaca hizmet eden seyleri belli yerde toplama(methodun icinde)
      
           menuGoster();//parametresiz geriye dönüsü olmayan method
          
           toplaminiBul(4,9);//parametre alan geriye döndürmeyen method.Void anahtar kelimesini kullanırız
         
           int fark=farkiniBul(10,6);
           System.out.println("sayıların Farkı:"+fark);
    }
    public static void menuGoster(){ // parametre almayan ve geriye bisey gondermeyen bir method
       // geriye hicbir sey dondermicek demesi demek Void
        System.out.println("Menu");
        System.out.println("1-iki sayının toplamını bul");
        System.out.println("2-iki sayının farkını bul");
        System.out.println("3-iki sayının carpımını bul");
        System.out.println("4-iki sayının bölümü bul");
    }
    public static void toplaminiBul (int x , int y){
        int toplam=x+y;
        System.out.println("Sayıların Toplamı="+toplam);
    }
    // parametre alıp geriye deger döndüren method ama ekrana bisey bastırmadı 
    public static int farkiniBul(int a,int b){
    //int fark=a-b;
    int fark=0;
    if(a>b){
        fark=a-b;
    }
    else{
        fark=b-a;
    }
    return fark;
    }
}
