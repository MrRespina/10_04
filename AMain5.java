package Practice;

import java.util.Scanner;

public class AMain5 {

	public static void checkPrice(int sum) {

		check10(check50(check100(check500(check1000(check5000(check10000(check50000(sum))))))));

	}

	public static int check50000(int num) {

		int cnt = 0;
		if (num / 50000 >= 1) {
			for (int i = 1; i <= (int) (num / 50000); i++) {
				cnt++;
			}
			System.out.println("5만원권 : " + cnt + "장");
			num = num - cnt * 50000;
		}

		return num;

	}

	public static int check10000(int num) {

		int cnt = 0;
		if (num / 10000 >= 1) {
			for (int i = 1; i <= (int) (num / 10000); i++) {
				cnt++;
			}
			System.out.println("만원권 : " + cnt + "장");
			num = num - cnt * 10000;
		}

		return num;

	}

	public static int check5000(int num) {

		int cnt = 0;
		if (num / 5000 >= 1) {
			for (int i = 1; i <= (int) (num / 5000); i++) {
				cnt++;
			}
			System.out.println("5천원권 : " + cnt + "장");
			num = num - cnt * 5000;
		}

		return num;

	}

	public static int check1000(int num) {

		int cnt = 0;
		if (num / 1000 >= 1) {
			for (int i = 1; i <= (int) (num / 1000); i++) {
				cnt++;
			}
			System.out.println("천원권 : " + cnt + "장");
			num = num - cnt * 1000;
		}

		return num;

	}

	public static int check500(int num) {

		int cnt = 0;
		if (num / 500 >= 1) {
			for (int i = 1; i <= (int) (num / 500); i++) {
				cnt++;
			}
			System.out.println("500원 : " + cnt + "개");
			num = num - cnt * 500;
		}

		return num;

	}

	public static int check100(int num) {

		int cnt = 0;
		if (num / 100 >= 1) {
			for (int i = 1; i <= (int) (num / 100); i++) {
				cnt++;
			}
			System.out.println("100원 : " + cnt + "개");
			num = num - cnt * 100;
		}

		return num;

	}

	public static int check50(int num) {

		int cnt = 0;
		if (num / 50 >= 1) {
			for (int i = 1; i <= (int) (num / 50); i++) {
				cnt++;
			}
			System.out.println("50원 : " + cnt + "개");
			num = num - cnt * 50;
		}

		return num;

	}

	public static int check10(int num) {

		int cnt = 0;
		if (num / 10 >= 1) {
			for (int i = 1; i <= (int) (num / 10); i++) {
				cnt++;
			}
			System.out.println("10원 : " + cnt + "개");
			num = num - cnt * 10;
		}

		return num;

	}

	public static int getPrice() {

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

		s.close();
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkPrice(getPrice());

	}

}
