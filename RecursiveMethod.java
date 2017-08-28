/*
Write a recursive method that computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
that prompts the user to enter an integer and displays its sum.
 */

import java.util.Scanner;
public class RecursiveMethod {


    public static int sumDigits(int num) {
        if (num < 10) {
          return num;
        } else {
          return  sumDigits(num / 10) + (num%10);

    }



}
    public static void main(String[] args) {
        int i =1;
        while (i == 1) {

            System.out.println("pick any number");
            Scanner jon = new Scanner(System.in);
            int numb = jon.nextInt();
            System.out.println("the sum of the digits " + numb + " is "+ sumDigits(numb));
            System.out.println("play again? press 1");
            i = jon.nextInt();
        }
    }
}
