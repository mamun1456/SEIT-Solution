package solution_mamun;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

	public class FileExist {
	private static BufferedReader buffer;


	public static void doesFileExist(String path){

		   File file= new File(path);
		   
		   try(FileReader fileReader = new FileReader();
			BufferedReader buffer = new BufferedReader(fileReader))
		   {
		       
			   ArrayList<String>list=new ArrayList<>();

		       for(int i=0;i<2;i++){
		           String name = buffer.readLine();
		           list.add(name);
		       }

		for (String word:list){
		   System.out.println(word);
		}
		   } 
		   catch (IOException e) {
		       e.printStackTrace();
		   }
		}


		   public static void main(String[] args) {

		       doesFileExist("/home/mamun/Desktop/AllProjects/untitled/src/dictionary.txt");
   }
		   /*
		    * another way of getting the boolean value of file exists
		    */
	
//	public static void main(String[] args) {      
//	      File doesFileExist = null;
//	      boolean bool = false;
//	      
//	      try {
//	      
//	         // create new files
//	    	  doesFileExist = new File("dictionay.txt");
//	         
//	         // create new file in the system
//	    	  doesFileExist.createNewFile();
//	         
//	         // tests if file exists
//	         bool = doesFileExist.exists();
//	         
//	         // prints
//	         System.out.println("File exists: "+bool);
//	    
//	      } catch(Exception e) {
//	      
//	         // if any error occurs
//	         e.printStackTrace();
//	      }
//	   }
	}