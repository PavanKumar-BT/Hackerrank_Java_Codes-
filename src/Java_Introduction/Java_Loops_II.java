package Java_Introduction;
import java.util.*;
/*
Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers

 */
public class Java_Loops_II {
       public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                for(int j=0;j<n;j++)
                {
                    int p=(int)Math.pow(2,j);
                    // System.out.print(p);
                    a=a+p*b;
                    System.out.print(a+" ");

                }
                System.out.println();
            }
            in.close();
        }


}
