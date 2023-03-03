package allprojects;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Creditcard implements Cloneable {
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
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

	
	public static void creditcard()throws CloneNotSupportedException {
		Scanner sc =  new Scanner(System.in);
		print.println("Enter the Card details");
		print.println("Card Name :");
		String name = sc.nextLine();
		String number;
		do
		{
			try
			{
				print.println("Card Number :");
				 number = sc.nextLine();
				 for(int i=0;i<number.length();i++)
				 {
				  if( !((number.charAt(i) >='0') && (number.charAt(i) <='9')) )
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
		 
		String date;
		do
		{
			try
			{  
				print.println("Expiry date :");
				date = sc.nextLine();
				for(int i=0;i<date.length();i++)
				{
				if(!((date.charAt(i) >='0') && (date.charAt(i) <='9') || (date.charAt(i) <='.')))
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
		Creditcard a = new Creditcard(name,number,date);
		print.println("Enter the Card details");
		print.println("Card Name :");
		String name1 = sc.nextLine();
		String number1;
		do
		{
			try
			{
				print.println("Card_Number :");
				 number1 = sc.nextLine();
				 for(int i=0;i<number1.length();i++)
				 {
				  if( !((number1.charAt(i) >='0') && (number1.charAt(i) <='9')) )
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
		 
		String date1;
		do
		{
			try
			{  
				print.println("Expiry date :");
			     date1 = sc.nextLine();
				for(int i=0;i<date1.length();i++)
				{
				if(!((date1.charAt(i) >='0') && (date1.charAt(i) <='9') || (date1.charAt(i) <='.')))
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