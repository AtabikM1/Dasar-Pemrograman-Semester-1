import java.util.Scanner;

public class BankABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga, jml_tabungan_akhir;
        System.out.print("jumlah tabungan awal :");
        jml_tabungan_awal input.nextInt();
        System.out.print("lama menabung :");
        lama_menabunginput.nextInt();
        bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;
        System.out.println("jumlah tabungan akhir" +jml_tabungan_akhir);
    }
}