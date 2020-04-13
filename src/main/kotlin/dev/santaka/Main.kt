package dev.santaka

fun main() {
//    val go = GameObject(10.0, 30.0)
//    println(go.position)
//    go.moveRight(10.0)
//    println(go.position)

    val character = Character(0.0, 0.0)
    character.moveRight(Distance(10.0))
    character.moveUp(Distance(15.0))
    println(character.position)
}