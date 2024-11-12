package Strings;

import  java.util.Scanner;
/*Sample Input

Helloworld
3 7
Sample Output

lowo

 */
public class Java_SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.print(S.substring(start,end));
    }
}
