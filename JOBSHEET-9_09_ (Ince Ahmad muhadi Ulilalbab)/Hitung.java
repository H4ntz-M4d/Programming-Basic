import java.util.Scanner;
public class Hitung {
    static int kali(int angka1, int angka2) {
        int hasil = (angka1 + 10) % (angka2 + 19);
        return hasil;
    }
    static int kurang(int angka1, int angka2) {
        angka1 = angka1 + 7;
        angka2 = angka2 + 4;
        
        int hasil = kali(angka1, angka2);
        return hasil;
    }
    public static void main(String []args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan  nilai 2 : ");
        int nilai2 = input.nextInt();
        int hasil = kurang(nilai1, nilai2);
        System.out.println("Hasil Akhir Adalah : "+hasil);
    }
}