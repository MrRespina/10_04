package Practice;

import java.util.Scanner;

public class AMain5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("물건 가격 : ");
		int price = s.nextInt();
		System.out.print("낸 금액 : ");
		int pay = s.nextInt();
		int sum = pay - price;
		System.out.println("=====================");
		System.out.println("물건 가격 : " + price);
		System.out.println("낸 금액 : " + pay);
		System.out.println("거스름돈 : " + sum);
		System.out.println("===== 거스름돈 계산 =====");

		int option = 100000;
		int money[] = new int[8];
		int num[] = new int[8];

		for (int i = 0; i <= 7; i++) {

			if (i % 2 == 0 || i==0) {
				option /= 2;
				if (sum >= option) {
					num[i] = option;
					money[i] = sum / option;
					sum = sum - num[i] * money[i];
					
				}
			} else if (i % 2 !=0) {
				option /= 5;
				if (sum >= option) {
					num[i] = option;
					money[i] = sum / option;
					sum = sum - num[i] * money[i];				

				}

			} else if(sum==0) {
				break;
			}
			
			if(num[i]!=0||money[i]!=0) {
				System.out.println(num[i] + "원 " + money[i] + "개");
			}

		}

		s.close();

	}

}
