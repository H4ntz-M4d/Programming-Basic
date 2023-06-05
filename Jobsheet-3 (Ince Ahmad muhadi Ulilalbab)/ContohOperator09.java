public class ContohOperator09{
	
	public static void main(String[] args){
		int x = 20;
		System.out.println("x++ = " + x++);
		System.out.println("Setelah evaluasi, x = " + x);
		x = 20;
		System.out.println("++x = " + ++x);
		System.out.println("Setelah evaluasi, x = " + x);
		int y = 22;
		System.out.println(x > y || y == x && y <= x);
		int z = x ^ y;
		System.out.println("Hasil x ^ y adalah " + z);
		z %= 5;
		System.out.println("Hasil akhir " +z);
	}
}