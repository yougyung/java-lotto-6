package lotto;

import static lotto.controller.SellerController.sellLotto;
import static lotto.controller.ResultController.resultLotto;

public class Application {
    public static void main(String[] args) {
        sellLotto();
        resultLotto();
    }
}
