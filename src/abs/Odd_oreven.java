package abs;

import java.util.Scanner;

public class Odd_oreven {

	public static void main(String[] args) {
Scanner num = new Scanner(System.in);

System.out.println("enter the number: ");
int value = num.nextInt();

if (value%2==0) {
	System.out.println("the given value is even");
}
else {
	System.out.println("the given number is odd");
}
	}

}
