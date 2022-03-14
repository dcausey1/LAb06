import  java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int option;
        double first_op,Second_op,result;

        System.out.println("Enter first operand: ");
        first_op = obj.nextDouble();

        System.out.print("Enter second operand: ");
        Second_op = obj.nextDouble();

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println(" Which operation do you want to perform?");

        //github comment subtraction
        System.out.println(2-5);

        option = obj.nextInt();
        switch (option)
        {
            case 1: result = first_op + Second_op;
                System.out.println("The result of the operation is " + result+ ". Goodbye!");
                break;

            case 2: result = first_op - Second_op;
                System.out.println("The result of the operation is " + result+ ". Goodbye!");
                break;

            case 3: result = first_op * Second_op;
                System.out.println("The result of the operation is " + result+ ". Goodbye!");
                break;

            case 4: result = first_op / Second_op;
                System.out.println("The result of the operation is " + result+ ". Goodbye!");
                break;
            default:System.out.println("Error : Invalid selection! Terminating program. ");





        }



    }
}
