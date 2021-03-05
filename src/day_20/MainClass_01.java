package day_20;

import java.util.Scanner;

public class MainClass_01 {
	public static void main(String[] args) {
		while(true) {
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				DivClass plus = new DivClass();
				System.out.println("더하기! ");
				System.out.print("숫자 두개를 입력해주세요 : ");
				
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				
				int result1 = plus.plus(num1, num2);
				System.out.println("더하기의 결과는 : "+result1);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				DivClass div = new DivClass();
				
				System.out.println("나누기! ");
				System.out.println("나누기 할 두 수를 입력해주세요!");
				
				int nu1 = sc.nextInt();
				int nu2 = sc.nextInt();
				
				int result = div.div(nu1, nu2);
				System.out.println("나눗셈의 결과는 : " +result);
				
				break;
			}
		}
	}
}
