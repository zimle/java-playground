package zimle.playground;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Throwaway test class. */
class LibraryTest {

    /** Dummy explicit constructor. */
    LibraryTest() {}

    /** Test example. */
    @Test
    void someLibraryMethodReturnsTrue() {
        assertTrue(Library.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
