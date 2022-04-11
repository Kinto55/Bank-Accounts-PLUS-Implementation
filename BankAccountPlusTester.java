
/**
 * Write a description of class BankAccountPlusTester here.
 *
 * @author (Markintus Morris)
 * @version (5/4/21)
 */
import java.util.Scanner;
public class BankAccountPlusTester
{
     public static void main(String[] args)
    {
        //Create a Scanner object
        Scanner scanner=new Scanner(System.in); 
        //initialize amount
        double amount; 
        //initialize index
        int index=0; 
        //Prompt for an amount to open the account.
        System.out.printf("Enter initial amount of the account:");
        //Assign the input to a new double variable named amount 
        amount=Double.parseDouble(scanner.nextLine()); 
        //Create a BankAccountPlus object using this information.
        BankAccountPlus obj1=new BankAccountPlus(amount); 

        for (int i = 0; i < 3; i++){ //Create a for loop that runs 3 times and inside the loop
            //Prompt the user for an amount to deposit
            System.out.printf("Enter amount to deposit: ");
            //Assign the input to the amount variable
            amount=Double.parseDouble(scanner.nextLine());
            //call the deposit method using the input as your argument
            obj1.deposit(amount); 
        }
        
        while (index<3){  //Create a while loop that runs for 3 times
            //Prompt the user for an amount to withdraw
            System.out.printf("Enter amount to withdraw: ");
            //Assign the input to the amount variable
            amount=Double.parseDouble(scanner.nextLine()); 
            //call withdraw using the given input as your argument
            obj1.withdraw(amount); 
            //increment the index
            index++; 
        }
        
        //Print the number of transactions
        System.out.println("Number of Transactions: "); 
        //get the Number of transactions
        System.out.println(obj1.getTransactionCount()); 
        //Call payFees
        obj1.payFees();
        //Print balance for the account
        System.out.println("Balance: "); 
        //get the Balance
        System.out.println(obj1.getBalance()); 
    }
} 

