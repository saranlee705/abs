package abs;

import java.util.Scanner;

public class Reverseofnum {

	public static void main(String[] args) {
Scanner number = new Scanner(System.in);
int rev =0;

System.out.println("enter the number:  ");
int value = number.nextInt();

while(value!=0) {
	int remainder = value%10;
	rev=rev*10+remainder;
	value=value/10;
}
System.out.println("the REVERSE OF THE "+value+"is"+rev);

	}

}
