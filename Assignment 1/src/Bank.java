import java.util.*;

public class Bank {

    

	public static void main(String[] args) {
		
		System.out.println("Account Creation");
		String name,city, state;
		int pin_code;
		boolean acc_type;
		float deposit_amt;
		float withdraw_amt;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = scn.next();
		
		System.out.println("Enter your Address:");
		
		System.out.println("Enter your City:");
		city = scn.next();
		System.out.println("Enter your State:");
		state = scn.next();
		System.out.println("Enter your Pin Code:");
		pin_code = scn.nextInt();
		
		System.out.println("Enter your Account Type:(0---->Savings    1---->Current");
		acc_type = scn.nextBoolean();
		
		Account userAccount = new Account(name,acc_type);
		userAccount.setAddress(city, state, pin_code);
		int choice = 1;
		while(choice !=5) {
			
			System.out.println("Select an option to continue:");
			System.out.println("1. Deposit \n 2. Withdraw \n 3. View Details \n 4. View Balance \n 5. Exit");
			choice = scn.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter amount to be deposited: ");
					deposit_amt = scn.nextInt();
					userAccount.deposit(deposit_amt);
					
				case 2:
					System.out.println("Enter amount to be withdrawn: ");
					deposit_amt = scn.nextInt();
					userAccount.withdraw(withdraw_amt);
				
				case 3:
				
				case 4:
					
				case 5:
					
				default:
				
			
			}
		}
		
		
		
		
		 
	}

}
