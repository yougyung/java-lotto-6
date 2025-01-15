package lotto.view;
import camp.nextstep.edu.missionutils.Console;
import org.mockito.internal.matchers.Any;

public class LottoViewer {

    public static int inputNumber(String message) {
        System.out.println(message);
        return Integer.parseInt(Console.readLine());
    }

    public static String inputString(String message) {
        System.out.println(message);
        return Console.readLine();
    }

    public static void println(Object message) {
        System.out.println(message);
    }

}
