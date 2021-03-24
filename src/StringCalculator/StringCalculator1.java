package StringCalculator;

import java.util.Scanner;

public class StringCalculator1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String inputString = scan.next();
		String[] input = inputString.split(",|;");
		int num = 0;
		for (int i = 0; i < input.length; i++) {
			num += Integer.parseInt(input[i]);
		}
		System.out.println(num);
		scan.close();
	}
}
