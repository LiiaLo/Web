import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BinaryTest {

    @Test
    fun add() {
        var binary = Binary()
        binary.add(96)
        assertTrue(binary.check(96))
    }

    @Test
    fun delete() {
        var binary = Binary()
        binary.add(96)
        binary.delete(96)
        assertTrue(binary.check(96))
    }
}