 package exceptionHandling;

public class CopyOfBankDemo
{
   public static void main(String [] args) throws Exception
   {
      CheckingAccount c = new CheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      
      System.out.println("\nWithdrawing $100...");
      c.withdraw(700.00);
             
    }
}

