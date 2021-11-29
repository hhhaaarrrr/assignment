package datastructure;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		 String userId = "Harshitha";
		 String password = "98456";
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter user name:");
		 String enteredUserId = sc.nextLine();
		 
		 System.out.println("Enter password:");
		 String enteredPass = sc.nextLine();
		 
		 if(userId.equals(enteredUserId)) {
			 
			for (int i = 0; i < 3; i++) {
				
				if(password.equals(enteredPass)) {
					System.out.println();
					System.out.println("Login successfull");
					break;
				} else{
					if(i==2) {
						System.out.println();
						System.out.println("Contact admin");
						break;
					}
					System.out.println("wrong password enter again:");
					enteredPass = sc.nextLine();
				}
			 }
			
		 }else {
			 System.out.println("wrong user name");
		 }
	}
}
