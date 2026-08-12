import java.util.*;
public class commAlphaFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count1[ch - 'a']++;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count2[ch - 'a']++;
            }
        }
        System.out.println("Common alphabets and their frequency:");
        for (int i = 0; i < 26; i++) {
            if (count1[i] > 0 && count2[i] > 0) {
                int common = Math.min(count1[i], count2[i]);
                char ch = (char)(i + 'a');
                System.out.println(ch + " = " + common);
            }
        }
        sc.close();
    }
}