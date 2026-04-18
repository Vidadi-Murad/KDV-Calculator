// KDV Calculator

// Library
import java.util.Scanner;
import java.util.Locale;


public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        // Variables
        int amount;
        int kdvRatio;
        int kdvAmount;
        int kdvResult;

        // Labels for get data from user
        System.out.print("Enter Your Amount:");
        amount = scanner.nextInt();
        System.out.print("Enter the ratio of KDV:");
        kdvRatio = scanner.nextInt();

       // Operations
       kdvAmount = kdvRatio / 100;
       kdvResult = amount + kdvAmount;

       // Result

       System.out.println("---------------------------");
       System.out.println("---------------------------");





        scanner.close();
    }
}
