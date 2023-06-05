import java.util.Scanner;
public class Tugas1_11 {
    static int rekursif (int x) {
        if (x == 0) {
            System.out.print("");
            return (0);
        } else {
            System.out.print(x + " ");
            return (rekursif(x-1));
        }
    }
    static void iteratif(int x) {
        for (int i = x; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Masukkan Bilangan : ");
        x = sc.nextInt();

        System.out.println(rekursif(x));
        iteratif(x);
    }
}