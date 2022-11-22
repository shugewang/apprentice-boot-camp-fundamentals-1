package cards

class PlayingCard (val suit: Suit, val faceValue: Int): Card() {
    override fun snap(otherCard: Card?): Boolean {
        if (otherCard != null && javaClass == otherCard.javaClass) {
            otherCard as PlayingCard?
            return faceValue == otherCard.faceValue
        }
        return false
    }

    override fun toString(): String {

        val faceValueName: String = when (faceValue) {
            0 -> "ace"
            1, 2, 3, 4, 5, 6, 7, 8, 9 -> (faceValue + 1).toString()
            10 -> "jack"
            11 -> "queen"
            12 -> "king"
            else -> throw IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!")
        }
        return "$faceValueName of ${suit.cardName}"
    }
}