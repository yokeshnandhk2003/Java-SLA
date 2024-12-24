package Task;
import java.util.Scanner;
public class MultipleTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter a number between 1 and 10");
			choice=scanner.nextInt();
		}while(choice < 1 || choice > 10 );
		System.out.println("Multiplication table "+ choice +":");
		for(int i =1;i>=1;i++){
		System.out.println(choice + " x " + i + " = " + (choice * i));
		}
		

	}
    
}
