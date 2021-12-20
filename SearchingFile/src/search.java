import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class search {

  
	
 static void compare()throws IOException
   {
	   Scanner sc1 = new Scanner(System.in);
	   BufferedReader reader1= new BufferedReader(new FileReader("C:\\Users\\SundeepHarini\\Desktop\\java\\h.txt"));
	   BufferedReader reader2= new BufferedReader(new FileReader("C:\\Users\\SundeepHarini\\Desktop\\java\\w.txt"));
	   String line1=reader1.readLine();
	   String line2=reader2.readLine();
	   Pattern p=Pattern.compile(line1);
	   Matcher m=p.matcher(line2);
	   if(m.matches())
	   {
		   System.out.println("Same content present in the two file");
	   }
	   else
	   {
		   System.out.println("Content are different in the file");
		   
	   }
	   reader1.close();
	   reader2.close();
   }
 public static void brute() throws FileNotFoundException {
     
     Scanner sc1 = new Scanner(System.in);
     System.out.println("Enter the word to be found");
     String word = sc1.next();
     boolean flag = false;
     int count = 0;
     System.out.println("Contents of the line");
 
     Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\SundeepHarini\\Desktop\\java\\h.txt"));
     while(sc2.hasNextLine()) {
        String line = sc2.nextLine();
        System.out.println(line);
        if(line.indexOf(word)!=-1) {
           flag = true;
           count = count+1;
        }
     }
     if(flag) {
        System.out.println("File contains the specified word");
        System.out.println("Number of occurrences is: "+count);
     } else {
        System.out.println("File does not contain the specified word");
     }
  }
          
  public static void regexp()throws IOException
   {
  
	   Scanner sc1 = new Scanner(System.in);
	  
	  BufferedReader reader1= new BufferedReader(new FileReader("C:\\Users\\SundeepHarini\\Desktop\\java\\h.txt"));
	 
	   String line1;
	   String allLines="";
	   while((line1=reader1.readLine())!=null) {
	   allLines+=line1+""; 
	   }
	   reader1.close();

	   System.out.println(allLines);
	
	   System.out.println("Enter the word to be searched");
	   String input=sc1.nextLine();
	   Pattern p=Pattern.compile(input);
	   Matcher m=p.matcher(allLines);
	   int count=0;
	   while(m.find())
	   {
		   count++;
	   }
	   if(count!=0)
	   {
		   System.out.println("Word present in the file" +input +"\n Number of Occurance"+count);  
	   }
	   else
	   {
		   System.out.println("Word not present in the file");
	   }
	     
   }
  		 public static void binarySearch() throws IOException
  	   {
  		   Map m1=new HashMap();
  	   
  		   try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\SundeepHarini\\Desktop\\java\\h.txt"))) {
  		   StringBuilder sb = new StringBuilder();
  		   String line = reader.readLine();
           while (line != null) {
  			     String[] words = line.split(" ");
  			           for (int i = 0; i < words.length; i++) {
  			               if (m1.get(words[i]) == null)
  			               {
  			                   m1.put(words[i], 1);
  			               }
  			               else 
  			               {
  			                   int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
  			                   newValue++;
  			                   m1.put(words[i], newValue);
  			               }
  			           }
  			           sb.append(System.lineSeparator());
  			           line = reader.readLine();
  			       }
  			   }
  			   Map<String, String> sorted = new TreeMap<String, String>(m1);
  			   for (Object key : sorted.keySet()) {
  			       System.out.println("Word: " + key + "\tCounts: " + m1.get(key));
  			   }   
  			   }

}



	  




















