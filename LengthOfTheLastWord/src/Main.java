import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(lengthOfLastWord(line));
    }
    static int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        int sum = 0, i = ch.length - 1;

        while (ch[i] == ' ') {
            i--;
        }
        while (i >= 0 && ch[i] != ' ') {
            sum++;
            i--;
        }
        return sum;
    }
}