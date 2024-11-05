
    import java.util.Scanner;

    public class HelloIntellija {

        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Ask the user to enter the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Ask the user to choose an operation
            System.out.print("Choose an operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Perform the selected operation
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The result of " + num1 + " + " + num2 + " is: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("The result of " + num1 + " - " + num2 + " is: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("The result of " + num1 + " * " + num2 + " is: " + result);
                    break;

                case '/':
                    // Check if the second number is zero to avoid division by zero
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator. Please choose +, -, *, or /.");
                    break;
            }

            // Close the scanner
            scanner.close();
        }
    }
