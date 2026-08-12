/*import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter the no.: ");
        int n=sc.nextInt();
        System.out.println("Prime numbers upto "+n+" are:");
        for(int i=1; i<=n;i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}*/
import java.util.*;
public class printPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.: ");
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
            boolean prime = true;
            for (int i = 2; i <num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}