import java.util.Scanner;
public class Tugas2_Pemilihan_09{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int umur;
		System.out.println("Masukkan Umur anda: ");
		umur = input.nextInt();
		
		if (umur >= 17){
			System.out.println("Boleh Berkendara");
		}
		else{
			System.out.println("Boleh Tidak Boleh Berkendara");
		}
	}
}