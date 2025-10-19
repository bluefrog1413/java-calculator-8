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

        String[] tokens = numbers.split(delimiter);
        int sum = 0;

        for (String num : tokens) {
            num = num.trim();
            if (num.isEmpty()) continue;

            if (!num.matches("-?\\d+")) {
                throw new IllegalArgumentException("잘못된 입력: " + num);
            }

            int value = Integer.parseInt(num);
            if (value < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다: " + value);
            }

            sum += value;
        }

        // 결과 출력
        System.out.println("결과 : " + sum);
    }
}
