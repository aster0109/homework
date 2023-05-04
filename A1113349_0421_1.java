import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1113349_0421_1{
    private static final String EMAIL_REGEX = "^[a-z._%+-]+@[a-z.-]+\\.[a-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入郵件地址：");
        String email = scanner.nextLine().trim();

        if (validateEmail(email)) {
            System.out.println("輸入的郵件地址格式正確");
        } else {
            System.out.println("輸入的郵件地址格式不正確");
        }
    }

    private static boolean validateEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
}
