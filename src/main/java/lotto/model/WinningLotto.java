package lotto.model;
import java.util.ArrayList;
import java.util.List;

public class WinningLotto {
    private static int bonusNumber = 0;
    private static List<Integer> winningNumbers= new ArrayList<Integer>();

    public static void setWinningNumbers(List<Integer> numbers) {
            winningNumbers = new ArrayList<>(numbers);
    }

    public static void setBonusNumber(int number) {
            bonusNumber = number;
    }

    public static List<Integer> getWinningNumbers() {
        return winningNumbers;
    }
    public static int getBonusNumber() {
        return bonusNumber;
    }
}
