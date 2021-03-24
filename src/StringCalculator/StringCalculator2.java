package StringCalculator;
import java.util.Scanner;

public class StringCalculator2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String inputString = scan.next();
		char[] ch = inputString.toCharArray();
		int num = 0;
		for (int i = 0; i < ch.length; i++) {
			num += Integer.parseInt(String.valueOf(ch[i]));
		}
		System.out.println(num);
		scan.close();
		
	}
}
