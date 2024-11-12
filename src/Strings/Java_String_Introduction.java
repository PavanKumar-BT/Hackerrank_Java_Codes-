package Strings;
/*
Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
 */
import java.io.*;


import java.util.*;
public class Java_String_Introduction {


    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            int c=A.charAt(0);
            int ch=B.charAt(0);
            String str="No";
            if(c>ch)
            {
                str="Yes";
            }

            System.out.println(A.length()+B.length());
            System.out.println(str);


            System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1)    );


        }





}
