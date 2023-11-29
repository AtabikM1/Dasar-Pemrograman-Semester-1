package Pertemuan14;

public class percobaan106 { // buat file Java dengan nama Percobaan1
    static int factorialrecursif (int n) { //Buat fungsi static dengan nama faktorialRekursif(),
        if (n == 0){
            return (1);
        }
        else {
            return ( n * factorialrecursif(n - 1));
        }
    }
    static int factorialitertatif (int n){ // fungsi static dengan nama faktorialIteratif(),
        int factor = 1;
        for(int i = n; i >= 1; i--){
            factor = factor * i;
        }
        return factor;
    }
    public static void main(String[] args) { // fungsi main
        System.out.println(factorialrecursif(5)); //pemanggilan terhadap kedua fungsi 
        System.out.println(factorialitertatif(5));
    }
}
