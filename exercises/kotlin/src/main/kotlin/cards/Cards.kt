package cards

class PlayingCard (val suit: Int, val faceValue: Int) {
}

class Cards {
    val cards: MutableList<String>
        get() {
            val result = MutableList(52) {""}
            val deck = Array<PlayingCard?>(52) {null}
            for (suit in 0..3) {
                for (faceValue in 0..12) {
                    deck[suit * 13 + faceValue] = PlayingCard(suit, faceValue)
                }
            }
            for ((cardNumber, card) in deck.withIndex()) {
                val faceValueName: String = when (card?.faceValue) {
                    0 -> "ace"
                    1, 2, 3, 4, 5, 6, 7, 8, 9 -> (card.faceValue + 1).toString()
                    10 -> "jack"
                    11 -> "queen"
                    12 -> "king"
                    else -> throw IllegalArgumentException("Something went wrong " + card?.faceValue + "is not a valid faceValue!")
                }
                val suitName: String = when (card.suit) {
                    0 -> "clubs"
                    1 -> "diamonds"
                    2 -> "hearts"
                    3 -> "spades"
                    else -> throw IllegalArgumentException("Something went wrong " + card.suit + "is not a valid suitName!")
                }
                result[cardNumber] = "$faceValueName of $suitName"
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