import java.util.Scanner;
public class PemilihanPercobaan4_09{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);	
		double angka1, angka2, hasil;
		char operator;
		
		System.out.print("Masukkan Angka pertama: ");
		angka1 = input.nextDouble();
		System.out.print("Masukkan Angka Kedua: ");
		angka2 = input.nextDouble();
		System.out.print("Masukkan Operator (+ - * /): ");
		operator = input.next().charAt(0);
		
		switch (operator){
			case '+':
			hasil = angka1 + angka2;
			System.out.println(angka1 + " + " + angka2 + " = " + hasil);
			break;
			case '-':
			hasil = angka1 - angka2;
			System.out.println(angka1 + " - " + angka2 + " = " + hasil);
			break;
			case '*':
			hasil = angka1 * angka2;
			System.out.println(angka1 + " * " + angka2 + " = " + hasil);
			break;
			case '/':
			hasil = angka1 / angka2;
			System.out.println(angka1 + " / " + angka2 + " = " + hasil);
			break;
		}
	}
}