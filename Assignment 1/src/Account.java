
public class Account {
    private String owner_name;  
    private int acc_type;  
    private float balance;  
    private String acc_status = "Valid";
    //private Local.date date_created;
    private int pin_code;
    private String city, state; 
    
    public Account(String owner_name, int acc_type)
    {
    	this.owner_name = owner_name;
    	this.acc_type = acc_type;
    }
    
    public void setAddress(String city, String state, int pin_code)
    {
    	this.city = city;
    	this.state = state;
    	this.pin_code = pin_code;
    }
    
    public void deposit(float deposit_amt)
    {
    	this.balance = this.balance + deposit_amt;
    	System.out.println("----------------------------------------");
    	System.out.println(" Balance: " + this.balance);
    	System.out.println("----------------------------------------");
    }
    
    public void withdraw(float withdraw_amt)
    {
    	if(withdraw_amt <= balance)
    	{    	
    		System.out.println("----------------------------------------");
    		this.balance = this.balance - withdraw_amt;
    		System.out.println(" Balance: " + this.balance);
    		System.out.println("----------------------------------------");
    	}
    	else
    	{
    		System.out.println("----------------------------------------");
    		System.out.println(" Insufficient Balance");   		
    		System.out.println("----------------------------------------");
    	}
    }
    
    public void displayAll()
    {
    	System.out.println("----------------------------------------");
    	System.out.println(" Owner Name: " + this.owner_name +"\n Balance: " + this.balance + "\n Account Status: " + this.acc_status);
    	if(acc_type == 0)
    		System.out.println(" Account Type: Savings");
    	else
    		System.out.println(" Account Type: Current");
    	System.out.println(" Your Address: \n City: " + this.city +"\n State: "+ this.state +"\n Pin Code:" + this.pin_code);
    	System.out.println("----------------------------------------");
    }
    
    public void balance()
    {
    	System.out.println("----------------------------------------");
    	System.out.println(" Balance: " + this.balance);
    	System.out.println("----------------------------------------");
    }
}
