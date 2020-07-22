
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();
        String text = scanner.nextLine();
//        checkOverlapping(pattern, text);
        containsPattern(text, pattern);
    }

    public static void containsPattern(String text, String pattern) {
        int count = 0;
        String index = "";
        if ("".equals(pattern)) {
            System.out.println("1" + "\n" + "0");
        } else if (text.length() < pattern.length()) {
            System.out.println(0);
            System.out.println("");
        } else {
            for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
                if (pattern.equals(text.substring(i, i + pattern.length()))) {
                    count++;
                    index = index + " " + i;
                    i = i + pattern.length() - 1;

                }
            }
            System.out.println(count + "\n" + index.trim());
        }

    }
}
