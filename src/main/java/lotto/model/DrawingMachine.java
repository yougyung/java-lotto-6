package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.constant.LottoConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DrawingMachine {
    private static List<Integer> makeRandomNumber() {
        return Randoms.pickUniqueNumbersInRange(LottoConstant.MIN_NUMBER, LottoConstant.MAX_NUMBER, LottoConstant.AMOUNT_WINNING_NUMBER).stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> makeLottoNumber(Integer count) {
        List<List<Integer>> drawedNumbers = new ArrayList<>();
        IntStream.range(0, count)
                .forEach(i -> drawedNumbers.add(makeRandomNumber()));
        return drawedNumbers;
    }
}
