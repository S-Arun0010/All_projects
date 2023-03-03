package allprojects;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Frequency {
        
	 private Frequency()
     {
    	 
     }
	public static void frequency()throws IOException 
	{
	  PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
      File filenew = new File("\\Users\\Arun Prabhu S\\Desktop\\story.txt");
      HashMap<String,Integer> hs = new HashMap<>();
      LinkedHashMap<String, Integer> sortedmap = new LinkedHashMap<>();
      ArrayList<Integer> list = new ArrayList<>();
      Scanner scan = new Scanner(filenew);
      String word;
      while(scan.hasNext())
      {
    	  word = scan.next();
    	  if(hs.containsKey(word))
    	  {
    		  int count = hs.get(word) + 1;
    		  hs.put(word,count);
    	  }
    	  else
    	  {
    		  hs.put(word, 1);
    	  }
      }
      scan.close();
      for (Entry<String, Integer> entry : hs.entrySet()) {
          list.add(entry.getValue());  
      }
      
      Collections.sort(list);
      
      for (int num : list) {
          for (Entry<String, Integer> entry : hs.entrySet()) {
              if (entry.getValue().equals(num)) {
                  sortedmap.put(entry.getKey(), num);
              }
          }
      }
      for(Map.Entry<String,Integer> entry : sortedmap.entrySet() ){
    	   print.println(entry);
    	}
	}
}
