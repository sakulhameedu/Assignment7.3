
package Session7;
//import scanner
import java.util.Scanner;
//define class

public class Subfind {
	// main method
	public static void main(String[] args) {
		// counter initializing to 0
		int flag = 0;
		// user entering the string in s
		System.out.println("Enter the string");
		Scanner o = new Scanner(System.in);
		String s = o.nextLine();
		// user entering sub string to check in s1
		System.out.println("Enter the sub string you want to find");

		String s1 = o.nextLine();
		// outer loop
		for (int i = 0; i < s.length(); i++) {
			// inner loop
			for (int j = 0; j < s1.length(); j++) {
				// matching character at specified index
				if (s.charAt(i + j) == s1.charAt(j)) {
					// match till sub string size
					if (j == s1.length() - 1) {

						System.out.println("String found");
						// increase counter if condition matched
						flag++;

						break;
					}
				} else {

					break;
				}
			}
		}
		// if counter remains zero above condition not matched so print not
		// found
		if (flag == 0)
			System.out.println("String not found");

	}
}


--------------------------
Sample output:
sh-4.3$ javac Subfind.java                                                                                                                                                      
sh-4.3$ java Subfind                                                                                                                                                            
Enter the string                                                                                                                                                                
shahulhameedu                                                                                                                                                                   
Enter the sub string you want to find                                                                                                                                           
hul                                                                                                                                                                             
String found 
