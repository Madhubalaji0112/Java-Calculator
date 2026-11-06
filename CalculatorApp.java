import java.util.*;
public class CalculatorApp{

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    static double modulus(double a, double b) {
        return a % b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n1:");
        int n1 = sc.nextInt();
        System.out.println("Input n1:");
        int n2 = sc.nextInt();

        System.out.println("Input Operation:");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Result: " + add(n1, n2));
                break;
            case '-':
                System.out.println("Result: "+subtract(n1,n2));
                break;
            case '*':
                System.out.println("Result: "+multiply(n1,n2));
                break;
            case '/':
                System.out.println("Result: "+divide(n1,n2));
                break;
            case '%':
                System.out.println("Result: "+modulus(n1,n2));
                break;
            default :
                System.out.println("Something Went Wrong !");
        }
        sc.close();
    }
}