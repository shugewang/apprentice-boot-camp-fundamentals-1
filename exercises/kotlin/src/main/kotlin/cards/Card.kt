package cards

 abstract class Card {
    abstract fun snap(otherCard: Card?): Boolean
    abstract override fun toString(): String
}