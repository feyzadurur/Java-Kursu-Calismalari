package com.mycompany.oopatm;
import java.util.Scanner;

public class Login {
    
    public boolean login(Hesap hesap){
        Scanner scanner=new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.println("Kullanıcı Adı : ");
        kullanici_adi=scanner.nextLine();
        
        System.out.println("Parola : ");
        parola=scanner.nextLine();
        
        
        if(hesap.getKullanici_adi().equals(kullanici_adi)  &&  hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
            
    }
}
