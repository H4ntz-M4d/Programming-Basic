import java.util.Scanner;
public class Tugas2_fungsi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double p = 3.14;

        System.out.println("\n\nMasukkan Jari-jari lingkaran : ");
        int r = sc.nextInt();
        System.out.println("phi : "+ p);

        double kelilingLingkaran = 2 * p * r;
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Keliling Lingkaran adalah : "+kelilingLingkaran);
        

        double luasLingkaran = p * (r * r);
        System.out.println("\n\nLuas Lingkaran adalah : "+luasLingkaran);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    static double kelilingLingkaran(int r, double p) {
        double keliling = 2 * p * r;
        return keliling;
    }
    static double luasLingkaran(int r, double p) {
        double luas = p * r * r;
        return luas;
    }
    public static void name(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double p = 3.14;

        System.out.println("Masukkan Jari-jari lingkaran : ");
        int r = sc.nextInt();
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Keliling Lingkaran adalah : "+kelilingLingkaran( r, p ));
        System.out.println("Luas Lingkaran adalah : "+ luasLingkaran( r, p ));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}