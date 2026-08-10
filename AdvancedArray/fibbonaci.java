import java.util.*;
public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number of terms: ");
        int n=sc.nextInt();

        int a=0;
        int b=1;
        int newValue=0;
        for(int i=1; i<=n; i++){
            System.out.print(a);
            newValue=a+b;
            a=b;
            b=newValue;
        }    
    }
}
/*import java.util.*;
public class fibbonaci
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=sc.nextInt();
        if(n==1)
            System.out.println("0");
        else if(n==2)
            System.out.println("0 1");
        else
        {
            int prev=0;
            int next=1;
            System.out.println("0 \n 1");

            for(int i=2;i<n;i++)
            {
                int curr=prev+next;
                System.out.println(curr);
                prev=next;
                next=curr;
            }
        }
    }
}*/