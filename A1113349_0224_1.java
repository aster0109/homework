import java.util.Scanner;
public class A1113349_0224_1{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int a =scn.nextInt();
		scn.close();
		if(a % 2 == 0){
			System.out.println(a+"是偶數");
		}
		else{
			System.out.println(a+"是奇數");
		}
	}
}