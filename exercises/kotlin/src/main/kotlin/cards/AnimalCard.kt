package cards

class AnimalCard(private val animal: Animal): Card() {


    override fun snap(otherCard: Card?): Boolean {
        if (otherCard != null && javaClass == otherCard.javaClass) {
            otherCard as AnimalCard?
            return animal == otherCard.animal
        }
        return false
    }
    override fun toString(): String {
        return animal.toString()
    }
}
