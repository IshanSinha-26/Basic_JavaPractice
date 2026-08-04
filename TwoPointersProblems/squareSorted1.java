import java.util.*;
public class squareSorted1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int[] result=new int[n];

        for(int i=0; i<n; i++){
            result[i]= arr[i] * arr[i];
        }
        Arrays.sort(result);
        System.out.print("Sorted square array: ");
        for(int j=0; j<n; j++){
            System.out.print(result[j]+" ");
        }
        
    }
}
