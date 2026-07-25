import java.util.*;
/*public class secLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Second largest value: " + arr[n-2]);
    }
    
}*/

public class secLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;

        if(n<2){
            System.out.println("Array should have at least two elements.");
            return;
        }

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest value: " + secondLargest);
    }
}
