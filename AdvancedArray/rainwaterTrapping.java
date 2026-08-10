import java.util.*;
public class rainwaterTrapping {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter the value of array: ");
        int n=sc.nextInt();
    
        int[] arr= new int[n];
        System.out.print("enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int[] left=new int[n];
        left[0]=arr[0];
        for(int i=1; i<n; i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for(int j=n-2; j>=0; j--){
            right[j]=Math.max(right[j+1],arr[j]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(left[i],right[i]) - arr[i];
        }
        System.out.print("total block of rainwater trapped is : "+sum);
    }
}
