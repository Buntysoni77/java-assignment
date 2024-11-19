
/*1. Wap that takes an integer input from the user and 
calculate the factorial of the number. Then write a method to calculate the sum of the 
digits of this factorial. for example, if the user enters 5,
calculate 5! (120) and then find the sum of its digits(1+2+0=3).

5!=120
sum=1+2+0=3
*/

import java.util.Scanner;

public class code_01_Factorial {
    static int sumOfDigits(int fact) {
        int rem;
         int sum = 0;
        while (fact != 0){
            rem = fact % 10;
            sum =sum+ rem;
            fact = fact / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num=sc.nextInt();

        int fact=1; 
        for(int i=1;i<=num;i++){
            fact=fact*i;

        }
            // System.out.println(fact);
             sumOfDigits(fact);
             System.out.println("factorial of "+num+" is "+fact);
            System.out.println("The sum of digits of " + fact + " is : " + sumOfDigits(fact));
        
    }
}
