package cards

interface Deck {
    fun shuffle()

    fun getCards(): MutableList<String>

    fun deal(): Card?

}