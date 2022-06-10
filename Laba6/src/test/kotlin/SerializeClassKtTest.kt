import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SerializeClassKtTest {

    @Test
    fun parse() {
        assertTrue(parse().equals(AgifyMan("dasha", 30, 5723)))
    }
}