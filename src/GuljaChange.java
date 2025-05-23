import java.util.Scanner;

public class GuljaChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 ↓");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            // "!!"가 나오면 건너뜀
            if (i < input.length() - 1 && input.charAt(i) == '!' && input.charAt(i + 1) == '!') {
                i += 2;
            } else {
                result.append(input.charAt(i));
                i++;
            }
        }

        System.out.println();
        System.out.println("출력 ↓");
        System.out.println(result.toString());
    }
}
