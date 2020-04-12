package dev.santaka

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe

class MyLibraryTest : StringSpec() {

    init {
        "language name should be Kotlin" {
            MyLibrary().kotlinLanguage().name shouldBe "Kotlin"
        }

        "language hotness should be 5" {
            MyLibrary().kotlinLanguage().hotness shouldBe 10
        }
    }

}