package allprojects;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Studenttest {
    public static void studenttest()
    {   
    	
    	PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
    	Scanner sc = new Scanner(System.in);
    	Scanner s = new Scanner(System.in);
        ArrayList<Studentlist> list = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
        	Studentlist a = new Studentlist();
        	list.add(a);       	
        }
        for(int i=0;i<5;i++)
        {
        	
        	String name;
        	int age;
        	double gpa;
        	print.println("Enter the Name Age and CGPA of the Student:");
        	name = s.nextLine();
        	do
        	{    
        		try
        		{   sc = new Scanner(System.in);      		   
        			age = sc.nextInt();       			
        			break;
        		}
        		catch(Exception e)
        		{
        			print.println(e);
        			print.println("Enter Age correctly:");
        		}
        	}while(true);
        	do
        	{    
        		try
        		{   sc = new Scanner(System.in);
        			gpa = sc.nextDouble();
        			break;
        		}
        		catch(Exception e)
        		{
        			print.println(e);
        			print.println("Enter Gpa correctly:");
        		}
        	}while(true);
        	list.get(i).setValue(name, age, gpa);
        }
        for(int i=0;i<list.size();i++)
        {
             print.println("Name : " + list.get(i).getName()+ " " + "|Age : " + list.get(i).getAge() + "|Gpa : " + list.get(i).getGpa());
        } 
        Collections.sort(list,  new Comparator<Studentlist>()
        {
     	       public int compare(Studentlist o1, Studentlist o2) 
     	         {
     	    	  Double obj1 = o1.getGpa();
                  Double obj2 = o2.getGpa();
		            return (obj2.compareTo(obj1));
	             }
        });

        for(int i=0;i<list.size();i++)
        {   
        	print.println("Name : " + list.get(i).getName()+ " " +"|Gpa : "+ list.get(i).getGpa());
        } 
   }
}