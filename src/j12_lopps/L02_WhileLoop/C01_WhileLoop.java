package j12_lopps.L02_WhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*
        başlangıç ve bitiş değerleri net (bilinen) olan tekrarlarda for loop
        ama adım sayısı belli olmayıp bir şarta ya da duruma bağlı olan durumlarda while loop kullanılır.
         */

        // 11 den 20 ye kadar olan tam sayıları print eden code creat ediniz.

        System.out.print("    **** for ****   ");
        for (int i=11; i<21; i++) {
            System.out.println(i+" ");
        }
        System.out.print("   ***** while ****    ");
        int basla=11;
        while (basla<21){ //basla 21 den küçük oldugu sürece(iken) body action uygula
            System.out.println(basla+" ");
            basla++;
        }

        // 7 kere javaCAN print eden code creat ediniz
        int b=1;
        while (b<8){
            System.out.println("javaCAN");
            b++; // bunu yazmazsan sonsuza kadar çalışır.

        }



    } // main dışı
}
