import java.util.Random;
import java.util.Scanner;

public class A1113349_0512 {
    public static void main(String[] args) {
        int porkDumplings = 5000;
        int beefDumplings = 3000;
        int vegetableDumplings = 1000;
        int totalCustomers=0;
        Scanner scaneer=new Scanner(System.in);
        System.out.print("請輸入同時光顧的顧客人數：");
        int customers = scaneer.nextInt();
        scaneer.close();
        Random random=new Random();
        totalCustomers += customers;
        System.out.println("光臨的顧客數 ：" + customers);
        for (int i = 1; i <= customers; i++) {
            try {
                Thread.sleep(3000); // 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        int dumplingsToOrder = random.nextInt(21) + 10; // Generate random number of dumplings to order (10-30)
        int dumplingType = random.nextInt(3); // Generate random dumpling type (0-2)
        String dumplingTypeName = "";
        int dumplingCount = 0;
            if (dumplingType == 0 && porkDumplings > 0) {
                dumplingTypeName = "豬肉水餃";
                dumplingCount = Math.min(dumplingsToOrder, porkDumplings);
                porkDumplings -= dumplingCount;
            } else if (dumplingType == 1 && beefDumplings > 0) {
                dumplingTypeName = "牛肉水餃";
                dumplingCount = Math.min(dumplingsToOrder, beefDumplings);
                beefDumplings -= dumplingCount;
            } else if (dumplingType == 2 && vegetableDumplings > 0) {
                dumplingTypeName = "蔬菜水餃";
                dumplingCount = Math.min(dumplingsToOrder, vegetableDumplings);
                vegetableDumplings -= dumplingCount;
            }
        System.out.println("顧客： " + i + " 餐點：" + dumplingCount + " " + dumplingTypeName);
            
        }

        if(porkDumplings>=5000 && beefDumplings >=3000 && vegetableDumplings >=1000){
            System.out.println("今天生意真好水餃賣光了!");
            System.out.println("總來客數為：" + totalCustomers);
        }
    }
}

