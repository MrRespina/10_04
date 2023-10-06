package Practice;

public class AMain4 {

	public static void main(String[] args) {

		String[] ss = { "ㅋㅋ", "ㅎㅎ", "ㅇㅇ", "^^" };
		String s = null;
		
		for (int i = 0; i < ss.length; i++) {

			s = ss[i];
			System.out.print(s);

		}
		
		System.out.println();
		
		for (String name : ss) {
			System.out.print(name);
		}

	}

}
