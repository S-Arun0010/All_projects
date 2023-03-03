package allprojects;
import java.util.InputMismatchException;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
	
	static PrintStream print = new PrintStream (new FileOutputStream(FileDescriptor.out));
	public static int getinput()
	{ 
		int value;
		do
		{
			try
			{  Scanner sc = new Scanner(System.in);
				 value = sc.nextInt();
				break;
			}
			catch(InputMismatchException e )
			{
				print.println(e);
			}
	
		}while(true);
		return value;
	}
			
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException
	{
		
		int projectname=0;
		int option=0;
		print.println("Select  the project in the list:");
				print.println(
				"1.Bank Account " + "\n" +
				"2.Shapes"  + "\n" +
			    "3.Student"  + "\n" +
				"4.DatabaseConnection" + "\n" +
				"5.Points" + "\n" +
				"6.CreditCards" + "\n" +
				"7.Studentlist" + "\n" +
				"8.Calculator" + "\n" +
				"9.ContactList" + "\n" +
				"10.Frequency" + "\n" +
				"11.TicTacToe" + "\n" 		
				);
	
		do
		{
		projectname = getinput();	
		switch(projectname)
		{
		case 1:
			print.println("...................Bank Appilication..................");
			Bank.bank();
			break;
		case 2:
			print.println("...................Shapes Appilication..................");
			Shape.shape();
			break;
		case 3:
			print.println("...................Student Appilication..................");
			Student.student();
			break;
		case 4:
			print.println("...................Database Appilication..................");
			Database.database();
			break;
		case 5:
			print.println("...................Points Appilication..................");
			Points.point();
			break;
		case 6:
			print.println("...................CreditCard Appilication..................");
			Creditcard.creditcard();
			break;
		case 7:
			print.println("...................StudenList Appilication..................");
			Studenttest.studenttest();
			break;
		case 8:
			print.println("...................Simple Calculator Appilication..................");
			Calculator.calculate();
			break;
		case 9:
			print.println("...................Contact List Appilication..................");
			Contact.contact();
			break;
		case 10:
			print.println("...................Frequency of words in File..................");
			Frequency.frequency();
			break;
		case 11:
			print.println("...................Tictactoe Game..................");
			Tictactoe.tictactoe();
			break;
		default:
			print.println("Enter Valid AssignmentName:");
			
		}
		  print.println("Enter 0 to Exit  or 1 to Continue");
		  option =getinput();
		}
		while(option == 1);
	}

}
