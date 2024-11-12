package Java_Introduction;
import java.util.Scanner;
/*
Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
 */
public class Java_static_initializer_Block {
    public static void main(String[] args) {
    }
    static boolean flag=true;
    static int B,H;
    static
    {
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        sc.nextLine();
        H=sc.nextInt();
        sc.close();

        if(B>0 && H>0)
        {
            System.out.print(B*H);        }
        else
        {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


}
