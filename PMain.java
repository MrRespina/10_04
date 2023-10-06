package Practice;

import java.util.Scanner;

public class PMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int menu, stuNum, getScore,bestScore = 0,sumScore=0;
		double avgScore=0;
		int[] stu = null;
		boolean swit = true;
		while (swit == true) {
			System.out.print("|1. 학생수 |2. 점수 입력|3. 점수 리스트|4. 분석|5. 종료\n");
			System.out.print("입력 : ");
			menu = s.nextInt();
			switch (menu) {
			case 5:
				System.out.println("종료 완료!");
				swit = false;
				break;
			case 1:
				System.out.print("학생 수 : ");
				stuNum = s.nextInt();
				stu = new int[stuNum];
				break;
			case 2:
				for (int i = 0; i < stu.length; i++) {
					System.out.print("점수 입력 : ");
					getScore = s.nextInt();
					stu[i] = getScore;
				}
				break;
			case 3:
				for (int i = 0; i < stu.length; i++) {
					System.out.println((i + 1) + "번 학생 점수 : " + stu[i] + "점");
				}
				break;
			case 4:
				bestScore=stu[0];
				sumScore=0;
				for (int i = 0; i < stu.length-1; i++) {
					if(bestScore<=stu[i+1]) {
						bestScore=stu[i+1];		
					}
				}
				for(int i = 0;i<stu.length;i++) {
					sumScore = sumScore+stu[i];
				}
				avgScore = sumScore/stu.length;
				System.out.println("최고 점수 : "+bestScore);
				System.out.println("점수 합계 : "+sumScore);
				System.out.println("평균 점수 : "+avgScore);
				break;

			default:
				System.out.println("정확한 숫자를 입력해주세요.(1~5 사이)");
			}
			

		}
		s.close();

	}

}
