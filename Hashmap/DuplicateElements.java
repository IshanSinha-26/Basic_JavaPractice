import java.util.*;

public class DuplicateElements {

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
        HashSet<Integer> dupli=new HashSet<>();

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < n; i++) {

            if (set.contains(arr[i])) {
                dupli.add(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
        for(int num:dupli){
            System.out.print(num+" ");
        }

        sc.close();
    }
}