import java.util.Scanner;

public class isEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int nextNumber = sc.nextInt();
            System.out.print("Enter the next Number: ");
            if(nextNumber == -1) break;
            if(nextNumber % 2 == 0) System.out.println("Even");
            else System.out.println("Odd");
        }
    }
}
