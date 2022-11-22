package cards

class MixedDeck(val animalDeck: AnimalDeck, val playingCardDeck: PlayingCardDeck): Deck(
    (((animalDeck.deck as ArrayList<Card> + playingCardDeck.deck as ArrayList<Card>) as ArrayList<Card>))
) {

}