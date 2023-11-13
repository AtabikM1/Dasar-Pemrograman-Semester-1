import java.util.Arrays;
public class porseni {
    public static void main(String[] args) {
        String atlet[][] = { //inisialisasi array 2 dimensi 
            {"atabik", "mutawakil", "yanto", "arif", "chiko"},
            {"susanto", "rodaln", "sergio", "perez", "taufiq"},
            {"nanda", "biki", "dimas", "lamelo", "paquito"},
            {"dio", "farizqi","farhan", "gatti", "petrus"}
        };
        String cabor[] = {"badminton", "tenis meja", "basket", "bola voly"}; // inisialisasi cabang olahraga

        //mengurutkan nama pada setiap cabang olahraga

        for (String[] baris : atlet){
            Arrays.sort(baris);
        }
        
        //print nama atlet dengan masing masing cabang olah raga

        for (int i = 0; i < atlet.length; i++) { // perulangan menampilkan cabor
            System.out.println(cabor[i] + ":");

            for ( int j = 0; j < atlet[i].length; j++) { // perulangan menampilkan atlet
                System.out.println((j+1) + ". " + atlet[i][j]);
            }
            System.out.println();
        }

    }
}
