class Account 
{
	static
	{
		System.out.println("Welcome to Bank");
	}
	
	private long accNumber;
	private String accHolderName;
	private double balance;
	private String password;
	
	Account(long accNumber , String accHolderName , double balance , String password)
	{
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.password = password;
	}
	
	public long getAccNumber()
	{
		return accNumber;
	}
	
	public String getAccHolderName()
	{
		return accHolderName;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount ;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount ;
	}
	
}
