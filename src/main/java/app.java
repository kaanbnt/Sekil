import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main( String[] args){
        boolean sonuc=false;
        List<Sekil> sekilList=new ArrayList<Sekil>();
        Scanner scanner=new Scanner(System.in);
        while (!sonuc){
            System.out.println("**********");
            System.out.println("1. Kare \n" +
                    "2. Dikdörtgen \n" +
                    "3. Üçgen\n" +
                    "4. Çıkış");
            System.out.println("**********");
            System.out.println("Seçiminiz:");
            int islem = scanner.nextInt();
            switch (islem) {
                case 1:
                    kareHesap(sekilList, scanner);
                    break;
                case 2:
                    dikdortgenHesap(sekilList, scanner);
                    break;
                case 3:
                    ucgenHesap(scanner);
                    break;
                case 4:
                    sonuc=true;
                    System.out.println("----Sistemden Çıktınız Hoşçakalın----");
                    break;
            }
        }
    }

    private static void ucgenHesap(Scanner scanner) {
        System.out.println("Üçgenin Tabanını Giriniz:");
        int taban=scanner.nextInt();
        System.out.println("Üçgenin Yüksekliğini Giriniz:");
        int yukseklik=scanner.nextInt();
        System.out.println("Üçgenin Birinci Kenarını Giriniz Giriniz:");
        int kenarBir=scanner.nextInt();
        System.out.println("Üçgenin İkinci Kenarını Giriniz Giriniz:");
        int kenarIki=scanner.nextInt();
        System.out.println("Üçgenin Üçüncü Kenarını Giriniz Giriniz:");
        int kenarUc=scanner.nextInt();
        Ucgen ucgen =new Ucgen(taban,yukseklik,kenarBir,kenarIki,kenarUc);
        ucgen.alanHesapla();
        ucgen.cevreHesapla();
    }

    private static void dikdortgenHesap(List<Sekil> kareList, Scanner scanner) {
        System.out.println("Dikdörtgenin Uzun Kenarını Giriniz:");
        int uzunKenar=scanner.nextInt();
        System.out.println("Dikdörtgenin Kısa Kenarını Giriniz:");
        int kisaKenar=scanner.nextInt();
        Dikdortgen dikdortgen =new Dikdortgen(uzunKenar,kisaKenar);
        dikdortgen.alanHesapla();
        dikdortgen.cevreHesapla();

        kareList.add(dikdortgen);
    }

    private static void kareHesap(List<Sekil> kareList, Scanner scanner) {
        System.out.println("Karenin Kenarını Giriniz:");
        int kenar=scanner.nextInt();

        Kare kare=new Kare(kenar);
        kare.alanHesapla();
        kare.cevreHesapla();

        kareList.add(kare);
    }
}
