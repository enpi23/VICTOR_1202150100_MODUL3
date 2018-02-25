package enpi23.modul3.prak.anrdro.victor_1202150100_modul3;

/**
 * Created by Enpi23 on 24/02/2018.
 */
class Water {
    String nama;
    String deskripsi;
    int gambar;

    public Water(String nama, String deskripsi, int gambar) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}