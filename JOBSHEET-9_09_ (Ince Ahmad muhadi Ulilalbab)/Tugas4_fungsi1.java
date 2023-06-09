import java.util.Scanner;
public class Tugas4_fungsi1 {

    static float hasilnilai(int[] nilai, int mahasiswa) {
        float total = 0;
        for (int i = 0; i < mahasiswa; i++) {
            total =  total + nilai[i];
        }
        return total;
    }
    static float min(int[] nilai, int mahasiswa, int min){
        min = nilai[0];

        for (int i = 0; i < mahasiswa; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        return min;
    }
    static float max(int[] nilai, int mahasiswa, int max){
        max = nilai[0];

        for (int i = 0; i < mahasiswa; i++) {
            if (nilai[i] >max) {
                max = nilai[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] nilai = new int[100];

        System.out.print("Masukan Junlah Mahasiswa : ");
        int mahasiswa = input.nextInt();

        for (int i = 0; i < mahasiswa; i++) {
            System.out.println("Masukan Nilai Mahasiswa ke- " + (i+1) + " : ");
            nilai[i] = input.nextInt();
        }
        System.out.println();

        float total = hasilnilai(nilai, mahasiswa);
        float rata2 = (total/mahasiswa);

        System.out.println("---------------------------------------------------");
        System.out.println("Jumlah total dari semua Mahasiswa adalah : " + total);
        System.out.println("Jumlah Rata-rata dari semua Mahasiswa adalah : " + rata2);
        System.out.println("nilai min" +min(nilai, mahasiswa, mahasiswa));
        System.out.println("nilai max" +max(nilai, mahasiswa, mahasiswa));
        System.out.println("---------------------------------------------------");
    }
}