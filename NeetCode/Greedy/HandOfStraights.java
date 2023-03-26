public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        HashMap<Integer, Integer> cardCount = new HashMap();

        for(int card : hand) {
            cardCount.put(card, cardCount.getOrDefault(card, 0)+1);
        }
        Arrays.sort(hand);
        for (int card : hand) {
            if (cardCount.get(card) <= 0) continue;
            for (int i = 1; i < groupSize; i++) {
                int count = cardCount.getOrDefault(card + i, 0);
                if (count > 0) cardCount.put(card + i, count - 1); else return false;
            }
            cardCount.put(card, cardCount.get(card) - 1);
        }

        return true;
    }
}
