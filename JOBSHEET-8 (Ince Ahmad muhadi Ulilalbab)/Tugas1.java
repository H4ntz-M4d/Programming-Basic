import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String[] karyawan = new String [3];
        int[] kehadiran;
        kehadiran = new int[karyawan.length];
        int [] kerapian;
        kerapian = new int[karyawan.length];
        int [] hasilkerja;
        hasilkerja = new int[karyawan.length];
        double total;
        char grade;



        for (int i=0; i<karyawan.length; i++) {
            System.out.println("Masukkan Karyawan: ");
            karyawan[i] = sc.next();
            System.out.println("Masukkan kehadiran: ");
            kehadiran[i] = sc.nextInt();
            System.out.println("Masukkan kerapian: ");
            kerapian[i] = sc.nextInt();
            System.out.println("Masukkan Hasil Kerja");
            hasilkerja[i] = sc.nextInt();

            total = (0.3) * kehadiran[i] + (0.3) * kerapian[i] + (0.4) * hasilkerja[i];
            System.out.println("Total = "+total);

            if(total >= 80) {
                System.out.println("Grade = A");
            }else if (total >=70){
                System.out.println("Grade = B");
            }else if (total >=60){
                System.out.println("Grade = C");
            }else if (total >=50){
                System.out.println("Grade = D");
            }else {
                System.out.println("Grade = E");
            }

            
            
        }

    }
}