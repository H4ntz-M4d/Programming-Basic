import java.util.Scanner;

public class Tugas2_Pemilihan2_09{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String menu, pilih;
		float sisi, alas, tinggi, jari2, rusuk;
		double luas, volume;
		
		System.out.println ("\nPilihlah Menu Operasi Untuk Menghitung");
		System.out.println ("1. Luas");
		System.out.println ("2. Volume");
		System.out.print ("Pilih (1 atau 2) : ");
		menu = sc.nextLine();
		
		if (menu.equalsIgnoreCase("1")) {
			System.out.println ("\nPilihlah Bangun Datar");
			System.out.println ("~~~~~~~~~~~~~~~~~~~~~");
			System.out.println ("A. Persegi");
			System.out.println ("B. Segitiga");
			System.out.print ("Pilih (A atau B) : ");
			pilih = sc.nextLine();
			
			if (pilih.equalsIgnoreCase ("A")){
				System.out.print ("Panjang Sisi = ");
				sisi = sc.nextFloat();
				luas = sisi * sisi;
				
				System.out.println ("===================");
				System.out.println ("LUAS PERSEGI = " + luas);
				System.out.println ("===================");
				
			}else if(pilih.equalsIgnoreCase ("B")){
				System.out.print ("Alas : ");
				alas = sc.nextFloat();
				System.out.print ("Tinggi : ");
				tinggi = sc.nextFloat();
				luas = (0.5) * alas * tinggi;
				
				System.out.println ("===================");
				System.out.println ("LUAS SEGITIGA = " + luas);
				System.out.println ("===================");
			} else {
				System.out.println ("Pilihan Yang Anda Masukkan Salah!!!");
			}
			
		} else if (menu.equalsIgnoreCase("2")){
            System.out.println("\nPilihlah Bangun Ruang");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("A. Kubus");
            System.out.println("b. Tabung");
            System.out.print("Pilih (A atau B) : ");
            pilih = sc.nextLine();
            
            if (pilih.equalsIgnoreCase("A")){
                System.out.print("Panjang Rusuk = ");
                rusuk = sc.nextFloat();
                volume = rusuk * rusuk * rusuk;
				
                System.out.println("===================");
                System.out.println("VOLUME KUBUS = " + volume);
                System.out.println("===================");
				
            } else if (pilih.equals("B")) {
                System.out.print("Masukkan Jari - jari = ");
                jari2 = sc.nextFloat();
                System.out.print("Masukkan Tinggi = ");
                tinggi = sc.nextFloat();
                volume = (3.14) * jari2 * jari2 * tinggi;
				
                System.out.println("===================");
                System.out.println("VOLUME TABUNG = " + volume);
                System.out.println("===================");
            } else {
                System.out.println("Pilihan Yang Anda masukkan salah!");
            }
			
        } else {
            System.out.println("Pilihan yang Anda masukkan salah!");
        }
    }
}