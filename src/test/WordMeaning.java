package solution_mamun;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMeaning {

	public static void main(String[] args) {
		
	       Scanner in = new Scanner(System.in);

           System.out.println("Enter the word");
           String word = in.nextLine();

           showWords(word, word);
   }

       public static void showWords(String Word1, String Word2) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put(Word1, "\n Meaning1 \n Meaning2");
        hm.put(Word2, "\n Meaning1 \n Meaning2");
        for(Map.Entry m : hm.entrySet()) {
        System.out.println(m.getKey() +" "+m.getValue());
        }
    	   
       }
}
		
		

    



