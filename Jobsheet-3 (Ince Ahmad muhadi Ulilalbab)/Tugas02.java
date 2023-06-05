import java.util.Scanner;
public class Tugas02{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double hargaAsliItemTandaBiru, hargaAsliItemTandaMerah, hargaItemBiru, hargaItemMerah, uangYangHarusDiBayar;
		float diskonItemBiru, diskonItemMerah;
		
		System.out.print("Masukkan Harga asli item biru : ");
		hargaAsliItemTandaBiru = sc.nextDouble();
		System.out.print("Masukkan Harga asli item merah : ");
		hargaAsliItemTandaMerah = sc.nextDouble();
		System.out.print("Masukkan Diskon item biru (50% = (0.5)) : ");
		diskonItemBiru = sc.nextFloat();
		System.out.print("Masukkan Diskon item merah (30% = (0.3) : ");
		diskonItemMerah = sc.nextFloat();
		
		hargaItemBiru = hargaAsliItemTandaBiru - (hargaAsliItemTandaBiru * diskonItemBiru);
		hargaItemMerah = hargaAsliItemTandaMerah - (hargaAsliItemTandaMerah * diskonItemMerah);
		uangYangHarusDiBayar = hargaItemBiru + hargaItemMerah;
		System.out.println("Total uang yang harus dibayar susi adalah sebesar Rp. " + uangYangHarusDiBayar);
	}
}