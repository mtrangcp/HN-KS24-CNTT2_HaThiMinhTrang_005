import java.util.Scanner;

public class EX1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine().trim();

        String[] strArr = input.split(" ");
        for( int i  = 0; i< strArr.length; i++ ) {
            String curr = strArr[i];

            String temp  = "";
            for ( int j = curr.length() -1; j >= 0; j-- ) {
                temp += curr.charAt(j);
            }
            strArr[i] = temp;
        }

        String result = String.join(" ", strArr);
        System.out.println(result);
    }
}
