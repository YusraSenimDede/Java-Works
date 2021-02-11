
public class test {
    public static void main(String[] args ){
    
    
    
    
    account account1 =new account();
    account1.setHesapNo("1236547856");
    account1.setBakiye(1000.0);
    account1.setIsim("yusra senim ");
    account1.setEmail("sahdjaskd@gmail.com ");
    account1.setTelefonNo("125648564894456");
    
    
    System.out.println("bakiye:"+account1.getBakiye());
    
    // account account1 =new account();
     
     account account2= new account("13212122",1000.0,"yusra senim","sdadsa@gmail.com","1231565132515");
     account2.paraYatir(500);
     account2.paraCekme(700);
     
     
     
       // Account account1 = new Account();
       
        //System.out.println(account1.getEmail());
       account account3 = new account("Ahmet Can","example@gmail.com","87987897");
       
        /*System.out.println(account3.getEmail());
        System.out.println(account3.getBakiye());*/
        
        account3.bilgilerigoster();
        
        
       
    }
    }
    

