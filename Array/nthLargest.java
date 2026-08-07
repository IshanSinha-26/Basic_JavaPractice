import java.util.*;
public class nthLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("enter the nth largest value: ");
        int k=sc.nextInt();
        int j=n-k;
        System.out.print("the "+ k+ " largest no. is: "+ arr[j]);
    }
    
}
