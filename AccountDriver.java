import java.util.Scanner;

class AccountDriver
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        Account a1 = new Account(723439999, "Prasanna Kumar", 5000, "kumar@123");

        boolean exit = true;

        while(exit)
        {
			System.out.println("=======================================");
            System.out.println("Enter your Choice \n1.Account Details \n2.Check Balance \n3.Deposit Amount \n4.Withdraw \n5.Change Password \n6.Exit");
            int choice = sc.nextInt();
			System.out.println("=======================================");

            switch(choice)
            {
				case 1:
				{
					 System.out.println("Enter Your Password");
                    String pwd = sc.next();

                    if(pwd.equals(a1.getPassword()))
					{
						System.out.println("=======================================");
						System.out.println("Account Number : " +a1.getAccNumber());
						System.out.println("Account Holder Name : " +a1.getAccHolderName());
					}
					else
					{
						System.out.println("*****Incorrect Password*****");
					}
				}
				break;
				
                case 2:
                {
                    System.out.println("Enter Your Password");
                    String pwd = sc.next();

                    if(pwd.equals(a1.getPassword()))
                    {
                        System.out.println("Fetching The Balance.....");
                        Thread.sleep(3000);
						System.out.println("=======================================");
                        System.out.println("Available Balance: " + a1.getBalance());
                    }
                    else
                    {
                        System.out.println("*****Incorrect Password*****");
                    }
                }
                break;

                case 3:
                {
                    System.out.println("Enter Your Password");
                    String pwd = sc.next();

                    if(pwd.equals(a1.getPassword()))
                    {
                        System.out.println("Enter the Amount for Deposit");
                        double amount = sc.nextDouble();

                        a1.deposit(amount);

                        System.out.println("Amount is Deposited to Your Account Successfully");
                    }
                    else
                    {
                        System.out.println("*****Incorrect Password*****");
                    }
                }
                break;

                case 4:
                {
                    System.out.println("Enter Your Password");
                    String pwd = sc.next();

                    if(pwd.equals(a1.getPassword()))
                    {
                        System.out.println("Enter an Amount For Withdraw");
                        double amount = sc.nextDouble();

                        if(amount <= a1.getBalance())
                        {
                            a1.withdraw(amount);
                            System.out.println("Amount Withdraw Successfully");
                        }
                        else
                        {
                            System.out.println("*****Insufficient Balance*****");
                        }
                    }
                    else
                    {
                        System.out.println("*****Incorrect Password*****");
                    }
                }
                break;

                case 5:
                {
                    System.out.println("Enter Your Password");
                    String pwd = sc.next();

                    if(pwd.equals(a1.getPassword()))
                    {
                        System.out.println("Enter a New Password");
                        String newPwd = sc.next();

                        if(newPwd.equals(a1.getPassword()))
                        {
                            System.out.println("Existing Password cannot be used Again");
                        }
                        else
                        {
                            a1.setPassword(newPwd);
                            System.out.println("Password Changed Successfully");
                        }
                    }
                    else
                    {
                        System.out.println("*****Incorrect Password*****");
                    }
                }
                break;

                case 6:
                {
                    System.out.println("Thank You! Visit Again");
                    exit = false;
                }
                break;

                default:
                {
                    System.out.println("Invalid Choice");
                }
            }
        }
    }
}