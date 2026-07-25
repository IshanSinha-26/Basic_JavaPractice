import java.util.*;
public class secSmallest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int smallest=arr[0];
        int secondSmallest=Integer.MAX_VALUE;

        if(n<2){
            System.out.println("Array should have at least two elements.");
            return;
        }

        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println("Second smallest value: " + secondSmallest);
    }
}
