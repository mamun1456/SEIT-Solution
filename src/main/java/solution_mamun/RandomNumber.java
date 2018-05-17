package solution_mamun;
import java.util.Random; 

public class RandomNumber {
	
	 public static void main(String[] args) {
     	Random objGenerator = new Random();
         for (int iCount = 0; iCount< 7; iCount++){
           int randomNumber = objGenerator.nextInt(100);
           System.out.println("Random No : " + randomNumber); 
          }
  }


}
