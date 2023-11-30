package tech.ixirsii

import org.junit.jupiter.api.Test
import tech.ixirsii.argParse.parseArgs
import kotlin.test.assertEquals

class KArgParseTest {
    @Test
    internal fun `GIVEN empty args WHEN parseArgs THEN returns`() {
        // Given
        val args: Array<String> = emptyArray()
        val expected = Config()

        // When
        val actual: Config = parseArgs(args)

        // Then
        assertEquals(expected, actual, "Config should be empty")
    }

    /**
     * Config type for tests
     */
    internal class Config {

    }
}
