package A_Practice.Loop;

public class Loop03_basmakRakamTop {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {
        int sayi =2562;
        System.out.println(basamakToplami(sayi));
    }
    private static int basamakToplami(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;

    }
}
//do while



//for ile

