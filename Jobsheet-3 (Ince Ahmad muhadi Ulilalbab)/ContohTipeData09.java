public class ContohTipeData09{
	
	public static void main(String[] args){
		char golonganDarah                 = 'A';
		byte jarak                         = (byte) 150;
		short jumlahPendudukDalamSatuDusun = 1000;
		float suhu                         = 35.07F;
		double berat                       = 0.4801234567;
		long saldo                         = 450000;
		int angkaDesimal                   = 0x18;
		
		System.out.println("Golongan darah\t\t\t\t\t: " + (byte) golonganDarah);
		System.out.println("Jarak\t\t\t\t\t: " + jarak);
		System.out.println("Jumlah penduduk dalam datu dusun\t\t: " + jumlahPendudukDalamSatuDusun);
		System.out.println("Suhu\t\t\t\t\t: " + suhu);
		System.out.println("Berat\t\t\t\t\t: " + (float) berat);
		System.out.println("Saldo\t\t\t\t\t: " + saldo);
		System.out.println("Angka desimal\t\t\t\t\t: " + angkaDesimal);
	}
}