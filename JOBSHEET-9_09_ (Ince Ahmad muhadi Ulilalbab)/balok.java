import java.util.Scanner;
public class balok {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        int l = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int t = input.nextInt();

        int luasPermukaan = 2 * ((p*l) + (p*t) + (l*t));
        System.out.println("Luas Permukaaan Balok adalah : "+ luasPermukaan);

        int volume = p*l*t;
        System.out.println("Volume Balok adalah : "+ volume);
    }
    static int hitungLuasPermukaan(int p, int l, int t){
        int hasil = 2 * ((p*l) + (p*t) + (l*t));
        return hasil;
    }
    static int hitungvolume(int p, int l, int t) {
        int hasil = p*l*t;
        return hasil;
    }
    public static void name (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        int l = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int t = input.nextInt();

        System.out.println("Luas Permukaaan Balok adalah : "+ hitungLuasPermukaan(p, l, t));
        System.out.println("Volume Balok adalah : "+ hitungvolume(p, l, t));
    }
}