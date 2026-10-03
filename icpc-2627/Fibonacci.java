import java.util.Scanner;
 
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long firstFibonacci = 1;
        long secondFibonacci = 1;
        int index = 2;
 
        if (number == 1) {
            System.out.println(1);
            return;
        }
 
        while (secondFibonacci < number) {
            long sumFibonacci = firstFibonacci + secondFibonacci;
            firstFibonacci = secondFibonacci;
            secondFibonacci = sumFibonacci;
            index++;
        }
 
        if (secondFibonacci == number) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}
