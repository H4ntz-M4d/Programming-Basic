import java.util.Scanner;
public class Tugas3_fungsi1 {
    static float rataRata(float nilai, int banyak){
        float rata;
        rata = nilai / banyak;
        return rata;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] nilaiSiswa = new float[10];
        float jumlah = 0;
        
        for (int i = 0; i < nilaiSiswa.length; i++){
            System.out.printf("Masukkan nilai siswa ke-%d : ", i+1);
            float nilai = input.nextFloat();
            nilaiSiswa[i] = nilai;
        }
        for (int i = 0; i < nilaiSiswa.length; i++){
            jumlah += nilaiSiswa[i];
        }
        System.out.println("-----------------------------------------------");
        System.out.println("\nRata-rata nilai " + nilaiSiswa.length + " siswa adalah " + rataRata(jumlah, nilaiSiswa.length));
        System.out.println("-----------------------------------------------");
    }
}