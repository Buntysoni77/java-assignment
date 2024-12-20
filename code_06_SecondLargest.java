
/*6. Write a program that accepts n integers from the user (where n is also
provided by the user). Store the numbers in an array and write a method
to find and display the second largest number in the array*/
import java.util.*;
public class code_06_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of  array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        int result = secondLargest(arr);
        System.out.println("The second largest element in the array is " + result);
    }

    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num != largest) {
                secondlargest = num;
            }
        }
        return secondlargest;
    }

}
