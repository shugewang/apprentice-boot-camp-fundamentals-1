package cards

abstract class Deck {
    abstract fun shuffle()

    abstract fun getCards(): MutableList<String>

    abstract fun deal(): Card?

}