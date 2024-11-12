package Java_Introduction;

import java.util.Scanner;
/*Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================

 */

public class Java_output_format {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                if(s1.length()<=10)
                {
                    System.out.print(s1);
                    String s2=String.format("%03d",x);
                    for(int j=s1.length();j<15;j++)
                    {
                        System.out.print(" ");
                    }

                    System.out.println(s2);
                }


            }


            System.out.println("================================");

        }

}
