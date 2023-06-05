import java.util.Scanner;
public class DoWhileCutiKelas_09 {
    public static void main(String[]args){
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t   Selamat Datang Di GoTrain ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n Silahkan untuk memilih menu dibawah ini");
        System.out.println("\t ~ 1. Silahkan Pilih Asal Kota       : Surabaya, Madiun");
        System.out.println("\t ~ 2. Silahkan Plih Tujuan           : Jakarta, Yogyakarta, Semarang, Solo");
        System.out.println("\t ~ 3. JadwalKeberangkatan            : Kamis,Jumat, Sabtu, Minggu");
        String Tujuan[] = {"Jakarta", "Yogyakarta", "Semarang", "Solo"};
        String pembayaran, Dana, OVO, Gopay, Visa, ulangi;
        String Jadwal [] = {"Kamis", "Jumat", "Sabtu", "Minggu"};
        String Dituju[] = new String [4];
        String Keberangkatan[] = new String[4];
        int HargaTiket[] = {300000, 200000, 150000, 250000};
        int Stock[] = {5, 6, 7, 5};
        int Tiket[] = {1, 2, 3, 4};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int JumlahTiket =0;
        int Kursi[] = new int [4];
        int HargaP[] = new int [4];
        int StockQ[] = new int [4];
        int pengulangan, sisaStock = 0;
        double diskon;
        double totalAkhir = 0;

        boolean pemesanan = true;
        Scanner Zidan = new Scanner(System.in);
        int pilihtujuan;
        System.out.printf("Silahkan Pilih Tujuan : ");
        pilihtujuan = Zidan.nextInt();
            do{
                switch (pilihtujuan) {
            
                case 1 :
                System.out.println("Pilih yang ingin Anda tuju : " +Tujuan[0]);
                System.out.println("Pilih Jadwal Keberangkatan : " +Jadwal[0]);
                System.out.println("Stock : " +Stock[0]);
                System.out.println("Tiket yang anda pesan : " +Tiket[0]);
                System.out.println("Harga Tiket : " +HargaTiket[0]);
                Dituju[a] = Tujuan[0];
                Keberangkatan[b] = Jadwal[0];
                StockQ[c] = Stock[0];
                HargaP[d] = HargaTiket[0];
                Kursi [e] = Tiket[0];
                totalAkhir= HargaP[c] * 0.25 *1;
                break;

                case 2 :
                System.out.println("Pilih yang ingin Anda tuju : " +Tujuan[1]);
                System.out.println("Pilih Jadwal Keberangkatan : " +Jadwal[1]);
                System.out.println("Stock : " +Stock[1]);
                System.out.println("Tiket yang anda pesan : " +Tiket[1]);
                System.out.println("Harga Tiket : " +HargaTiket[1]);
                Dituju[a] = Tujuan[1];
                Keberangkatan[b] = Jadwal[1];
                StockQ[c] = Stock[1];
                HargaP[d] = HargaTiket[1];
                Kursi [e] = Tiket[1];
                totalAkhir = HargaP[c] * 0.5 *2;
                break;

                case 3 :
                System.out.println("Pilih yang ingin Anda tuju : " +Tujuan[2]);
                System.out.println("Pilih Jadwal Keberangkatan : " +Jadwal[2]);
                System.out.println("Stock : " +Stock[2]);
                System.out.println("Tiket yang anda pesan : " +Tiket[2]);
                System.out.println("Harga Tiket : " +HargaTiket[2]);
                Dituju[a] = Tujuan[2];
                Keberangkatan[b] = Jadwal[0];
                StockQ[c] = Stock[2];
                HargaP[d] = HargaTiket[2];
                Kursi [e] = Tiket[2];
                totalAkhir = HargaP[c] * 0.1 * 3;
                break;

                case 4 :
                System.out.println("Pilih yang ingin Anda tuju : " +Tujuan[3]);
                System.out.println("Pilih Jadwal Keberangkatan : " +Jadwal[3]);
                System.out.println("Stock : " +Stock[3]);
                System.out.println("Tiket yang anda pesan : " +Tiket[3]);
                System.out.println("Harga Tiket : " +HargaTiket[3]);
                Dituju[a] = Tujuan[3];
                Keberangkatan[b] = Jadwal[3];
                StockQ[c] = Stock[3];
                 HargaP[d] = HargaTiket[3];
                Kursi [e] = Tiket[3];
                totalAkhir = HargaP[c] * 0.15 * 4;
                break;

                default:
                System.out.println("Maaf Angka yang anda masukkan tidak sesuai !!");
                }

                System.out.println("Jumlah tiket yang dipesan");
                JumlahTiket= Zidan.nextInt();
                System.out.println("Pilih Pembayaran : ");
                System.out.println("Dana");
                System.out.println("OVO");
                System.out.println("Visa");
                System.out.println("Gopay");
                System.out.println("Pilih Metode Pembayaran : ");
                pembayaran= Zidan.next();
                if(pembayaran.equalsIgnoreCase("Visa")){
                    System.out.println("Pilih Pembayaran : " +pembayaran);
                }
                else{
                    System.out.println("Pilihan Pembayaran : " +pembayaran);
                }

                totalAkhir = HargaTiket[d] * JumlahTiket;
                sisaStock = StockQ[c] * JumlahTiket;

                System.out.println("~~~~~~~~~~~~~~~~Nota Penjualan Tiket GoTrain~~~~~~~~~~~~~~~~");
                System.out.println("Tujuan Kota = "+Dituju[a]);
                System.out.println("Kursi Yang Anda Pesan = " +Kursi[e]);
                System.out.println("Jadwal Keberangkatan = " +Keberangkatan[b]);

                System.out.println(("Silahkan Nimakti Makan Dan Minum Gratis di GoTrain"));
                System.out.println("Harga diskon = "+totalAkhir);
                System.out.println("Makasih Telah Memesan Tiket Kami di GoTrain");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("Apakah anda ingin Memesan Kembali(y/t)? ");
                ulangi = Zidan.next();
                
                    while(ulangi.equalsIgnoreCase("y"));
                    if(ulangi.equalsIgnoreCase("t")){
                    System.out.println("Terimakasih telah memesan :)");
                }
                else {

                }
            

                System.out.println("Jumlah tiket yang dipesan : ");
                JumlahTiket= Zidan.nextInt();
                System.out.println("Pilih Pembayaran : ");
                System.out.println("Dana");
                System.out.println("OVO");
                System.out.println("Visa");
                System.out.println("Gopay");
                System.out.println("Pilih Metode Pembayaran : ");
                pembayaran= Zidan.next();
                if(pembayaran.equalsIgnoreCase("Visa")){
                    System.out.println("Pilih Pembayaran : " +pembayaran);
                }
                else{
                    System.out.println("Pilihan Pembayaran : " +pembayaran);
                }
                
                totalAkhir = HargaTiket[d] * JumlahTiket;
                sisaStock = StockQ[c] * JumlahTiket;

                System.out.println("~~~~~~~~~~~~~~~~Nota Penjualan Tiket GoTrain~~~~~~~~~~~~~~~~");
                System.out.println("Tujuan Kota = "+Dituju[a]);
                System.out.println("Kursi Yang Anda Pesan = " +Kursi[e]);
                System.out.println("Jadwal Keberangkatan = " +Keberangkatan[b]);

                System.out.println(("Silahkan Nimakti Makan Dan Minum Gratis di GoTrain"));
                System.out.println("Harga diskon = "+totalAkhir);
                System.out.println("Makasih Telah Memesan Tiket Kami di GoTrain");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("Apakah anda ingin Memesan Kembali(y/t)? ");
            ulangi = Zidan.next();
                    
            } while(ulangi.equalsIgnoreCase("y"));
              if(ulangi.equalsIgnoreCase("t")){
              System.out.println("Terimakasih telah memesan :)");
        
    }
}
}