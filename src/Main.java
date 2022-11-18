import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        myCalculator();
    }

    private static void myCalculator() {
        while(true) {
            System.out.println("Choose an operator: +, -, *, / or exit press x");
            char operator = input.nextLine().toLowerCase().charAt(0);
            if (operator == 'x') {
                break;
            }

            System.out.print("Enter a number : ");
            double a = input.nextInt();

            System.out.print("Enter b number : ");
            double b = input.nextInt();
            input.nextLine();

            switch (operator) {
                case '*' -> System.out.println(a + " * " + b + " = " + a * b);
                case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
                case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
                case '/' ->{
                    if (b > 0.0) {
                        System.out.println("" + a + " / " + b + " = " + a / b);
                    } else {
                        System.out.println("cannot divided by 0");
                    }
                }
            }
        }
    }
}