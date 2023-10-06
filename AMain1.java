package Practice;

public class AMain1 {
	
	public static void main(String[] args) {
		
		int[] eng = new int[3];
		eng[0] = 100;
		eng[1] = 50;
		eng[2] = 30;
		
		System.out.println(eng);
		System.out.println("==========");
		
		for(int i=0;i<eng.length;i++) {
			
			System.out.println(eng[i]);
			
		}
		
		System.out.println("==========");
		
		int math[] = new int[] {10,30,21};
		
		for(int i=0;i<math.length;i++) {

			System.out.println(math[i]);
			
		}
		
		System.out.println("==========");
		
		int[] kor = {10,20,30};
		
		for(int i=0;i<kor.length;i++) {
			
			System.out.println(kor[i]);
			
		}
		
		System.out.println("==========");
		
		int[][] score = {{50,30},{100,60},{70,50}};
		
		System.out.println(score);
		System.out.println(score[1]);
		System.out.println(score[1][0]);
		
	}

}
