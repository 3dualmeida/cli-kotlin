/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.davidgracia.software.authorizationmanager.cli.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertThat(classUnderTest.greeting).isNotNull()
    }
}