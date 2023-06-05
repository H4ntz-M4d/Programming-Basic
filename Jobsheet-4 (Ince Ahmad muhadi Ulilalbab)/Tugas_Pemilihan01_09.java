import java.util.Scanner;
public class Tugas_Pemilihan01_09{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int bil1, bil2;
		System.out.println("Masukkan Bilangan ke Satu: ");
		bil1 = input.nextInt();
		System.out.println("Masukkan Bilangan ke dua: ");
		bil2 = input.nextInt();
		
		if (bil1 > bil2){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(bil1 + " bilangan terbesar " + bil2 + " bilangan terkecil ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		else{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(bil2 + " bilangan terbesar " + bil1 + " bilangan terkecil ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
}