import java.util.Scanner;

public class EX1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần nén: ");
        String str = sc.nextLine();

        String result = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i);
                result += count;
                count = 1;
            }
        }

        if (result.length() >= str.length()) {
            System.out.println("result: " + str);
        }else{
            System.out.println("result: " + result);
        }

    }
}