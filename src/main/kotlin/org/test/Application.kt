package org.test

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("org.test")
                .mainClass(Application.javaClass)
                .start()
    }
}