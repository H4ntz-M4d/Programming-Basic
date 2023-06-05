import java.util.Scanner;
public class ArrayDua2_MI_09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        String [][] pengunjung = new String [4] [2];
        for ( int baris = 0; baris < 4; baris++) {
            for (int kolom = 0; kolom < 2; kolom ++) {
                System.out.printf("Masukkan Pengunjung ke [%s] [%s] : ", baris, kolom);
                pengunjung [baris][kolom] = scan.nextLine();
            }
            System.out.println("-------------------");
        }
        for ( int baris = 0; baris < 4; baris++) {
            for (int kolom = 0; kolom < 2; kolom ++) {
                System.out.printf("%s \t", pengunjung[baris] [kolom]);
            
            }
            System.out.println("");

        }
    }
}