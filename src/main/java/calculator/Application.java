package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        input = input.replace("\\n", "\n");

        String delimiter = "[,:]";
        String numbers = input;

        if (input.startsWith("//")) {
            int delimiterIndex = input.indexOf("\n");
            delimiter = input.substring(2, delimiterIndex);
            numbers = input.substring(delimiterIndex + 1);
            delimiter = java.util.regex.Pattern.quote(delimiter);
        }

        // 문자열 분리
        String[] tokens = numbers.split(delimiter);
    }
}
