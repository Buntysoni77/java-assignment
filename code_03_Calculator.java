
/*3. Build a menu-driven calculator that performs addition, subtraction,
multiplication, or division based on the user's choice. Use if-else
statements to determine the operation.
Keep prompting the user to perform another operation until they choose
to exit.*/

import java.util.Scanner;
public class code_03_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean istrue = true;
        while (istrue){
            System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
            System.out.print("Choose an Operation to be performed : ");
            int choice = sc.nextInt();
           
            System.out.print("Enter the first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number : ");
            int num2 = sc.nextInt();
            if (choice == 1){
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            }
            else if (choice == 2) {
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            }
            else if (choice == 3){
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
            }
            else if (choice == 4){
                if(num2 == 0){
                    System.out.println("Error : Division by zero is not possible");
                }
                else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }
            }
            else{
                System.out.println("Invalid choice!");
            }
            if (choice == 5){
                istrue = false;  
                System.out.println("Exit!");
                break;
            }
        }
    }
}
