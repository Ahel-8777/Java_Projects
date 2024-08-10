import java.util.Scanner;
class AtmInterface
{
	static void deposit(int addamount)
	{
		int x = 100000 + addamount;
		System.out.println("The Remaining balance is: " +x);	
	}
	
	static void withdraw(int subamount)
	{
		int x = 100000 - subamount;
		System.out.println("The Remaining balance is: " +x);	
	}

	public static void main(String[] args)
	{
		System.out.println("Press 1 for deposit ");
		System.out.println("Press 2 for withdraw ");
		System.out.println("Press 3 to checking the balance ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		switch(x)
		{
			case 1:
				Scanner addbalance = new Scanner(System.in);
				System.out.println("Enter the amount you want to deposit: ");
				int addamount = addbalance.nextInt();
				deposit(addamount);
				break;
			case 2:
				Scanner subbalance = new Scanner(System.in);
				System.out.println("Enter the amount you want to withdraw: ");
				int subamount = subbalance.nextInt();
				withdraw(subamount);
				break;
			case 3:
				System.out.println("The balance is 100000");
				break;
				
			default:
				System.out.println("Invalid Entry");
		}
	}
}