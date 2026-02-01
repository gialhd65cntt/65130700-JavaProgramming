/**
 * 
 */
package till;
import java.util.Scanner;
/**
 * 
 */
public class Bai4_Delta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			System.out.print("Nhập a: ");
			double a=scanner.nextDouble(); 
			System.out.print("Nhập b: ");
			double b=scanner.nextDouble(); 
			System.out.print("Nhập c: ");
			double c=scanner.nextDouble(); 
			double delta=Math.pow(b,2)-4*a*c;
			double SqrtDelta=Math.sqrt(delta);
			System.out.printf("Delta: %f, căn bậc 2 của delta: %f",delta,SqrtDelta);
	}

}
