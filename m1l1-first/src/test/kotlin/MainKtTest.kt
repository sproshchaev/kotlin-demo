import kotlin.test.assertEquals
import kotlin.test.Test

class MainKtTest {

    /**
     * Используется Kotlin-овская обертка: @Test и assertEquals из kotlin.test
     */
    @Test
    fun firstTest() {
        assertEquals(4, 2 + 2)
    }

}
