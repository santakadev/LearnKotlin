package dev.santaka

class Character(x: Double, y: Double) : GameObject(x, y) {

    init {
        println("Subclass init block")
    }

    override fun moveRight(distance: Distance) {
        println("Subclass moveRight")
        this.position = Position(
            this.position.x + distance.value,
            this.position.y
        )
    }
}