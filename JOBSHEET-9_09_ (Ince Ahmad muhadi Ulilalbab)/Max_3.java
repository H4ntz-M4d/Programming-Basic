import java.util.Scanner;
public class Max_3{
    static int Max3(int bil1, int bil2, int bil3){
        int nilaiMax = 0;
        int[] bil = {bil1, bil2, bil3};
        for (int i = 0; i < bil.length; i++){
            if (bil[i] > nilaiMax){
                nilaiMax = bil[i];
            }
        }
        return nilaiMax;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama : ");
        int bilangan1 = input.nextInt();

        System.out.print("\nMasukkan bilangan kedua : ");
        int bilangan2 = input.nextInt();

        System.out.print("\nMasukkan bilangan ketiga : ");
        int bilangan3 = input.nextInt();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai tertinggi dari ketiga bilangan tersebut adalah : " + Max3(bilangan1, bilangan2, bilangan3));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}