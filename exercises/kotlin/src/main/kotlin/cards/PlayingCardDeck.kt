package cards

class PlayingCardDeck(val deck: ArrayList<PlayingCard> = arrayListOf()): Deck(){
    init {
        for (suit in Suit.values()) {
            for (faceValue in 0..12) {
                deck.add(PlayingCard(suit, faceValue))
            }
        }
    }

    override fun shuffle() {
        deck.shuffle()
    }

    override fun getCards(): MutableList<String> {
        val result = mutableListOf<String>()
        for (i in deck.indices) {
            val deck = deck[i]
            result.add(deck.toString())
        }
        return result
    }

    override fun deal(): Card? {
        return deck.removeAt(0)
    }
}