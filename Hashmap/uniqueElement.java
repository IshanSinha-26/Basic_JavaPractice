import java.util.*;
public class uniqueElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        System.out.print("Unique element: "+set);
    }
}
//LinkedHashSet for print in the order array is input