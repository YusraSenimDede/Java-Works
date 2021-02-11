package nsayi;
import java.util.Scanner;
//Klavyeden girilen N sayisinin 
//1^1+ 2^2+ 3^3+....+N^N
//degerini bulup sonucu ekrana yazan prg

public class Nsayi {

    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner a=new Scanner(System.in);
	     System.out.println("Birinci sayıyı girin:");
	     int N=a.nextInt();
	     double toplam=0;
	     
	     for(int i=1;i<=N;i++) {
	    	 toplam=toplam+Math.pow(i, i);
	     }
	     
	     System.out.println("Toplamı:"+toplam);
	}
    }
    

