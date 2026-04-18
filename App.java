// KDV Calculator

// Library
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        double amount;
        double kdvRatio;
        double kdvAmount;
        double kdvResult;

        // Labels for get data from user
        System.out.print("Enter Your Amount:");
        amount = scanner.nextDouble();
        System.out.print("Enter the ratio of KDV:");
        kdvRatio = scanner.nextDouble();

       // Operations
       kdvAmount = amount * (kdvRatio / 100);
       kdvResult = amount + kdvAmount;

       // Opeations fot INT -> DOUBLE
       //double newKdvAmount = (int) kdvAmount;
       //double newKdvResult = (int) kdvResult;

       // Result
 
       System.out.println("---------------------------");
       System.out.printf("The Amount: %.0f\n", amount);
       System.out.printf("The KDV Rate: %.0f%%\n", kdvRatio);
       System.out.printf("The KDV Amount: %.2f\n", kdvAmount);
       System.out.println("---------------------------");

       System.out.printf("NET RESULT: %.2f\n", kdvResult);
       System.out.println("---------------------------");




        scanner.close();
    }
}
