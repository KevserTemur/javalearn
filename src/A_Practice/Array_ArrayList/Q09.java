package A_Practice.Array_ArrayList;

public class Q09 {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        //1.yol
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println( str.replace(" ", "").length()); //58
        //2.yol
        String [] arr = str.replace(" ", "").split("");
        System.out.println(arr.length); //58
        //3.yol
    }
}

