import java.util.*;
public class printDuplicate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter the sentence: ");
        String str=sc.nextLine();

        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println("duplicates letters are:");
        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                System.out.println(ch+" ");
            }
        }
    }
}