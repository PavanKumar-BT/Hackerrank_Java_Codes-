package Java_Introduction;

/*
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between -100 to 100 inclusive.


Sample Input 0

100
Sample Output 0

Good job
 */
import java.util.*;
import java.security.*;
public class Java_Int_To_String {


        public static void main(String[] args) {

            try {
                Scanner in = new Scanner(System.in);
                int n = in .nextInt();
                in.close();
                //String s=???; Complete this line below
                String s=Integer.toString(n);
                //Write your code here


                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer.");
                }
            } catch (Exception e) {
                System.out.println("Unsuccessful Termination!!");
            }
        }


}