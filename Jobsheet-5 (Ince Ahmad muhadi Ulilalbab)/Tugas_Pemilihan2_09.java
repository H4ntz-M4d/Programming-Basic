import java.util.Scanner;
public class Tugas_Pemilihan2_09{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		String kode_keberangkatan, kelas_eksekutif = "Eksekutif", kelas_bisnis = "Bisnis", kelas_luxury = "Luxury";
		int tiket_eksekutif = 1250000, tiket_bisnis = 1375000, tiket_luxury = 2500000, biaya_administrasi = 50000, totalbiaya;
		
		System.out.println ("Masukkan Kode Keberangkatan [pg/sg/mg/reg] : ");
		kode_keberangkatan = sc.nextLine();
		
	if (kode_keberangkatan.equalsIgnoreCase("pg")){
		System.out.println ("Kode Keberangkatan : " + kode_keberangkatan);
		System.out.println ("Kelas Kereta : " + kelas_eksekutif);
		System.out.println ("Biaya Tiket : " + tiket_eksekutif);
		totalbiaya = tiket_eksekutif + biaya_administrasi;
		System.out.println ("Total Biaya : " + totalbiaya);
	}else if (kode_keberangkatan.equalsIgnoreCase ("sg")){
		System.out.println ("Kode Keberangkatan : " + kode_keberangkatan);
		System.out.println ("Kelas Kereta : " + kelas_bisnis);
		System.out.println ("Biaya Tiket : " + tiket_bisnis);
		totalbiaya = tiket_bisnis + biaya_administrasi;
		System.out.println ("Total Biaya : " + totalbiaya);
	} else if (kode_keberangkatan.equalsIgnoreCase ("mg")){
		System.out.println ("Kode Keberangkatan : " + kode_keberangkatan);
		System.out.println ("Kelas Kereta : " + kelas_luxury);
		System.out.println ("Biaya Tiket : " + tiket_luxury);
		totalbiaya = tiket_luxury + biaya_administrasi;
		System.out.println ("Total Biaya : " + totalbiaya);
	} else {
		System.out.println ("Salah Memasukkan Kode Keberangkatan");
	}
	}
}