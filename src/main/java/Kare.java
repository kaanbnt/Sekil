public class Kare extends Sekil {
    private int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        int alan = this.kenar*this.kenar;
        System.out.println("Kare'nin alanı : "+alan);
    }

    @Override
    public void cevreHesapla() {
        int cevre=this.kenar*4;
        System.out.println("Kare'nin çevresi:"+cevre);
    }
}
