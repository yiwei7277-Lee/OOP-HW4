
package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String password= null;
		Scanner scanner = new Scanner(System.in);
		PasswordEncorder pass1 = new PasswordEncorder();
		do{
		System.out.print("Please enter a password: ") ;
		password = scanner.next();
		if (password.equals("exit"))
		{break;}
		System.out.println(pass1.change(password));
		}while(true);
		scanner.close();
	}	
}
