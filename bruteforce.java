

import java.util.Scanner;

public class bruteforce{

    private static int base;
    private static int[] occur;
    private static String pattern;
    
    static void setBase(String path){
        base = 256;
        pattern = path;
        
        occur = new int[base];
        for(int i = 0; i < base; i++){
            occur[i] = -1;
        }
        for(int j = 0; j < pattern.length(); j++){
            occur[pattern.charAt(j)] = j;
        }
    }
    
    static int search(String text){
        int n = text.length();
        int m = pattern.length();
        int pass = 0;
        System.out.println(text);
        for(int i = 0; i <= n - m; i+= pass){
            pass = 0;
            for (int j = m-1; j >= 0; j--){
                if(pattern.charAt(j) != text.charAt(i+j)){
                    pass = Math.max(1, j - occur[text.charAt(i+j)]);
                    break;
                }
            }
            displaySubStr(i);
            System.out.println(pattern);
            if(pass == 0)
                return i;
        }
        return n;
    }
    
    static void displaySubStr(int pos){
        for (int k = 0; k < pos; k++){
            System.out.print(" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String txt = input.nextLine();
        System.out.println("Enter substring to search for: ");
        String substr = input.nextLine();
        setBase(substr);
        
        int first_pos = search(txt);
        System.out.println("\nThe substring \"" + substr + "\" is first detected after " + first_pos + " position");
    }
    
}