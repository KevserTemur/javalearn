package j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        // Array eşitlik kontrolü ******   equals ()  *******
        // methodu index ve value kontrol eder, true false verir

        int sayi1[]={39,3,72,63,84};
        int sayi2[]={84,72,63,3,39};

        System.out.println("sayı1 ve sayı2 eşit mi : " + Arrays.equals(sayi1, sayi2));//false

        Arrays.sort(sayi1);//[3,39,63,72,84]
        Arrays.sort(sayi2);//[3,39,63,72,84]

        System.out.println("sayı1 ve sayı2 eşit mi : " + Arrays.equals(sayi1, sayi2));//true





    }
}
