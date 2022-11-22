package cards

class AnimalDeck(val deck: ArrayList<AnimalCard?> = arrayListOf()): Deck(deck as ArrayList<Card>) {

    init {
        for (animal in Animal.values()) {
            deck.add(AnimalCard(animal))
            deck.add(AnimalCard(animal))
        }
    }
}