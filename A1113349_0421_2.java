import java.util.Scanner;

public class A1113349_0421_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入日期 (格式: YYYY/MM/DD 或 MM/DD/YYYY)：");
        String dateStr = input.nextLine();

        String[] dateArr = dateStr.split("/");
        String year, month, day;


        if(dateArr[0].length() == 4){
            year = dateArr[0];
            month = dateArr[1];
            day = dateArr[2]; 
        }
        else if(dateArr[0].length() == 2){
            month = dateArr[0];
            day = dateArr[1];
            year = dateArr[2];
        }
        else{
            System.out.println("日期格式不正確！");
            return;
        }

        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day);
    }
}

