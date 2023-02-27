import java.util.Scanner;
public class A1113349_0224_2{
	public static void main(String[]args){
	Scanner scn = new Scanner(System.in);
	System.out.println("請輸入一個攝氏溫度");
	int a =scn.nextInt();
	scn.close();
	a = (a-32)*5/9;
	System.out.println("華氏溫度為");
	System.out.println(+a);
	}
}