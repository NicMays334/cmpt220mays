/**
 * 	@author Nic Mays	
 *	@version problem 9.5
 */

import java.util.Date;
public class Account 
{
	private int id;
	private double balance;
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
		value *= this.getMonthlyInterest();
		
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
}
