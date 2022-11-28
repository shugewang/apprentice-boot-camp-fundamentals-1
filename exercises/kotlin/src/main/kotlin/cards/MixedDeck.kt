package cards

class MixedDeck(animalDeck: AnimalDeck, playingCardDeck: PlayingCardDeck): Deck(
    ((animalDeck.deck + playingCardDeck.deck) as ArrayList<Card>)
) {

}