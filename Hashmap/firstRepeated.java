import java.util.*;
public class firstRepeated {
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
        boolean repeated = false;

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                System.out.println("First repeated element: " + arr[i]);
                repeated = true;
                break;
            }
            else {
                set.add(arr[i]);
            }
        }
        if (repeated == false) {
            System.out.println("No repeated element");
        }
    }
}