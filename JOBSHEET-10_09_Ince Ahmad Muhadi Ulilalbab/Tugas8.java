public class Tugas8 {
    public static void main(String[] args) {

        char nama [][] = new char[5][8];
        char [] karakter = {'A', 'l', 'b', 'e', 'r', 't', 'E', 'i', 'n', 'S', 't', 'e', 'i', 'n'};
        int p=0;
        for (int baris = 0; baris < nama.length; baris++){
            for (int kolom = 0; kolom < nama.length; kolom++){
                if (p==karakter.length){
                    p=0;
                }
                nama[baris][kolom] = karakter[p];
                p++;
                System.out.print(nama[baris] [kolom]+ " ");
            }
            System.out.println("");
        }
        

    }
}
