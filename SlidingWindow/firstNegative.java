import java.util.*;
public class firstNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        System.out.print("First negative numbers: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                queue.add(i);
            }
            if (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.remove();
            }
            if (i >= k - 1) {
                if (!queue.isEmpty()) {
                    System.out.print(arr[queue.peek()] + " ");
                }
                else {
                    System.out.print("0 ");
                }
            }
        }

        sc.close();
    }
}

