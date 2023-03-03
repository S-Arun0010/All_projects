package allprojects;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Creditcard implements Cloneable {
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	static Scanner s =  new Scanner(System.in);
	String name;
	String cardnumnber;
	String date;
	public Creditcard(String name,String number,String date)
	{
	    this.name = name;
	    cardnumnber = number;
	    this.date = date;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
     public static String getnumber()
     {    
    	String value;
    	 do
 		{
 			try
 			{
 				print.println("Card Number :");
 				value = s.nextLine();
 				 for(int i=0;i<value.length();i++)
 				 {
 				  if( !((value.charAt(i) >='0') && (value.charAt(i) <='9')) )
 				    {
 					  throw new Exception("Invalid Card Nmber");
 				     }
 				 }
 			   break;
 			}
 			catch(Exception e)
 			{
 				print.println(e);
 			}
 		}while(true);
    	 return value;
     }
     public static String getdate()
     {   
    	 String value;
    	 do
 		{
 			try
 			{  
 				print.println("Expiry date :");
 				value = s.nextLine();
 				for(int i=0;i<value.length();i++)
 				{
 				if(!((value.charAt(i) >='0') && (value.charAt(i) <='9') || (value.charAt(i) <='.')))
 				{
 				throw new Exception("Invalid date");
 				}
 				}
 				break;
 			}
 			catch(Exception e)
 			{
 				print.println(e);
 			}
 		}while(true);
    	 return value;
     }
	
	public static void creditcard()throws CloneNotSupportedException {
		
		Scanner sc =  new Scanner(System.in);
		print.println("Enter the Card details");
		print.println("Card Name :");
		String name = sc.nextLine();
		
	    String number = getnumber();
	    
		String date = getdate();	
		Creditcard a = new Creditcard(name,number,date);
		
		print.println("Enter the Card details");
		print.println("Card Name :");
		String name1 = sc.nextLine();
		
		String number1 =  getnumber();
		
		String date1 =  getdate();
		Creditcard b = new Creditcard(name1,number1,date1);
		
		if((a.cardnumnber).equals(b.cardnumnber))
		{
			print.println("The entered card number is same as original Card:");
		}
		else
		{
			print.println("The entered card number is different"); 
		}
		
		Creditcard c = (Creditcard)a.clone(); 
		print.println("Details of new cloned credit card:");
		print.println("Name :" + c.name );
		print.println("Credit Card Number :" + c.cardnumnber);
		print.println("Expiry Date :" + c.date);
	}
}
