import java.util.*;
public class CalculatorApp{
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
                System.out.println("Result: "+(n1+n2));
                break;
            case '-':
                System.out.println("Result: "+(n1-n2));
                break;
            case '*':
                System.out.println("Result: "+(n1*n2));
                break;
            case '/':
                System.out.println("Result: "+(n1/n2));
                break;
            case '%':
                System.out.println("Result: "+(n1%n2));
                break;
            default :
                System.out.println("Something Went Wrong !");
        }
        sc.close();
    }
}