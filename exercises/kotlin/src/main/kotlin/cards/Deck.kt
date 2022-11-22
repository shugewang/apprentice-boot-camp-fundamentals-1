package cards

open class Deck(private val deck: ArrayList<Card>){
    fun shuffle() {
        deck.shuffle()
    }

    fun getCards(): MutableList<String> {
        val result = mutableListOf<String>()
        for (i in deck.indices) {
            val deck = deck[i]
            result.add(deck.toString())
        }
        return result
    }

    fun deal(): Card? {
        return deck.removeAt(0)
    }

}