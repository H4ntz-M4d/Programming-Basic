import java.util.Scanner;
public class ArrayDua3_MI_09 {
    public static void main(String[] args) {

        //09_Ince Ahmad Muhadi Ulilalbab
        //MI 1A
        Scanner scan = new Scanner (System.in);

        int data[] [] = new int[4] [4];
        int jam[] = {3, 6, 9, 12};
        int min[] = {100, 100, 100, 100};
        double total[] = {0,0,0,0};
        double rata[] = {0,0,0,0};
        
        for (int i = 0; i < data.length; i++){
            System.out.printf("Jam %s\n", jam[i] );
            for (int j = 0; j < data.length; j++){
                switch(j) {

                    case 0 :
                            System.out.print("Masukkkan suhu : ");
                            data[i] [j] = scan.nextInt();
                            break;
                    
                    case 1 :
                            System.out.print("Masukkan kelembaban : ");
                            data[i] [j] = scan.nextInt();
                            break;

                    case 2 :
                            System.out.print("Masukkan kecepatan angin : ");
                            data[i] [j] = scan.nextInt();
                            break;

                    case 3 :
                            System.out.print("Masukkan Index : ");
                            data[i] [j] = scan.nextInt();
                            break;
                }
            }
        }
        for (int i = 0; i < data.length; i++){
            System.out.printf("Jam %s\n", jam[i] );
            for (int j = 0; j < data.length; j++){
                switch (j) {

                    case 0 :
                        System.out.print("Masukkan Suhu : ");
                        data[i] [j] = scan.nextInt();
                        if (min [j] > data[i] [j]) {
                        min [j] = data[i] [j];
                        }
                        total [j] += data[i] [j];
                        break;

                    case 1 :
                        System.out.print("Masukkan kelembaban : ");
                        data[i] [j] = scan.nextInt();
                        if (min [j] > data[i] [j]) {
                        min [j] = data[i] [j];
                        }
                        total [j] += data[i] [j];
                        break;

                        case 2 :
                        System.out.print("Masukkan kecepatan angin : ");
                        data[i] [j] = scan.nextInt();
                        if (min [j] > data[i] [j]) {
                        min [j] = data[i] [j];
                        }
                        total [j] += data[i] [j];
                        break;

                        case 3 :
                        System.out.print("Masukkan index UV : ");
                        data[i] [j] = scan.nextInt();
                        if (min [j] > data[i] [j]) {
                        min [j] = data[i] [j];
                        }
                        total [j] += data[i] [j];
                        break;
                }
                rata [j] = total[j] / data[0].length;
            }
        }
        System.out.println("-------------------------");
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length; j++ ) {
                System.out.print(data[i] [j] + " ");
            }
            System.out.println("");
        }
        System.out.println("------------------------");
        System.out.printf("Rata-rata suhu : %.2f\n", rata[0]);
        System.out.printf("Persentase kelembaban terendah : %s\n", min[1]);
    }
}