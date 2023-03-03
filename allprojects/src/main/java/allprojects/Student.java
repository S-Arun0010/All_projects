package allprojects;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Student {
	
    String name;
    char gradelevel;
    double gpa;   
    static PrintStream print = new PrintStream (new FileOutputStream(FileDescriptor.out));
    
    Student(String name, char grade, double gpa) {
        this.name = name;
        this.gradelevel = grade;
        this.gpa = gpa;
    }
    
    public void updategpa(double newgpa) {
       gpa = newgpa;
    	
    }
    
    public String details() {
        return (name + " has a " + gpa + " GPA");
    }
    
    public static void student() {
    	
        Scanner sc = new Scanner(System.in);
        String name;
        char grade;
        double gpa;
        double newgpa;
        print.println("Enter the Student Name:");
        name = sc.nextLine();
        print.println("Enter the Student Grade:");
        grade = sc.next().charAt(0);
        do
        {
        	try
        	{  
        		sc = new Scanner(System.in);
        		print.println("Enter the Student GPA:");
                gpa = sc.nextDouble(); 
                break;
        	}
        	catch(InputMismatchException e)
        	{
        		print.println(e);
        	}
        }while(true);

        Student student = new Student(name, grade, gpa);
        do
        {
        	try
        	{   
        		sc = new Scanner(System.in);
        		print.println("Enter the new GPA :");
                newgpa = sc.nextDouble(); 
                break;
        	}
        	catch(InputMismatchException e)
        	{
        		print.println(e);
        	}
        }while(true);       
        student.updategpa(newgpa);
        String s = student.details();
        print.println(s);  
        
        }
    }