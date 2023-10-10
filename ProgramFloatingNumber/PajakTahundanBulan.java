package ProgramFloatingNumber;

public class PajakTahundanBulan {
    public static void main(String[] args) {
        // Pendapatan tahunan
        float pendapatanTahunan = 50000.0f;
        double pendapatanBulanan = 50000.0;

        // Tarif pajak dalam bentuk desimal (persentase)
        float tarifPajak1 = 0.15f; // 15%
        double tarifPajak2 = 0.15; // 15%

        // Menghitung jumlah pajak dengan tipe data float
        float jumlahPajak1 = pendapatanTahunan * tarifPajak1;

        // Menghitung jumlah pajak dengan tipe data double
        double jumlahPajak2 = pendapatanBulanan * tarifPajak2;

        // Menampilkan hasil perhitungan untuk tipe data float
        System.out.println("Pendapatan Tahunan \t: $" + pendapatanTahunan);
        System.out.println("Tarif Pajak \t\t: " + (tarifPajak1 * 100) + "%");
        System.out.println("Jumlah Pajak \t\t: $" + jumlahPajak1);

        // Menampilkan hasil perhitungan untuk tipe data double
        System.out.println("\nPendapatan Tahunan \t: $" + pendapatanTahunan);
        System.out.println("Tarif Pajak \t\t: " + (tarifPajak2 * 100) + "%");
        System.out.println("Jumlah Pajak \t\t: $" + jumlahPajak2);
    }
    
}
