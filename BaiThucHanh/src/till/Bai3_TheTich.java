/**
 * 
 */
package till;
import java.util.Scanner;
/**
 * 
 */
public class Bai3_TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập cạnh của lập phương :");
		int canh= scanner.nextInt();
		double theTich=Math.pow(canh,3);
		System.out.printf("Thể tích khối lập phương là: %f",theTich);
	}

}
