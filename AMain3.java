package Practice;

//call by value, call by reference
public class AMain3 {
	
	public static void test(int a,int[] b,int[] c) {
		
		System.out.println("main a : "+a);
		System.out.println("main b : "+b);
		System.out.println("main c : "+c);
		System.out.println("=====================");
		a = 100;
		System.out.println("함수 값 변경 a : "+a);
		b[0] = 100;
		System.out.println("함수 값 변경 b[0] : "+b[0]);
		c = new int[] {100,200};
		System.out.println("함수 값 변경 c[0] : "+c[0]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b[] = { 10, 20 };
		int c[] = { 10, 20 };
		
		System.out.println("main a : "+a);
		System.out.println("main b : "+b[0]);
		System.out.println("main c : "+c);
		System.out.println("=====================");
		
		test(a,b,c);
		System.out.println("main a 값 변경 : "+a);
		System.out.println("main b[0] 값 변경 : "+b[0]);
		System.out.println("main c[0] 값 변경 : "+c[0]);

	}

}
