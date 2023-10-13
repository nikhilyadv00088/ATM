package atms;
import java.util.Scanner;
public class atm_project0 {
	String name;
	String address;
	int acc;
	long mobile;
    long account_no;
    String password;
    int choice;
  	String choice1;
    Scanner sc,b,d,s;
    long new_a;
    String new_p;
    int balance=2000;
    int select;
    int money,available_balance;
			
	        public atm_project0()
	        {
	            
	        	sc=new Scanner(System.in);
	            d=new Scanner(System.in);
	            s=new Scanner(System.in);
	            
	        }

	        
	        public void acc()
	        {
	           	System.out.println("1.you have an account");
	        	System.out.println("2.you dont have any account:");
	     
	        	acc=sc.nextInt();
	        	switch(acc)
	        	{
	        	case 1:
	        		already();
	        		break;
	        	
	        	case 2:
	        		new_account();
	        		new_login();
	        		
	        		break;
	        	default:
	        		System.out.println("plzz enter correct key:");
	        		break;
	        	}
	        }
	        
	        
	        public void already() {
	        	System.out.println("enter the account_no:\t");
				account_no=sc.nextLong();
				  
	                System.out.println("PLZZ enter the password:\t");
	                sc=new Scanner(System.in);
	                password=sc.nextLine();
	                
	                System.out.println("enter name:");
	                name=sc.nextLine();
	                login();
	        }
	        
	        public void login()
	        {
//	        	System.out.println("enter the account_no:\t");
//				account_no=sc.nextLong();
//				  
//	                System.out.println("PLZZ enter the password:\t");
//	                sc=new Scanner(System.in);
//	                password=sc.nextLine();
	        	System.out.println("accont_no is:"+account_no);
	        	System.out.println("password is:"+password);
	        	System.out.println("your name is:"+name);
	        	
	            if(account_no==38478317015l || account_no==97297290480l)
	            {
	            	System.out.println("Welcome :"+name);
	                if(password.equals("Ankit@123") || password.equals("AnkiT@123@"))
	                {
	                    System.out.println(" NAME       :     ANKIT 		");
	                    System.out.println("ACCOUNT     :     SAVING		");
	                    System.out.println(" AGE   		:     22            ");
	                    System.out.println(" MOBILE     :     9996904898    ");
	                    operations();
	                }
	                else 
	                {
	                    System.out.println("plzz enter the correct password");
	                }
	            }
	            else 
	            {
	                System.out.println("plzz enter the correct username:))");
	            }
	        }
	             
	        public void new_account()
	        {
	        	
	        	System.out.println("SO PLZZ CREATE A NEW ACCOUNT:");
	        	
	        	System.out.println("enter the name:");
	        	name=s.nextLine();
	        	
	        	System.out.println("enter your address:");
	        	address=s.nextLine();
	        
	        	System.out.println("your mobile no. is:");
	        	mobile=sc.nextLong();
	        	
	        	System.out.println("plzz enter a account_no:");
	        	account_no=sc.nextLong();
	        	
	        	new_a=account_no;
	        	
	        	System.out.println("plzz enter the password:");
	        	password=s.nextLine();
	        	new_p=password;
	        	
	        	System.out.println("your account is successfully created:");
//	        	new_account_display();
	        	new_login();
	        }
	        
	        
	        public void new_account_display()
	        {
	        	
	        	System.out.println("your name is:"+name);
	        	System.out.println("your account no. is: "+account_no);
	        	System.out.println("your address is:"+address);
	        	System.out.println("your mobile no. is"+mobile);
	        	
	        }
	        
	        public void new_login()
	        {
//	        	b=new Scanner(System.in);
//	        	new_account_display();
//	        	System.out.println("enter the aacount_no");
//	        	account_no=b.nextInt();
//	        	System.out.println("enter the password");
//	        	password=sc.nextLine();
	        	
	        	new_account_display();
	            if(account_no==new_a)
	            {
	            	System.out.println("Welcome "+name);
	                if(password==new_p)
	                {
	                	System.out.println("you are successfully login to ATM ::)  ");
	                	balance=1000;
	                	operations();
	                }
	                else 
	                {
	                    System.out.println("plzz enter the correct password");
	                }
	            }
	            else 
	            {
	                System.out.println("plzz enter the correct username:))");
	            }
	        }
	        
	        
	        public void operations()
	        {
	        	do {
	        	System.out.println("1. check_balance 2. withdraw balance 3. add_balance 4.exit");
	        	select=sc.nextInt();
	        	
	        	switch(select)
	        	{
	        	case 1:
	        		check_balance();
	        		break;
	        	
	        	case 2:
	        		withdraw();
	        		break;
	        		
	        	case 3:
	        		add_money();
	        		break;
	        		
	        	case 4:
	        		choice=5;
	        	}	
	      
	        	System.out.println("      DO you want to continue enter yes/no     ");
	        	choice1=d.nextLine();
	        }while(choice1.equals("yes") || choice1.equals("YES"));
	        	System.out.println("you are exited successfully:");
	        	System.out.println("           THANKYOU FOR USING MY ATM    ::)     ");
	        }
	        
	        public void check_balance()
	        {
	        	System.out.println("your available balance is :"+balance);
	        }
	        public void withdraw() {
				System.out.println("enter the money which you want to withdraw:");
				money=sc.nextInt();
				if(money>balance)
				{
					System.out.println("we are extremely sorry !");
					System.out.println("you dont have enough balance in your accout:");
				}
				else {
					balance=balance-money;
					System.out.println("your available_balance is:"+balance);
				}
				
			}
	        
	        public void add_money()
	        {
	        	System.out.println("enter the amount which you want to add:");
	        	money=sc.nextInt();
	        	
	        	available_balance=balance+money;
	        	
	        	System.out.println("your total money is:"+available_balance);
	        }
	        
	        
	    public static void main(String[] args) {
	        atm_project0 ob=new atm_project0();
	        ob.acc();
	    }
	    
}