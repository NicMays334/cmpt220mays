/**
 *	@author Nic Mays
 *	@version problem 11.3
 */

import java.util.Date;
class Account 
{
	private int id;
	private double balance;
	
	//annual interest rate should be a full decimal i.e 4.5% = 0.045
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	Account()
	{
		this.id = 0;
		this.balance = 0;	
	}

	Account(int myId, double myBalance)
	{
		this.id = myId;
		this.balance=myBalance;
	}

	//ID Accessor
	public int getId()
	{
		return(this.id);
	}

	//ID Mutator
	public void setId(int newId)
	{
		this.id=newId;
	}

	//Balance Accessor
	public double getBalance()
	{
		return(this.balance);
	}

	//Balance Mutator
	public void setBalance(double newBalance)
	{
		this.balance=newBalance;
	}

	//Interest Rate Accessor
	public double getAnnualInterestRate()
	{
		return(this.annualInterestRate);
	}

	//Interest Rate Mutator
	public void setAnnualInterestRate(double newInterestRate)
	{
		this.annualInterestRate = newInterestRate;
	}

	//Date Created Accessor
	public Date getDateCreated()
	{
		return(this.dateCreated);
	}

	//returns the monthly interest rate
	public double getMonthlyInterestRate()
	{
		return(this.annualInterestRate/12.0);
	}

	//returns the monthly interest on the account
	public double getMonthlyInterest()
	{
		double value = this.balance;
		value *= this.getMonthlyInterestRate();

		return(value);
	}

	//remove money from balance
	public void withdraw(double amount)
	{
		this.balance-=amount;
	}

	//add money to balance
	public void deposit(double amount)
	{
		this.balance+=amount;
	}	
	
	//prints fields of the Account
	public String toString()
	{
		String s = "Account: #"+this.id;
		s+="\nCurrent Balance: "+this.balance;
		s+="\nAnnual Interest Rate: "+(this.annualInterestRate*100)+"%";
		s+="\nDate Created: "+this.getDateCreated();

		return(s);
	}
}

//CheckingAccount extends Account but has an overdraft limit
class CheckingAccount extends Account
{
	//Overdraft limit should be a negative number
	private double overDraftLimit;

	//no arg constructor
	CheckingAccount()
	{
		super();
		overDraftLimit = 0;
	}
	
	//invokes super
	CheckingAccount(int myId, double myBalance, double limit)
	{
		super(myId,myBalance);
		this.overDraftLimit=limit;
	}

	//accessor method for Over Draft Limit
	public double getOverDraftLimit()
	{
		return(this.overDraftLimit);
	}

	//mutator method for over draft limit
	public void setOverDraftLimit(double limit)
	{
		this.overDraftLimit=limit;
	}

	//allows user to withdraw from balance up to overdraft limit
	@Override
	public void withdraw(double amount)
	{
		if((this.getBalance()-amount)<this.overDraftLimit)
			System.out.println("Cannot Withdraw");
		else
			super.withdraw(amount);
	}

	//returns the fields in a string
	@Override
	public String toString()
	{
		String s = "Checking Account: #"+this.getId();
		s+="\nCurrent Balance: $"+this.getBalance();
		s+="\nAnnual Interest Rate: "+(this.getAnnualInterestRate()*100)+"%";
		s+="\nOver Draft Limit: $"+this.overDraftLimit;
		s+="\nDate Created: "+this.getDateCreated();

		return(s);
	}
}

//SavingsAccount extends Account but cannot be overdrawn
class SavingsAccount extends Account
{
	//no arg Constructor
	SavingsAccount()
	{
		super();
	}
	
	//invokes superclass
	SavingsAccount(int myId, double myBalance)
	{
		super(myId, myBalance);
	}
	
	//allows user to withdraw from balance as long as he doesn't overdraw
	@Override
	public void withdraw(double amount)
	{
		if(this.getBalance()-amount<0)
			System.out.println("Cannot Withdraw");
		else
			super.withdraw(amount);
	}
	
	//returns the fields in a string
	@Override
	public String toString()
	{
		String s = "Savings Account: #"+this.getId();
		s+="\nCurrent Balance: $"+this.getBalance();
		s+="\nAnnual Interest Rate: "+(this.getAnnualInterestRate()*100)+"%";
		s+="\nDate Created: "+this.getDateCreated();
		return(s);
	}
}

public class prob11_3 
{
	public static void main(String[] args) 
	{
		Account account = new Account(100, 3500);
		account.setAnnualInterestRate(.002);
		
		CheckingAccount chAccount = new CheckingAccount(101, 400, -100);
		chAccount.setAnnualInterestRate(.04);
		
		SavingsAccount sAccount = new SavingsAccount(102, 5000000);
		sAccount.setAnnualInterestRate(.0005);
		
		System.out.println(account+"\n\n");
		System.out.println(chAccount+"\n\n");
		System.out.println(sAccount);
	}
}
