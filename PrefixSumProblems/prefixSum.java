import java.util.*;
public class prefixSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] prefix=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        prefix[0]=arr[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println("prefix sum array:");
        for(int j=0;j<n;j++){
            System.out.print(prefix[j]+" ");
        }
    }
}
