import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        System.out.println(longestCommonPrefix(s));
    }
    static String longestCommonPrefix(String[] s) {
        if (s.length == 1) {
            if (s[0] == "") return "";
            else return s[0];
        }

        int minLength = Integer.MAX_VALUE;
        String ex = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() < minLength) {
                minLength = s[i].length();
                ex = s[i];
            }
        }
        int len = 0, ans = Integer.MAX_VALUE;
        char[] exChar = ex.toCharArray();
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s));
        list.remove(ex);

        for (String s1 : list) {
            char[] s1Char = s1.toCharArray();
            for (int i = 0; i < exChar.length; i++) {
                if (s1Char[i] == exChar[i]) len++;
                else break;
            }
            if (len < ans) ans = len;
            len = 0;
        }
        return ex.substring(0, ans);
    }
}

//the best solution
/*
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}*/
