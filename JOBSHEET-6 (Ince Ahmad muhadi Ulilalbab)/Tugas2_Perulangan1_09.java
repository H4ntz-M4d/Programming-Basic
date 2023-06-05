import java.util.Scanner;
public class Tugas2_Perulangan1_09 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket_anak = 50000, tiket_dewasa = 100000, pengunjung_anak2 = 5, pengunjung_dewasa = 5, pemasukan, bulan_agustus = 31, total = 0;
        System.out.printf("Jumlah pengunjung anak-anak per hari: %d",pengunjung_anak2);
        System.out.printf("\nJumlah pengunjung dewasa per hari: %d",pengunjung_dewasa);
        System.out.printf("\nJumlah hari pada bulan agustus: %d\n", bulan_agustus);

        for (int tanggal = 1; tanggal <= bulan_agustus; tanggal++) {
            if (tanggal ==7){
                int pertanggal = tanggal;
                System.out.printf("\nHari libur, tempat wisata tutup ", pertanggal);
                continue;
            } else if (tanggal ==14){
                int pertanggal = tanggal;
                System.out.printf("\nHari libur, tempat wiasata tutup", pertanggal);
                continue;
            } else if (tanggal ==21){
                int pertanggal = tanggal;
                System.out.printf("\nHari libur, tempat wiasata tutup", pertanggal);
                continue;
            } else if (tanggal ==28){
                int pertanggal = tanggal;
                System.out.printf("\nHari libur, tempat wiasata tutup", pertanggal);
                continue;
            }
            pemasukan = (tiket_anak * pengunjung_anak2) + (tiket_dewasa * pengunjung_dewasa);
            total = total + pemasukan;
            System.out.printf("\nTotal pemasukan tanggal-%d adalah Rp. %d", tanggal, total);

        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Total pemasukkan sebulan = Rp. %d\n", total);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}