import java.util.Scanner;
public class Tugas_Perulangan1_09 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int batas = 20;


        for(int i = 1; i <= batas; i++) {
            if (i%2 !=0){
                if (i%11 !=0){
                    if (i%17 !=0){
                        System.out.print(i + " ");
                    }
                }
               
                
            }
        }
    }
}