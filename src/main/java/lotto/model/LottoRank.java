package lotto.model;
public enum LottoRank {
        FIFTH(3, false, 5000),
        FOURTH(4, false, 50000),
        THIRD(5, false, 1500000),
        SECOND(5, true, 30000000),
        FIRST(6, false, 2000000000);

        private final int matchingCount;
        private final boolean matchedBonusNumber;
        private final int prizeMoney;

        LottoRank(int matchingCount, boolean matchedBonusNumber, int prizeMoney) {
            this.matchingCount = matchingCount;
            this.matchedBonusNumber = matchedBonusNumber;
            this.prizeMoney = prizeMoney;
        }

        public int getMatchedCount() {
            return matchingCount;
        }

        public boolean isMatchedBonusNumber() {
            return matchedBonusNumber;
        }

        public int getPrizeMoney() {
            return prizeMoney;
        }
}
