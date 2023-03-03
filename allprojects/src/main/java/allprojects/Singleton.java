package allprojects;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Singleton {
    
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	private static Singleton instance = null;
	private Singleton()
	{
		print.println("An single object reference is created");
	}
	 public static Singleton getInstance()
	    {
	        if (instance == null)
	            instance = new Singleton();
	        
	        return instance;
	    }
}
