package day_20;

import java.util.Scanner;

public class MainClass_01 {
	public static void main(String[] args) {
		while(true) {
			System.out.println("1.���ϱ� 2.���� 3.���ϱ� 4.������");
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				DivClass plus = new DivClass();
				System.out.println("���ϱ�! ");
				System.out.print("���� �ΰ��� �Է����ּ��� : ");
				
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				
				int result1 = plus.plus(num1, num2);
				System.out.println("���ϱ��� ����� : "+result1);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				DivClass div = new DivClass();
				
				System.out.println("������! ");
				System.out.println("������ �� �� ���� �Է����ּ���!");
				
				int nu1 = sc.nextInt();
				int nu2 = sc.nextInt();
				
				int result = div.div(nu1, nu2);
				System.out.println("�������� ����� : " +result);
				
				break;
			}
		}
	}
}
