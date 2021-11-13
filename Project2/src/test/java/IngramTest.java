import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class IngramTest {

    Ingram ingram;

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("In the beginning, before it all...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each test...");
        ingram = new Ingram();
    }

    @Test
    void getInt() {
        assertEquals(0, ingram.getInt());
    }

    @Test
    void getInt2() {
        assertEquals(20, ingram.getInt());
    }

    @Test
    void getInt3() {
        assertEquals(30, ingram.getInt());
    }
@Test
    void getInt4() {
        assertEquals(15, ingram.getInt());
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test...");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("...and after all tests have run.");
    }
}