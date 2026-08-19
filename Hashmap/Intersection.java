import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }

        System.out.print("Intersection: ");

        for (int i = 0; i < n2; i++) {
            if (set.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }
    }
}