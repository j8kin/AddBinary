import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private val solution = Solution()
    @Test
    fun addBinary0() {
        assertEquals("", solution.addBinary("",""))
    }
    @Test
    fun addBinary1() {
        assertEquals("10", solution.addBinary("10",""))
    }
    @Test
    fun addBinary2() {
        assertEquals("10", solution.addBinary("","10"))
    }
    @Test
    fun addBinary3() {
        assertEquals("10", solution.addBinary("1","1"))
    }
    @Test
    fun addBinary4() {
        assertEquals("100", solution.addBinary("10","10"))
    }
    @Test
    fun addBinary5() {
        assertEquals("101", solution.addBinary("100","1"))
    }
    @Test
    fun addBinary6() {
        assertEquals("10101", solution.addBinary("1010","1011"))
    }

}