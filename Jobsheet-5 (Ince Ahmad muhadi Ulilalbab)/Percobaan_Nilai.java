import java.util.Scanner;

public class Percobaan_Nilai {
	public static void main (String[] args){
		
		int nilai;
		String grade;
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Inputkan nilai: ");
		nilai = scan.nextInt();
		 if (nilai >=0 && nilai <=100){
			 if (nilai >=90 && nilai <=100) {
				 System.out.println("Nilai A, EXCELLENT");
			 } else if (nilai >=80 && nilai <=89) {
				 System.out.println("Nilai B pertahankan prestasi anda");
			 } else if (nilai >=60 && nilai <=79) {
				 System.out.println("Nilai C Tingkatkan prestasi anda");
			 } else if (nilai >=50 && nilai <=59) {
				 System.out.println("Nilai D tingkatan belajar anda");
			 } else {
				 System.out.println("Nilai E, anda tidak lulus!");
			 }
		} else {
			System.out.println ("Nilai yang anda masukkan tidak valid");
		}
	}
}