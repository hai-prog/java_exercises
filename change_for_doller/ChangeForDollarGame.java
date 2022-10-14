package change_for_doller;

import java.util.Scanner;

public class ChangeForDollarGame {
    public static void main(String[] args) {
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter How many NumOfPennies you have");
        int NumOfPennies = scanner.nextInt();
        System.out.println("Enter How many Nickels you have");
        int NumOfNickels = scanner.nextInt();
        System.out.println("Enter How many NumOfDimes you have");
        int NumOfDimes = scanner.nextInt();
        System.out.println("Enter How many Quarters you have");
        int NumOfQuarters = scanner.nextInt();
        double sum = penny*NumOfPennies + dime*NumOfDimes + nickel*NumOfNickels + quarter*NumOfQuarters;
        if(sum==dollar)
        System.out.println("Congrats! You have win");
        else if (sum>dollar) {
            double positiveDiff = sum - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", positiveDiff) + " cents.");
        }
        else if (sum<dollar) {
            double NegativeDiff = sum - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", NegativeDiff) + " cents.");
        }

    }

}