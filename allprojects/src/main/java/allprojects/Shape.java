package allprojects;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Shape
{
	private Shape ()
	{
		
	}
	
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));

	String type;
    int length;
    int width;
    int height;
    int radius;
    String[] shapes = {"circle","rectangle","triangle"};
    public Shape(String shape,int radius) {
    	type = shape;
        this.radius = radius;
        
    }
    public Shape(String shape,int length, int width) {
    	type = shape;
        this.length = length;
        this.width = width; 
       
    }
    public Shape(String shape,int side, int base, int height) {
    	type = shape;
    	length = side;
    	width = base;
    	this.height = height;
    }

    double perimeter()
    {
    	
    	if(type.equals(shapes[0]))
    	{
    		return (2 * 3.14 * radius);
    	}
    	else if(type.equals(shapes[1]))
    	{
    		return 2 * ((double)length + width);
    	}
    	else
    	{
    		return (length + width + height);
    	}
    }
    
    double area()
    {   
    	if(type.equals(shapes[0]))
    	{
    		return (3.14 * radius * radius);
    	}
    	else if(type.equals(shapes[1]))
    	{
    		 return (double)length * width;
    	}
    	else
    		return (0.5 * width * height);
    }
    public static int getinput()
    {  
    	int value=0;
    	do
    	{   
    		try
    		{
    		  Scanner sc = new Scanner(System.in);
    	      //print.println("Enter the radius :");
             value = sc.nextInt();
               break;
    		}
    		catch(InputMismatchException e)
    		{
    			print.println(e);
    		}
    		
    	}while(true);
    	return value;
    }
    
    public static void shape()
    {
        Scanner sc ;
        Scanner s = new Scanner(System.in);
        
        int check=0;
        do
        {
        	print.println("Enter the Shape:");
            String shape = s.nextLine();
        switch (shape) {
        
            case "circle":
            	int radius;
            	      print.println("Enter the radius :");
                     radius = getinput();
                Shape circle = new Shape(shape,radius);
                print.println("Perimeter of Circle :" + circle.perimeter());
                print.println("Area of Circle :" + circle.area());
                break;
                
            case "rectangle":
            	int length;
            	int width;
            			print.println("Enter the length and width :");
                        length = getinput();
                        width = getinput(); 
                Shape rectangle = new Shape(shape,length, width);
                print.println("Perimeter of rectangle :" + rectangle.perimeter());
                print.println("Area of rectangle :" + rectangle.area());
                break;
                
            case "triangle":   
            	int  side;
            	int  base;
            	int  height;
            			print.println("Enter the three sides of the traiangle:");
                        side = getinput();
                        base = getinput();
                        height = getinput();
                Shape triangle = new Shape(shape,side, base, height);
                print.println("Perimeter of Triangle : " +triangle.perimeter());
                print.println("Area of Triangle :" + triangle.area());
                break;
                
            default:            	
            	print.println("Enter the valid shape :");
                break;
        }
        print.println("Enter 0 to exit or 1 to continue");
        check = getinput(); 
        }while(check == 1);
    }
}
