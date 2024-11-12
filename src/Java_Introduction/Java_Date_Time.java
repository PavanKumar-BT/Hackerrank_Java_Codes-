package Java_Introduction;

/*
Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation
The day on August 5th 2015 was WEDNESDAY.
 */

import java.time.*;
import java.util.Scanner;
public class Java_Date_Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int year=sc.nextInt();
        System.out.println("Enter Month");
        int month=sc.nextInt();
        System.out.println("Enter Day");
        int day=sc.nextInt();
        LocalDate dt=  LocalDate.of(year, month, day);
        System.out.println(dt.getDayOfWeek().toString());


    }
}
