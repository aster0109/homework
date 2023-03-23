import java.util.Scanner;

public class A1113349_0317_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //使用者輸入
        System.out.printf("請輸入n：");
        int n = sc.nextInt();
        System.out.printf("請輸入m：");
        int m = sc.nextInt();

        //儲存
        int [][] a = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = (i+1)*(j+1) ;          
            }
        }

        //讀出
        for(int[] row: a){
            for(int ans: row){
                System.out.printf("%3d",ans);
            }
            System.out.println();
        }
    }
}
