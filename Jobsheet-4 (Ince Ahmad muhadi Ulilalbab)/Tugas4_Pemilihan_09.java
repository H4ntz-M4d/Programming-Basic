import java.util.Scanner;
public class Tugas4_Pemilihan_09{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int A, B, C, total_barang_A, jumlah_barang_A, total_barang_B, jumlah_barang_B, total_barang_C, jumlah_barang_C, total_harga_barang_A_B_C;
		double total_diskon, total_bayar;
		
		System.out.println("Masukkan Harga Barang A: ");
		A = input.nextInt();
		System.out.println("Masukkan Jumlah Barang A: ");
		jumlah_barang_A = input.nextInt();
		System.out.println("Masukkan Harga Barang B: ");
		B = input.nextInt();
		System.out.println("Masukkan Jumlah Barang B: ");
		jumlah_barang_B = input.nextInt();
		System.out.println("Masukkan Harga Barang C: ");
		C = input.nextInt();
		System.out.println("Masukkan Jumlah Barang C: ");
		jumlah_barang_C = input.nextInt();
		
		total_barang_A = A * jumlah_barang_A;
		total_barang_B = B * jumlah_barang_B;
		total_barang_C = C * jumlah_barang_C;
		total_harga_barang_A_B_C = total_barang_A + total_barang_B + total_barang_C;
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\t\tStruk Nota");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("NAMA BARANG\t HARGA\t\tJUMLAH\t\t TOTAL");
		System.out.println("  Barang A\t" + A + "\t\t" + jumlah_barang_A + "\t\t" + total_barang_A);
		System.out.println("  Barang B\t" + B + "\t\t" + jumlah_barang_B + "\t\t" + total_barang_B);
		System.out.println("  Barang C\t" + C + "\t\t" + jumlah_barang_C + "\t\t" + total_barang_C);
		System.out.println("\tTOTAL\t\t\t: " + total_harga_barang_A_B_C);
		
				if (total_harga_barang_A_B_C > 500000 && total_harga_barang_A_B_C <= 1000000){
					total_diskon = total_harga_barang_A_B_C * (0.02);
					total_bayar = total_harga_barang_A_B_C - total_diskon;
					System.out.println("\tDiskon\t\t\t: " + total_diskon);
					System.out.println("\tTotal Bayar\t\t: " + total_bayar);
				}
				else if (total_harga_barang_A_B_C > 200000 && total_harga_barang_A_B_C <= 500000){
					total_diskon = total_harga_barang_A_B_C * (0.02);
					total_bayar = total_harga_barang_A_B_C - total_diskon;
					System.out.println("\tDiskon\t\t\t: " + total_diskon);
					System.out.println("\tTotal Bayar\t\t: " + total_bayar);
				}
				else if (total_harga_barang_A_B_C > 100000){
					total_diskon = total_harga_barang_A_B_C * (0.1);
					total_bayar = total_harga_barang_A_B_C - total_diskon;
					System.out.println("\tDiskon\t\t\t: " + total_diskon);
					System.out.println("\tTotal Bayar\t\t: " + total_bayar);
				}
				else{
					System.out.println("Pembelian kurang dari Rp. 200.000,00");
				}
	}
}