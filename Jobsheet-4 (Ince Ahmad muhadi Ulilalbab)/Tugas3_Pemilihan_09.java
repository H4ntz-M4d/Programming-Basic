import java.util.Scanner;
public class Tugas3_Pemilihan_09{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		float nilai_uas, nilai_uts, kuis, tugas;
		double nilai_akhir;
		
		System.out.println("Nilai UAS: ");
		nilai_uas = input.nextFloat();
		System.out.println("Nilai UTS: ");
		nilai_uts = input.nextFloat();
		System.out.println("Nilai Kuis: ");
		kuis = input.nextFloat();
		System.out.println("Nilai Tugas: ");
		tugas = input.nextFloat();
		
		nilai_akhir = ((0.4) * nilai_uas) + ((0.3) * nilai_uts) + ((0.1) * kuis) + ((0.2) * tugas);
		
		System.out.println("Nilai Akhir: "+ nilai_akhir);
	}
}