package ProgramTipeDataBoolean;

public class Pajak {
    public static void main(String[] args) {
        // Pendapatan tahunan
        double pendapatanTahunan = 55000.0;

        // Batas pendapatan yang menentukan apakah harus membayar pajak
        double batasPendapatan = 50000.0;

        // Membuat variabel boolean untuk menentukan apakah harus membayar pajak
        boolean harusBayarPajak = pendapatanTahunan > batasPendapatan;

        // Menampilkan hasil perhitungan
        System.out.println("Pendapatan Tahunan \t\t:$" + pendapatanTahunan);
        System.out.println("Batas Pendapatan untuk Pajak \t:$" + batasPendapatan);

        // Menggunakan variabel boolean untuk menentukan apakah harus membayar pajak
        if (harusBayarPajak) {
            System.out.println("Anda harus membayar pajak.");
        } else {
            System.out.println("Anda tidak harus membayar pajak.");
    }
  }
}
