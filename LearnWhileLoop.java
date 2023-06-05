package basicJava;

public class LearnWhileLoop {

	public static void main(String[] args) {
		//Find the sum of digits
		int number = 353;
		//Initialize the sum
		int sum = 0;
		//Declare a while loop
        while (number != 0) {
        	//if number!=0 
        	//Extract the last digit in the number using modulus operator
            int last_digit = number % 10;	 /*last_digit = 353 % 10 = 3
            								  *last_digit = 35 % 10 = 5
            								  *last_digit = 3 % 10 = 3
            								 */	
            sum = sum + last_digit;		/*sum = 0 + 3 = 3
            							 *sum = 3 + 5 = 8
            							 *sum = 8 + 3 = 11
            							*/	
            number = number / 10;		/*number = 353 / 10 = 35
            							 *number = 35 / 10 = 3
            							 *number = 3 / 10 = 0	
            							*/
            
            
        }
        System.out.println("Sum of digits: " +sum);
	}

}
