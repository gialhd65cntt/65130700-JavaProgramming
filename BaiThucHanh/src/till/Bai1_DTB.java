/**
 * 
 */
package till;

import java.util.Scanner;

/**
 * 
 */
public class Bai1_DTB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Họ và tên: "); 
		String hoTen = scanner.nextLine(); 
		System.out.print("Điểm TB: "); 
		float diemTB = scanner.nextFloat(); 
		System.out.printf("%s %f điểm",hoTen,diemTB);
	}

}
