import java.util.*;

import javax.sound.midi.SysexMessage;
public class subArraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the values of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the value of k: ");
        int k=sc.nextInt();
        int count=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        if(count==0){
           System.out.print("K not found");
        }
        else{
            System.out.print("K found "+count+" times");
        }
    }   
}
