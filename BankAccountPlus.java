
/**
 * Write a description of class BankAccountPlus here.
 *
 * @author (Markintus Morris)
 * @version (5/2/21)
 */
public class BankAccountPlus
{
    //Instance variables
    private double balance;
    private int transactionCount;
    private String accountName;

    /**
     * default constructor - constructs a BankAccount with 0 balance and 0 transactions
     */
    public BankAccountPlus()
    {
        balance=0;
        transactionCount = 0;
    }
    
     /**
     * Constructs a bank account with the given balance
     * @param initialBalance the initial balance
     */
    public BankAccountPlus(double initialBalance)
    {
        balance=initialBalance;
    }
    
    /**
     * This method will return the Account Name
     */
    public String getAccountName()
    {
        return accountName;
    }
    
    /**
     * 
     *This method will charge a monthly fee for using the account
     */
    public void payFees()
    {
        //if the balance is less than or equal to $2000
        if( balance <= 2000)
        {
            withdraw(10); //Deduct ten dollars by calling the withdraw method
        }
        //if the balance is greater than $2,000 and less than $20,000
        else if (balance > 2000 && balance < 20000)
        {
            //Deduct five dollars by calling the withdraw method
            withdraw(5); 
        }
        else if (transactionCount > 25) //if transactionCount > 25
        {
            //Deduct 2 dollars by calling the withdraw method
            withdraw(2);
        }
    }
    
    /**
     * Deposits money into the bank account
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        //balance = balance + amount
        balance+=amount;
        
        //Change the deposit to increment transactionCount by 1
        transactionCount+=1; 
    }
    
    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        // balance = balance-amount
        balance-=amount; 
        
        //Change the withdraw method to increment transactionCount by 1
        transactionCount+=1; 
    }
    
    /**
     * Create a new method called getTransactionCount
     */
    public int getTransactionCount() //Method should return an integer and should not have any parameters
    {
        //Method should return transactionCount
        return transactionCount; 
    }
    
    /**
     * Gets the current balance of the bank account.
     * @retun the current balance
     */
    public double getBalance()
    {
        return balance;
    }
}

