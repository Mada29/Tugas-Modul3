import java.util.Scanner;

/**
 * Dokumentasi
 *
 * Ini adalah program untuk menghitung Luas dan Keliling Segitiga.
 * Program ini memungkinkan pengguna untuk memasukkan input berupa panjang alas dan tinggi
 * atau panjang sisi-sisi segitiga untuk menghitung luas atau kelilingnya.
 *
 * @author Mada
 *
 */
public class Main {
    int luas, keliling, pilih, hasil;
    Scanner input = new Scanner(System.in);

    /**
     * Method HitungLuas untuk menghitung input luas segitiga.
     * Pengguna diminta untuk memasukkan panjang alas dan tinggi.
     * Hasil luas segitiga akan ditampilkan.
     */
    public void HitungLuas() {
        int a, b;
        System.out.println("Masukkan Alas: ");
        a = input.nextInt();
        System.out.println("Masukkan Tinggi: ");
        b = input.nextInt();

        hasil = a * b / 2;
        System.out.println("Hasil: " + hasil);
    }

    /**
     * Method HitungKeliling untuk menghitung input keliling segitiga.
     * Pengguna diminta untuk memasukkan panjang sisi a, b, dan c.
     * Hasil keliling segitiga akan ditampilkan.
     */
    public void HitungKeliling() {
        int a, b, c;
        System.out.println("Masukkan Panjang Sisi a: ");
        a = input.nextInt();
        System.out.println("Masukkan Panjang Sisi b: ");
        b = input.nextInt();
        System.out.println("Masukkan Panjang Sisi c: ");
        c = input.nextInt();

        hasil = a + b + c;
        System.out.println("Hasil: " + hasil);
    }

    /**
     * Method display untuk menampilkan pilihan kepada pengguna.
     * Pengguna diminta untuk memilih apakah ingin menghitung luas atau keliling segitiga.
     */
    public void display() {
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("Pilih");
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Pilih: ");
        pilih = input.nextInt();

        if (pilih == 1) {
            HitungLuas();
        } else if (pilih == 2) {
            HitungKeliling();
        } else {
            System.out.println("Maaf, Tidak Ada Inputan Yang Sesuai");
        }
    }

    /**
     * Method main untuk menjalankan program kelas Main.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.display();
    }
}
