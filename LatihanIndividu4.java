import java.util.Scanner;
public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usia;
        String kategori;

        System.out.println("Masukkan usia : ");
        usia = sc.nextInt();

        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        }
        else if (usia > 12 && usia <= 19){
            kategori = "Remaja";
        }
        else if (usia > 19 && usia <= 64) {
            kategori = "Dewasa";
        }
        else if (usia >= 65) {
            kategori = "Lansia";
        }
        else {
            kategori = "input tidak valid";
        }

        System.out.println(usia + " memiliki kategori " + kategori);
    }
}
