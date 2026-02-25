import java.util.Scanner;

public class EX3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for  (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i+1);
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập tổng: ");
        int S = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == S) {
                    System.out.println("Index đầu: " + i);
                    System.out.println("Index cuối: " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Không tồn tại mảng con thỏa mãn");
        }

    }
}
