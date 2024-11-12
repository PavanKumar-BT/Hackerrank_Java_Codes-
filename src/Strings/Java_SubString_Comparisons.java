package Strings;


import java.util.Scanner;
/*Sample Input 0

welcometojava
3
Sample Output 0

ava
wel

 */
public class Java_SubString_Comparisons {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        if (k <= s.length()) {
            String smallestSubstring = s.substring(0, k);
            String largestSubstring = "";

            for (int i = 0; i <= s.length() - k; i++) {
                String substring = s.substring(i, i + k);
                if (substring.compareTo(smallestSubstring) < 0) {
                    smallestSubstring = substring;
                }
                if (substring.compareTo(largestSubstring) > 0) {
                    largestSubstring = substring;
                }
            }

            System.out.println(smallestSubstring + "\n" + largestSubstring);
        } else {
            System.out.println("Substring length cannot be greater than string length");
        }
    }
}
