package solution_mamun;

public class ReverseWordSentence {

		public static void main(String[] arg) {
			
		// creating reversed variable
			String reversed = reverseEverything("hope you are doing well");
			System.out.println(reversed);
		}
		
		// creating recursive method reverseEverything
		private static String reverseEverything(String input) {
			String reversed = "";
			
		// reversing the word and sentence using if else statement	
			if(input.length()==1) {
				return input;
			}else {
				return input.charAt(input.length()-1) + reverseEverything(input.substring(0, input.length()-1));
			}
			
		}
}
