
/*7. Write a program that takes an integer input n and prints a pyramid of
numbers up to n rows, where each row has an increasing count of
numbers.
1
1 2
1 2 3
1 2 3 4*/
import java.util.Scanner;
public class code_07_PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}