public class Percobaan2_greeting{
    static void berisalam() {
        System.out.println("Halo! selamat pagi");
    }
    static void beriUcapan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String []args) {
        berisalam();
        String salam = "Selamat datang di Pemrograman Java";
        beriUcapan(salam);
    }
}