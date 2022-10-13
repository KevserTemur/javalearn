package j15_Arrays;

import java.util.Arrays;

public class C06_MdArrays {
    public static void main(String[] args) {

        /*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
       icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
        en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

        // MdArray Tanımlama....
        int arr1[][]= new int[3][5]; // 3 katlı her katta 5 daire olan boş apartman // 3 satır 5 sütun
        // bir sitede her birinde 10 dairelik 8 katlı 6 apartman var. nasıl array olarak tanımlanır.

        // TRİCK --->   Array i uzunlukları ile tanımlamak için inner (iç) uzunlukları eşit olmalı

        int site [][][]= new int[6][8][10];
        // 24 kişilik 3 sınıf ve 21 kişilik 5 sınıf olan okul nasıl array olarak tanımlanır
        int sınıf24 [][]= new int[3][24];
        int sınıf21 [][]= new int[5][21];// boş sınıflar


        // MdArray eleman ekleme......
        arr1[2][4]=35;
        arr1[0][3]=34; // 0, kat 5, daireye 34 değeri atandı
        System.out.println(arr1[0][3]);


        // elemanları girilerek array tanımlama
         int arr [][]={{1,2,3},{10,20},{101},};

        int arr2 [][]={
                {1,2,3},
                {10,20},
                {101},}
                ;
        // 101 eleman indeksi     arra[2][0]

        // MdArray elemanları print etme

        System.out.println((arr[1])); // referans verir
        System.out.println(Arrays.toString(arr[1])); // 10,20
        System.out.println(arr[1][0]); // 10
        // array doğrudan sout ile print etmez. array i print etmek için toString içine yazmak gerekir.
        // doğrudan yazdırırsan referans değerini getirir.
        /*
        MdArray leri yazdırmak için toString methodu kullanılmaz
         toString methodu outer methodu Stringe cevirir
         outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin
         referans degerlerini yazdirilir
         */

        System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [10, 20], [101]]


    }
}
