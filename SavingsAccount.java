/*
 * Inherit from BankAccount
 * create a new variable double interest in the child class
 * test out all the methods from the parent class
 */
import java.util.Scanner;
public class SavingsAccount extends BankAccount{
	private double interest = 0.075;
	private int wCount = 1;
	private int limit  = 4;
	
	 public static void main(String[] args ) {
		   SavingsAccount acct = new SavingsAccount();
		   Scanner scnr = new Scanner(System.in);
		   double amount = 0.0;

				acct.deposit(10000);
				System.out.println();
				
				//System.out.println(acct);
				
				   System.out.println("What type of transaction would you like to make?");
				   String transaction = scnr.next();
				   
				   if(transaction.equalsIgnoreCase("deposit")) {
					   System.out.println("Please enter the amount you would like to deposit:");
					   amount = scnr.nextDouble();
					   acct.deposit(amount);
					   System.out.println("There is no interest for deposits. Thank you for choosing this bank, and please deposit more money in the future.");
				   }
				   else if(transaction.equalsIgnoreCase("withdrawal")) {
					   System.out.println("Please enter the amount you would like to withdraw:");
					   amount = scnr.nextDouble();
					   acct.withdraw(amount);
				   }	
				   else {
					   System.out.println("Invalid transaction.");
				   }
				   
//				   acct.withdraw(10);
//				   acct.withdraw(10);
//
//				   acct.withdraw(10);
//
//				   acct.withdraw(10);
//
//				   acct.withdraw(10);

			}
			
			@Override
			public void withdraw (double amount) {
				if (wCount < limit) {
					super.withdraw(amount);
					++wCount;
				}else {
					double interestToCharge = amount*interest;
					amount = amount + interestToCharge;
					System.out.println("Interest $"+interestToCharge);
					super.withdraw(amount);
					wCount = 1 ;
				}
				
			}

			@Override
			public String toString() {
				return " Type: Checking, "+ super.toString() + ", interest %" + interest*100; 
			}
		   
		  
}

