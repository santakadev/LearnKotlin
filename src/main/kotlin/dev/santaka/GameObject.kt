package dev.santaka

abstract class GameObject(var position: Position) {

    init {
        println("Init block")
    }

    constructor(x: Double, y: Double) : this(Position(x, y)) {
        println("Secondary constructor")
    }

    open fun moveRight(distance: Distance) {
        println("Base moveRight")
        this.position = Position(
            this.position.x + distance.value,
            this.position.y
        )
    }

    fun moveUp(distance: Distance) {
        println("Base moveUp")
        this.position = Position(
            this.position.x,
            this.position.y + distance.value
        )
    }
}