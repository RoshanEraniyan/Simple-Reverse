import java.util.Scanner;

public class SimpleReverse{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        System.out.println(sb);
    }
}