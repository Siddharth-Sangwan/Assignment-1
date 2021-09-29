
public class Account {
    private String owner_name;  
    private boolean acc_type;  
    private float balance;  
    private String acc_status;
    //private Local.date date_created;
    private int pin_code;
    private String city, state; 
    
    public Account(String owner_name, boolean acc_type)
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
    	
    }
    
    public void withdraw(float withdraw_amt)
    {
    	
    }
}
