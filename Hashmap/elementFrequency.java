import java.util.*;
public class elementFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the size of first array: ");
        int n=sc.nextInt();

        int[] arr1=new int[n];
        System.out.print("enter the value of first array: ");
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("enter the size of second array: ");
        int m=sc.nextInt();

        int[] arr2=new int[m];
        System.out.print("enter the value of second array: ");
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            int result=arr1[i];
            if(map.containsKey(result)){
                map.put(result,map.get(result)+1);
            }
            else{
                map.put(result,1);
            }
        }
        for(int i=0; i<m; i++){
            int result=arr2[i];
            if(map.containsKey(result)){
                map.put(result,map.get(result)+1);
            }
            else{
                map.put(result,1);
            }
        }
        System.out.println("frequency of every elemnt: ");
        System.out.println(map);
    }
}
