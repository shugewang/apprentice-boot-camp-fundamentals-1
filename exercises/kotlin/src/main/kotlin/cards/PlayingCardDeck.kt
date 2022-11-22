package cards

class PlayingCardDeck(val deck: ArrayList<PlayingCard> = arrayListOf()): Deck(deck as ArrayList<Card>){
    init {
        for (suit in Suit.values()) {
            for (faceValue in 0..12) {
                deck.add(PlayingCard(suit, faceValue))
            }
        }
    }
}