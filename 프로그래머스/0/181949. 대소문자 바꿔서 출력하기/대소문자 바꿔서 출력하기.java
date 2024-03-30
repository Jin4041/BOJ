import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String answer="";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(char c : a.toCharArray()){
            if(Character.isLowerCase(c)) answer+=Character.toUpperCase(c);
            else answer+=Character.toLowerCase(c);
        }
        System.out.print(answer);
    }
}