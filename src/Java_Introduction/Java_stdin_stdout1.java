package Java_Introduction;

import java.util.Scanner;
/*Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!
Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

 */
public class Java_stdin_stdout1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            double d=sc.nextDouble();
            sc.nextLine();
            String s=sc.nextLine();
            System.out.println("String: "+s);
            System.out.println("Double: "+d);
            System.out.println("Int: "+n);
        }
}
