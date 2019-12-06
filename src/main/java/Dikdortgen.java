public class Dikdortgen extends Sekil {
    private int uzunKenar;
    private int kisaKenar;
    public Dikdortgen(int uzunKenar,int kisaKenar) {
        this.uzunKenar=uzunKenar;
        this.kisaKenar=kisaKenar;
    }

    @Override
    public void alanHesapla() {
        int alan = this.kisaKenar*this.uzunKenar;
        System.out.println("Dikdörtgenin Alanı: "+alan);
    }

    @Override
    public void cevreHesapla() {
        int cevre = this.kisaKenar*2 + this.uzunKenar*2;
        System.out.println("Dikdörtgenin Çevresi: "+cevre);
    }
}
