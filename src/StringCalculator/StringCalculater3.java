package StringCalculator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculater3 {
	public static void main(String[] args) {
		String input = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("case1혹은case2:");
		int inputNum = scan.nextInt();
		if(inputNum == 1) {
			input = "//:<<1:2:3:4:5";
			System.out.println(input);
		} else if (inputNum == 2) {
			input = "1,2;3,4,5";
			System.out.println(input);
		}
		Pattern p = Pattern.compile("//(.)<<(.*)");
		Matcher m = p.matcher(input);

		String[] num = {};
		int cal = 0;
		if (input.contains("//:<<")) {
			while (m.find()) {
				num = m.group(2).split(m.group(1));
			}
			cal = case1(num);
		} else {
			num = input.split(",|;");
			for (int i = 0; i < num.length; i++) {
				cal += Integer.parseInt(num[i]);
			}
		}
		System.out.println(cal);
		scan.close();
	}
	
	public static int case1(String[] num) {
		int cal=0;
		for (int i = 0; i < num.length; i++) {
			cal += Integer.parseInt(num[i]);
		}
		return cal;
	}
}
