package lotto.controller;

import lotto.common.utils.parse;
import lotto.model.LottoResult;
import lotto.model.WinningLotto;
import lotto.view.LottoViewer;

import java.util.List;


public class ResultController {

    private static List<Integer> createWinningNumbers() {
        String winningNumberLine = LottoViewer.inputString("로또 맞고 싶은 숫자 6개를 입력해줘 현진아");
        List<Integer> winningNumbers = parse.splitTextToNumber(winningNumberLine);
        return winningNumbers;
    }

    private static int createBonusNumber() {
        int bonusNumber = LottoViewer.inputNumber("보너스 1개 숫자를 입력해줘 진현아");
        return bonusNumber;
    }

    private static void setWinningLotto() {
        List<Integer> winningNumbers=createWinningNumbers();
        int bonusNumber=createBonusNumber();
        WinningLotto.setWinningNumbers(winningNumbers);
        WinningLotto.setBonusNumber(bonusNumber);
    }

    public static void resultLotto() {
        setWinningLotto();
        LottoResult.getResult();
    }
}
