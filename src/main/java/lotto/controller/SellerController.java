package lotto.controller;

import lotto.model.LottoResult;
import lotto.model.DrawingMachine;
import lotto.view.LottoViewer;

import java.util.List;

import static lotto.constant.LottoConstant.LOTTO_PRICE;
public class SellerController {
    private static int determineLottoQuantity() {
        int paymentAmount = LottoViewer.inputNumber("총지불액을 입력해줘 가현아");
        return paymentAmount/LOTTO_PRICE;
    }

    private static void drawLottoNumber(int count) {
        List<List<Integer>> drawedNumbers= DrawingMachine.makeLottoNumber(count);
        LottoViewer.println(drawedNumbers);
        LottoResult.addPublishedLottoList(drawedNumbers);
    }

    public static void sellLotto() {
        int lottoAmount = determineLottoQuantity();
        drawLottoNumber(lottoAmount);
    }
}
