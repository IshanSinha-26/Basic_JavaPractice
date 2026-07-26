import java.util.*;
public class missingValue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int n=m+1;
        int expectedSum= n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<m;i++){
            actualSum+=arr[i];
        }
        int missingValue=expectedSum-actualSum;
        System.out.println("Missing value: "+missingValue);
    }
}