import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String userName, password, yesOrNO, newPassword;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Kullanýcý adýnýz: ");
		userName= input.next();
		
		System.out.println("Þifreniz: ");
		password= input.next();
		
		if (userName.equals("patika") && !password.equals("java123")) {
		System.out.println("Your password is wrong. Are you going to reset password?");
		String yesOrNo=input.next();

			if (yesOrNo.equals("yes")) {
				System.out.println("Enter your New Password: ");
				newPassword=input.next();
				
				if (newPassword!= "java123") {
					System.out.println("Password has reset.");
				} 
				else {
					System.out.println("You should try a different password than the previous one.");
					}
			}
			else {
				System.out.println("You can't enter the system.");
				}
		}
		else if (userName.equals("patika") && password.equals("java123")) {
		System.out.println("You're Signed In!");
		}
		
		else {
			System.out.println("You can't enter the system.");
		}
}
}
