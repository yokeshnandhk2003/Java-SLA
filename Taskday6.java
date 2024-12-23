package controlstatement;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		Scanner Divisible = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = Divisible.nextInt();
		if(number%2==0 && number%4==0){
			System.out.println(number+"is divisible by both 2 and 4");
		}
		else {
			System.out.println(number+"is not divisible by 2 and 4");
		}
			
		

	}

}
