package add_numbers;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args)
    {
        boolean again = false;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("please enter first number");
            int num1 = scanner.nextInt();
            System.out.println("please enter second number");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("Their sum is " + sum);
            System.out.println("Do you want to start over ?");
            again = scanner.nextBoolean();
        }while (again);
    }
}
