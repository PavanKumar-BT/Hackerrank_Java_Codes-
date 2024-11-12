package Strings;
import java.util.Scanner;
/*
Sample Input

madam
Sample Output

Yes
 */
public class Java_String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String str="";
        for(int i=A.length()-1;i>=0;i--)
        {
            str=str+A.charAt(i);

        }
        if(str.equals(A))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }

    }
}
