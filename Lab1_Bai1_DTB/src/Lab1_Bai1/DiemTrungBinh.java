/**
 * 
 */
package Lab1_Bai1;

import java.util.Scanner;

/**
 * 
 */
public class DiemTrungBinh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen=scanner.nextLine();
		System.out.print("Điểm Trung Bình: ");
		float diemTB=scanner.nextFloat();
		System.out.printf("%s %f điểm",hoTen,diemTB);
		
	}

}
