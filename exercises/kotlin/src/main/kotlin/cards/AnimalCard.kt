package cards

class AnimalCard(private val animal: Animal): Card{


    override fun snap(otherCard: Card?): Boolean {
        otherCard as AnimalCard?
        return (otherCard != null) && animal == otherCard.animal
    }
    override fun toString(): String {
        return animal.toString()
    }
}
