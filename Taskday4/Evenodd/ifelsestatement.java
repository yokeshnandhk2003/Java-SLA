package Evenodd;

import java.util.Scanner;

public class ifelsestatement {
    public static void main(String[] args) {
        Scanner ifelsestatement = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a =ifelsestatement .nextInt();

        if (a%2==0) {
            System.out.println("Your value is even.");
        } else {
            System.out.println("Your value id odd .");
        }
    }
}


	


