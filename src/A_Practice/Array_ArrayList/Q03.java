package A_Practice.Array_ArrayList;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String str = "HeySiri";
        str= str.replace("hey", "bye");
        System.out.println(str);

        String arr[] =new String[1];
        arr[0] = str;
        System.out.println(Arrays.toString(arr));


        // 2,YOL --->>
        String str1 = "HeySiri";
        String yeniStr [] = str1.split("y");
        System.out.println(Arrays.toString(yeniStr)); //[He, Siri]
        yeniStr[0] = "Bye" ;
        System.out.println(Arrays.toString(yeniStr)); //[Bye, Siri]


        str1 = yeniStr [0] + yeniStr [1];
        System.out.println("str1 = " + str1);

        String arr2 []= new String[1];
        arr2[0] = str1;
        System.out.println(Arrays.toString(arr2));





    }
}
