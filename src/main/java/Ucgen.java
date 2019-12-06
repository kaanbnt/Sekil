public class Ucgen extends Sekil {
    private int taban;
    private int yukseklik;
    private int kenarBir;
    private int kenarIki;
    private int kenarUc;

    public Ucgen(int taban, int yukseklik, int kenarBir, int kenarIki, int kenarUc) {
        this.taban = taban;
        this.yukseklik = yukseklik;
        this.kenarBir = kenarBir;
        this.kenarIki = kenarIki;
        this.kenarUc = kenarUc;
    }

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getKenarBir() {
        return kenarBir;
    }

    public void setKenarBir(int kenarBir) {
        this.kenarBir = kenarBir;
    }

    public int getKenarIki() {
        return kenarIki;
    }

    public void setKenarIki(int kenarIki) {
        this.kenarIki = kenarIki;
    }

    public int getKenarUc() {
        return kenarUc;
    }

    public void setKenarUc(int kenarUc) {
        this.kenarUc = kenarUc;
    }

    public void alanHesapla() {
        int alan = this.taban * this.yukseklik / 2;
        System.out.println("Üçgenin Alanı: "+alan);
    }

    public void cevreHesapla() {
        int cevre=this.kenarBir+this.kenarIki+this.kenarUc;
        System.out.println("Üçgenin Çevresi: "+cevre);
    }
}
