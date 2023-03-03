package allprojects;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Points implements Cloneable {
	private Points()
	{
		
	}
	
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	private int x;
	private int y;
    public Points(int x1,int y1)
    {
    	x=x1;
    	y=y1;
    }
    
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		return (this.x == ((Points) obj). x) && (this.y == ((Points) obj). y); 
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
public static void point()throws CloneNotSupportedException 
 {   
	 
	 int x1;
	 int y1;
	 int x2;
	 int y2;
	 Scanner sc = new Scanner(System.in);
	 do
	 {
		 try
		 {
			 sc = new Scanner(System.in);
			 print.println("Enter the values of point p:");
			 x1=sc.nextInt();
			 y1= sc.nextInt();
			break; 
		 }
		 catch(InputMismatchException e)
		 {
			 print.println(e); 
		 }
	 }while(true);
	 Points p = new Points(x1,y1);
	 do
	 {
		 try
		 {
			 sc = new Scanner(System.in);
			 print.println("Enter the values of point Q :");
	         x2=sc.nextInt();
		     y2= sc.nextInt();
			break; 
		 }
		 catch(InputMismatchException e)
		 {
			 print.println(e);
		 }
	 }while(true);   
	 Points q = new Points(x2,y2);
	 if(p.equals(q))
		 {
		 print.println("Both points are equal");
		 }
	 else
	 {
		 print.println("Both points are not equal");
	 }
	 Points r = (Points)p.clone();
	 print.println("Values of Cloned Objects: " + (r.x) +" " + (r.y));
 }
}
