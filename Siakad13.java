import java.util.Scanner;
public class Siakad13 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String nama, nim;
     char kelas;
     byte absen;
     double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

     System.out.print("Masukkan nama : ");
     nama = sc.nextLine();
     System.out.print("Masukkan NIM : ");
     nim = sc.nextLine();
     System.out.print("Masukkan kelas : ");
     kelas = sc.nextLine().charAt(0);
     System.out.print("Masukkan nomor absen : ");
     absen = sc.nextByte();
     System.out.print("Masukkan nilai kuis : ");
     nilaiKuis = sc.nextDouble();
     System.out.print("Masukkan nilai tugas : ");
     nilaiTugas = sc.nextDouble();
     System.out.print("Masukkan nilai ujian : ");
     nilaiUts = sc.nextDouble();
     System.out.print("Masukkan nilai ujian : ");
     nilaiUas = sc.nextDouble();


     nilaiKuis = (nilaiKuis * 0.2);
     nilaiTugas = (nilaiTugas * 0.15);
     nilaiUts = (nilaiUts * 0.3);
     nilaiUas = (nilaiUas * 0.35);


     nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUts + nilaiUas);

     System.out.println("Nama : " + nama + " NIM : " + nim);
     System.out.println("Kelas : " + kelas + "Absen : " + absen);
     System.out.println("Nilai Akhir : " + nilaiAkhir);

     if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
        System.out.println("Nilai Akhir huruf : A");
        System.out.println("Kualifikasi : Sangat baik");
     }
     else if (nilaiAkhir > 73) {
        System.out.println("Nilai Akhir huruf : B+");
        System.out.println("Kualifikasi : Lebih dari baik");
     }
     else if (nilaiAkhir > 65) {
        System.out.println("Nilai Akhir huruf : B");
        System.err.println("Kualifikasi : Baik");
     }
     else if (nilaiAkhir > 60)  {
        System.out.println("Nilai Akhir huruf : C+");
        System.out.println("Kualifikasi : Lebih dari cukup");
     }
     else if (nilaiAkhir > 50) {
        System.out.println("Nilai huruf C");
        System.out.println("Kualifikasi : Cukup");
     }
     else if (nilaiAkhir > 39) {
        System.out.println("Nilai Akhir huruf : D");
        System.out.println("Kualifikasi : Kurang");
     }
     else {
        System.err.println("Nilai Akhir huruf : E");
        System.out.println("Kualifikasi : gagal");

     }


     

    }
}