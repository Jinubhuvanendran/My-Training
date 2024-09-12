
package string_pack;
import java.util.Scanner; 

public class Stringpalindrom {
    
	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in); 
	    System.out.println("Enter string");
        
	    String str1 = str.nextLine();  
	    System.out.println("string is: " +str1);
	    StringBuilder str3 = new StringBuilder(str1);
        str3.reverse();
        if (str1.equals(str3.toString())) {
            System.out.println("It is a Palindrome String");
        } else {
            System.out.println("It is not a palindrome String");
        }


	}

}
