package phone_bill_calculator;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBillCal {
    static Scanner scanner = new Scanner(System.in);
    static double chargeForEveryOverageMinute = 0.25;
    static double tax = 0.15;
    public static void main(String[] args)
    {
      double plan =  enterPlanFee();
      int overage = enterNumOfMinutes();
      double overageCost = calculateoverageFee(overage);
      double taxCost = calculateTaxFee(plan);
        calculateTotalBill(plan,overageCost,taxCost);
    }
    public static double enterPlanFee()
    {
        System.out.println("please enter your plan fee ");
        double planFee =scanner.nextDouble();
        return planFee;
    }

    /**
     *
     * @return
     */
    public static int enterNumOfMinutes()
    {
        System.out.println("please enter Num Of overage Minutes ");
        int NumOfMinutes =scanner.nextInt();
        return NumOfMinutes;
    }
    public static double calculateoverageFee(int numOfMinutes)
    {
        double overageFee = numOfMinutes* chargeForEveryOverageMinute;
        return overageFee;
    }
    public static double calculateTaxFee(double planCost)
    {
        double totalTax = planCost* tax;
        return totalTax;
    }
    public static void calculateTotalBill(double planCost, double overageFee, double taxFee){
        double totalBill = planCost + overageFee + taxFee;
        System.out.println("Your phone bill statement : \n plan : $ " + planCost + " \n overage :$ " + overageFee + "\n Tax : $" +taxFee + "\n Total : $" +totalBill );
    }

}
