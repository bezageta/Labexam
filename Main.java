import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to be searched:");
        int x = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + x + " appears " + count + " times in the array.");
        } else {
            System.out.println("The number " + x + " is not present in the array.");
        }
    }
}