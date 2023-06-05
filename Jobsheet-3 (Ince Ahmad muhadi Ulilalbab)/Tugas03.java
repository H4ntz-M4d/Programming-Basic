import java.util.Scanner;
public class Tugas03{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		float suhu, celcius, reaumur, fahrenheit, kelvin;
		
		System.out.print("masukkan suhu : ");
		suhu = sc.nextFloat();
		celcius = suhu;
		kelvin = celcius + 273;
		reaumur = celcius * 4 / 5;
		fahrenheit = (celcius * 9 / 5) + 32;
		
		System.out.println("Suhu dalam Celcius = " + celcius + " C ");
		System.out.println("Suhu dalam Kelvin = " + kelvin + " K ");
		System.out.println("Suhu dalam Reaumur = " + reaumur + " R ");
		System.out.println("Suhu dalam Fahrenheit = " + fahrenheit + " F ");
	}
}