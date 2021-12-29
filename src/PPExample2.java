
public class PPExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 8;
		int res1 = ++x + 10;
		int res2 = y++ + 10;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		int z = ++x + y++;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
		System.out.println("result1 : " + res1);
		System.out.println("result2 : " + res2);
	}

}
