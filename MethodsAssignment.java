import java.util.Scanner;

public class MethodsAssignment {

    static int addNumbers(int n1, int n2){
        return n1+n2;
    }

    static int subtractNumbers(int n1, int n2){
        return n1-n2;
    }

    static double multiplicationOfDouble(double n1, double n2){
        return n1 * n2;
    }

    static double divisionOfTwoDoubleNumbers(double n1, double n2){
        return n1/n2;
    }

    static boolean isEvenOdd(int number) {
        if(number % 2 == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers for Addition ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(addNumbers(n1, n2));

        System.out.print("Enter two integers for Subtraction ");
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        System.out.println(subtractNumbers(n3, n4));

        System.out.print("Enter two double for Multiplication ");
        double n5 = sc.nextDouble();
        double n6 = sc.nextDouble();
        System.out.println(multiplicationOfDouble(n5, n6));

        System.out.print("Enter two Double for Division ");
        double n7 = sc.nextDouble();
        double n8 = sc.nextDouble();
        System.out.println(divisionOfTwoDoubleNumbers(n5, n6));

        
        System.out.println("Enter number to check whether it is even or odd ");
        int number = sc.nextInt();
        if(isEvenOdd(number)) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}
