package cards

class Cards {
    val cards: MutableList<String>
        get() {
            val result = MutableList(52) {""}
            val deck = PlayingCardDeck()

            for ((cardNumber, card) in deck.deck.withIndex()) {
                val faceValueName: String = when (card.faceValue) {
                    0 -> "ace"
                    1, 2, 3, 4, 5, 6, 7, 8, 9 -> (card.faceValue + 1).toString()
                    10 -> "jack"
                    11 -> "queen"
                    12 -> "king"
                    else -> throw IllegalArgumentException("Something went wrong " + card.faceValue + "is not a valid faceValue!")
                }

                result[cardNumber] = "$faceValueName of ${card.suit.cardName}"
            }
            return result
        }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val cards = Cards()
            val deckInOrder = cards.cards
            for (card in deckInOrder) {
                println(card)
            }
        }
    }
}