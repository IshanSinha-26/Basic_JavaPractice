import java.util.*;
public class letterRepeat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the string: ");
        String str=sc.nextLine();

        int[]count=new int[26];
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                count[ch-'a']++;
            }
        }
        System.out.println("letter repeated in this string: ");
        for(int i=0;i<26;i++){
            if(count[i]>0){
                int repeat=count[i];
                char ch=(char)(i+'a');
                System.out.println(ch+"="+repeat);
            }
        }
        sc.close();
    }
}
