package Strings;


import java.util.Scanner;
/*Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams


 */


public class Java_Anagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean res = false;
        if (a.length() == b.length()) {
            String st = "";
            String st1 = "";

            for (int i = 0; i < a.length(); i++) {
                st = st + Character.toLowerCase(a.charAt(i));
                st1 = st1 + Character.toLowerCase(b.charAt(i));


            }
            a = st;
            b = st1;
            char temp;
            char[] character = a.toCharArray();
            char[] character1 = b.toCharArray();
            for (int i = 0; i < character.length; i++) {
                for (int j = 0; j < character.length; j++) {
                    if (character[j] > character[i]) {
                        temp = character[i];
                        character[i] = character[j];
                        character[j] = temp;
                    }
                    if (character1[j] > character1[i]) {
                        temp = character1[i];
                        character1[i] = character1[j];
                        character1[j] = temp;
                    }

                }
            }

            String str = "";
            String str1 = "";
            for (int i = 0; i < character1.length; i++) {
                str = str + character1[i];
                str1 = str1 + character[i];

            }
            if (str.equals(str1)) {
                res = true;
            }


        } else {
            res = false;
        }
       System.out.println(res);

    }

}
