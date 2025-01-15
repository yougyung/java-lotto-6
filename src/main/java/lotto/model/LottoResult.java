package lotto.model;

import com.sun.tools.jconsole.JConsoleContext;
import lotto.view.LottoViewer;

import java.util.*;

public class LottoResult {
    private static final List<List<Integer>> publishedLottoList = new ArrayList<>();
    private static Map<LottoRank, Integer> resultMap= new HashMap<>();
    private static int countMatchingNumbers(List<Integer> lotto, List<Integer> winningNumbers) {
        int count = 0;
        for (int number : lotto) {
            if (winningNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }
    private static Map<LottoRank, Integer> createResultMap() {
        Map<LottoRank, Integer> resultMap = new LinkedHashMap<>();
        for (LottoRank rank : LottoRank.values()) {
            resultMap.put(rank, 0);
        }
        return resultMap;
    }
    private static LottoRank getLottoRank(int matchCount, boolean bonusMatch) {
        for (LottoRank rank : LottoRank.values()) {
            if (rank.getMatchedCount() == matchCount && rank.isMatchedBonusNumber() == bonusMatch) {
                return rank;
            }
        }
        return null;
    }

    public static void addPublishedLottoList(List<List<Integer>> newLotto){
        publishedLottoList.addAll(newLotto);
    }


    public static void getResult() {
         resultMap = createResultMap();

        List<Integer> winningNumbers = WinningLotto.getWinningNumbers();
        int bonusNumber = WinningLotto.getBonusNumber();

        for (List<Integer> publishedlotto : publishedLottoList) {
            int matchCount = countMatchingNumbers(publishedlotto, winningNumbers);
            boolean bonusMatch = publishedlotto.contains(bonusNumber);

            LottoRank rank = getLottoRank(matchCount, bonusMatch);
            if (rank != null) {
                resultMap.put(rank, resultMap.get(rank) + 1);
            }
        }

        LottoViewer.println("당첨되면 한턱 쏘기 ~");
        for (LottoRank rank : LottoRank.values()) {
            System.out.println(rank.getMatchedCount() + "개 일치 (" + String.format("%,d", rank.getPrizeMoney()) + "원) - " + resultMap.get(rank) + "개");
        }
    }
}

