import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String str = sc.next();
		
		System.out.printf("%.2f\n",a);
		System.out.printf("%.2f\n",b);
		System.out.printf("%s", str);
		
	}
}
