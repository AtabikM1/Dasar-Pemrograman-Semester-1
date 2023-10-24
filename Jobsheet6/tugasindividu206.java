package Jobsheet6;
import java.util.Scanner;

public class tugasindividu206 {
    public static void main(String[] args){
        Scanner sc06 = new Scanner(System.in);
    
        String username1 = "ATABIKM", password1 = "123";
    System.out.println("masukan username : ");
    String username = sc06.next();

    System.out.println("masukan password: ");
    String password = sc06.next();
    
    if (username.equals(username1) && password.equals(password1)){
        System.out.println(" login sukses ");
    }
    else if (username.equals(username1) && password.equals(password)){
        System.out.println("password salah");
    }
    else if (username.equals(username) && password.equals(password1)){
        System.out.println("username salah");
    } 
    else{
        System.out.println("login gagal");
    }
    }
}
