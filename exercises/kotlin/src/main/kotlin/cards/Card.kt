package cards

interface Card {
    fun snap(otherCard: Card?): Boolean
    override fun toString(): String
}