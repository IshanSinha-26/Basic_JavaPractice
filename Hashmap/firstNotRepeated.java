import java.util.*;
public class firstNotRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                duplicate.add(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (!duplicate.contains(arr[i])) {
                System.out.println("First non-repeated element: " + arr[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No non-repeated element");
        }
    }
}