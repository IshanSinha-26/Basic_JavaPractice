import java.util.*;
public class maxGap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.print("enter the value of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int maxGap=0;
        for(int i=1; i<n; i++){
            int gap=arr[i]-arr[i-1];
            maxGap=Math.max(maxGap,gap);
        }
        System.out.print("maximum gap is: "+maxGap);
    }
    
}
