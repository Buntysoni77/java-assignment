
import java.util.Scanner;

/*2. Create a program that accepts 10 integers from the user, stores them
 in an array, and then prints only the prime numbers in that array.
Implement a separate method to check if a number is prime.*/

public class code_02_primeNumber {
    static void primeNumber(int arr[]){
        for (int num:arr){
            boolean isPrime=true;
            if(num<=1){
                isPrime=false;
            }
            else{
                for(int i=2;i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(num+"is a prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
    }
    
}
