import java.util.Scanner;
public class PemilihanPercobaan1_09{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int bil;
		System.out.println("Masukkan sebuah Bilangan: ");
		bil = input.nextInt();
		for (int i = 1; i < 100; i++){
			if (bil%2==0){
			System.out.println("Bilangan genap");
			}
		}
		
	}
}