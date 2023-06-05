import java.util.Scanner;
public class WhileGajiKelas_09 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int karyawan, gaji ,jumlah = 0, jam;
        String jabatan;

        System.out.print("Masukkan Jumlah Karyawan: ");
        karyawan = scan.nextInt();

        int i = 0;
        while (i < karyawan) {
            System.out.println("Pilihan jabatan - Direktur, manager, Staf");
            System.out.print("Masukkan karyawan ke-" + (i + 1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jam = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direkutur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")) {
                gaji = jam * 100000;
            }else {
                gaji = jam * 75000;
            }
            jumlah += gaji;
            System.out.println("Gaji = " + gaji);
            System.out.println("Pengeluaran perusahaan = " + jumlah);
        }
    }
}