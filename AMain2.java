package Practice;

import java.util.Scanner;

public class AMain2 {

	public static int indexSum(int a, int b) {

		int sum = a + b;

		return sum;

	}

	public static int indexSum(int a, int b, int c) {

		int sum = a + b + c;

		return sum;

	}
	
	public static void checkSum() {
		
		int mul=1;
		Scanner s = new Scanner(System.in);
		System.out.print("입력할 정수의 갯수 : ");
		int i = s.nextInt();
		int sum[] = new int[i];
		System.out.println("==========");
		
		for(int j=0;j<i;j++) {
			
			System.out.print("정수를 입력해주세요 : ");
			int b = s.nextInt();
			sum[j] = b;
			mul *= sum[j];
			
		}
		
		System.out.println("모든 정수의 곱 : "+mul);
		
	}
	
	//param 무제한
	public static void checkSum(int... n) {
		
		int mul = 1;
		for(int i = 0 ; i<n.length;i++) {
			mul = mul * n[i];
		}
		System.out.println(mul);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		indexSum(10,20);
		indexSum(1,2,3);
		checkSum(1,2,3,4,5,6,7);
		checkSum();

	}

}
