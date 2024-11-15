package Java_Introduction;

import java.util.*;

/*Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5 , print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
 */
public class Java_If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N%2==0)
        {
            if (N>=2 && N<=5)
            {
                System.out.println("Not Weird");
            }
            else if (N>=6 && 20>=N)
            {
                System.out.println("Weird");
            }
            else if (N>20)
            {
                System.out.println("Not Weird");
            }
        }
        else
        {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
