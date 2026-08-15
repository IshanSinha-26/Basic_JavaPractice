import java.util.*;
public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        int result=n;
        
        while(n>0){
            int digit=n%10;
            if(result%digit==0){
                System.out.println(digit+" is a factor of given no.");
            }
            else{
                System.out.println(digit+" is not a factor");
            }
            n=n/10;
        }

    }
}