import java.util.Scanner;
public class Tugas8_2 {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        int array[][] = new int[3][4];
        int[] tertinggi = new int [3];
        int barang[] = {0, 0, 0, 0};
        int[] tiapJenisBuku ={0, 0, 0, 0};
        int harga[] = {0, 0, 0, 0};
        int perJenisBuku [] ={0, 0, 0, 0};
        String Toko [] = {"Dieng", "Soehat", "Sengkaling",}; 
        String[] jenis = {"Novel", "Komik", "Pelajaran", "Ensiklopedi"};
        int totalBuku = 0, pemTertinggi = 0, bukuTerjual = 0, perBuku = 0, perCabang = 0, total = 0;
        String cabTertinggi = "";

        for (int  x = 0; x < array.length; x++) {
            System.out.printf("\n\nToko %s\n", Toko[x]);
            for (int y = 0; y < array[0].length; y++) {
                switch (y) {

                    case 0 :
                        System.out.println("Novel");
                        System.out.print("Masukkan Jumlah : ");
                        array [x][y] = sc.nextInt();
                        System.out.println("Masukkan harga barang : ");//[0][0] + [0][1]
                        harga [y]= sc.nextInt();
                        if (barang [y] > array [x][y]){
                            barang [y] = array [x][y];
                        }
                        harga [y] *= array[x][y];
                        System.out.print("Total = "+harga[y]);
                        break;
                    
                    case 1 :
                        System.out.println("\n\nKomik");
                        System.out.print("Masukkan Jumlah : ");
                        array [x][y] = sc.nextInt();
                        System.out.println("Masukkan harga barang : ");
                        harga [y]= sc.nextInt();
                        if (barang [y] > array [x][y]){
                            barang [y] = array [x][y];
                        }
                        harga [y] *= array[x][y];
                        System.out.print("Total = "+harga[y]);
                        break;

                    case 2 :
                        System.out.println("\n\nBuku Pelajaran");
                        System.out.print("Masukkan Jumlah : ");
                        array [x][y] = sc.nextInt();
                        System.out.println("Masukkan harga barang : ");
                        harga [y]= sc.nextInt();
                        if (barang [y] > array [x][y]){
                            barang [y] = array [x][y];
                        }
                        harga [y] *= array[x][y];
                        System.out.print("Total = "+harga[y]);
                        break;
                    
                    case 3 :
                        System.out.println("\n\nEnsiklopedia");
                        System.out.print("Masukkan Jumlah : ");
                        array [x][y] = sc.nextInt();
                        System.out.println("Masukkan harga barang : ");
                        harga [y]= sc.nextInt();
                        if (barang [y] > array [x][y]){
                            barang [y] = array [x][y];
                        }
                        harga [y] *= array[x][y];
                        System.out.print("Total = "+harga[y]);
                        break;

                }
                bukuTerjual += array[x][y];
                switch (y){
                    case 0 :
                    perBuku = array[x][y] * harga[y];
                    break;
                    case 1 :
                    perBuku = array[x][y] * harga[y];
                    break;
                    case 2 :
                    perBuku = array[x][y] * harga[y];
                    break;
                    case 3 :
                    perBuku = array[x][y] * harga[y];
                    break;
                }
                perCabang += perBuku;
            }
            switch (x) {
                case 0 :
                System.out.printf("Banyak buku terjual  \t\t\t: %d pcs\n", bukuTerjual);
                System.out.printf("Total pemasukan  \t\t\t: Rp. %d\n", perCabang);
                bukuTerjual = 0;
                break;
                case 1 :
                System.out.printf("Banyak buku terjual  \t\t\t: %d pcs\n", bukuTerjual);
                System.out.printf("Total pemasukan  \t\t\t: Rp. %d\n", perCabang);
                bukuTerjual = 0;
                break;
                case 2 :
                System.out.printf("Banyak buku terjual  \t\t\t: %d pcs\n", bukuTerjual);
                System.out.printf("Total pemasukan  \t\t\t: Rp. %d\n", perCabang);
                bukuTerjual = 0;
                break;
            }
            tertinggi [x] = perCabang;
            perCabang = 0;
        }
        for (int x = 0; x < array.length; x++){
            for (int y = 0; y < array[0].length; y++){
                switch(y){
                    case 0 :
                    tiapJenisBuku[y] += array[x][y];
                    break;
                    case 1 :
                    tiapJenisBuku[y] += array[x][y];
                    break;
                    case 2 :
                    tiapJenisBuku[y] += array[x][y];
                    break;
                    case 3 :
                    tiapJenisBuku[y] += array[x][y];
                    break;
                }
            }
        }
        for (int i = 0; i < jenis.length; i++){
            total = perJenisBuku[i] * harga[i];
            total += total;
        }
        System.out.println("---------------------------------------");
        System.out.println("Total pemasukan Togamas adalah\t\t: Rp. " + total);
        for (int i = 0; i < tertinggi.length; i ++){
            if (tertinggi[i] > pemTertinggi){
                pemTertinggi = tertinggi[i];
                cabTertinggi = Toko[i];
            }
        }
        if (tertinggi[0] != tertinggi [1] && tertinggi[0] != tertinggi[2] && tertinggi[1] != tertinggi[2]){
            System.out.printf("Pemasukan tertinggi adalah cabang\t: %s\n", cabTertinggi);
            System.out.printf("Dengan total pemasukan\t\t\t: Rp. %d\n", pemTertinggi);
        } 
        else
        System.out.println("Ada 2 cabang memiliki pemasukan yang sama");
        System.out.println("---------------------------------------");
    }
}
