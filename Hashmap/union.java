import java.util.*;
public class union {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("enter first array elements:");
        for (int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];
        System.out.println("enter second array elements:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++){
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++){
            set.add(arr2[i]);
        }
        System.out.println("union: "+set);
    }
}