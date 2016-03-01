package tugascerpen;

public class Data {

    private String nim, nama_mahasiswa;
    private int jumlah_kata_perhalaman;

    public void Nim(String nim) {
        this.nim = nim;
    }

    public void Nama(String nama) {
        this.nama_mahasiswa = nama;
    }

    public void JumlahKata(int jumlah) {
        this.jumlah_kata_perhalaman = jumlah;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama_mahasiswa;
    }

    public void JumlahKata() {
        if (jumlah_kata_perhalaman < 100) {
            System.out.println("Jumlah Kata Masih Kurang!!!");
        } else if (jumlah_kata_perhalaman > 500) {
            System.out.println("Jumlah Kata Terlalu Banyak!!!");
        } else {
            System.out.println(jumlah_kata_perhalaman = jumlah_kata_perhalaman * 30);
        }
    }
}
