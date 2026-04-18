// KDV Calculator

// Library
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        double amount;
        double kdvAmount = 0;
        double kdvResult = 0;
        double kdvRatio = 18;

        // Labels for get data from user
        System.out.print("Enter Your Amount:");
        amount = scanner.nextDouble();



        // Statesments and Oprations
        if(amount > 0 && amount < 500){
            kdvRatio = 18;
            kdvAmount = amount * (kdvRatio / 100);
            kdvResult = amount + kdvAmount;
        }else if( amount > 500){
            kdvRatio = 8;
            kdvAmount = amount * (kdvRatio / 100);
            kdvResult = amount + kdvAmount;
        }


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
