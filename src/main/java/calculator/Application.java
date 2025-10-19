package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        // \\n을 실제 개행 문자로 변환
        input = input.replace("\\n", "\n");
    }
}
