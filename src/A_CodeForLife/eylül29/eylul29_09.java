package A_CodeForLife.eylül29;

public class eylul29_09 {
    public static void main(String[] args) {
  /*  9- 		String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
                 String str1 = “$13.99”
                 String str2 = “$10.55”
                  İpucu :)) : Double.parseDouble() methodunu kullanabilirsiniz.
                */

        String str1 = "$13.99";
        str1 = str1.replaceAll("\\D", "");
        System.out.println(str1); //1399
        String str2 = "$10.55";

        str2 = str2.replaceAll("\\D", "");
        System.out.println(str2);
        System.out.println(str1 + str2);

        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        double toplam = (sayi1 + sayi2) / 100;
        System.out.println("$" + toplam);
 /*  9- 		String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
                 String str1 = “$13.99”
                 String str2 = “$10.55”
                  İpucu :)) : Double.parseDouble() methodunu kullanabilirsiniz.

     public static void main(String[] args) {
         String str1 = "$13.99";
         str1= str1.replace("$", ""); //1399
         String str2 = "$10.55";
         str2= str2.replace("$", "");//1055

         double sayi1 = Double.parseDouble(str1);
         double sayi2 = Double.parseDouble(str2);
         double toplam = (sayi1 + sayi2);
         System.out.println("$" + toplam);
*/
    }
}
