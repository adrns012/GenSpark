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
    public void getSelection() {
        System.out.println("Test 1");
        assertEquals(1, ingram.getSelection(), "Test 1 failed");
    }

    @Test
    public void getSelection2() {
        System.out.println("Test 2");
        assertEquals(2, ingram.getSelection(), "Test 2 failed");
    }

    @Test
    public void getSelection3() {
        System.out.println("Test 3");
        assertEquals(0, ingram.getSelection(), "Test 3 failed");
    }
    @Test
    public void getSelection4() {
        System.out.println("Test 4");
        assertEquals(-1, ingram.getSelection(), "Test 4 failed");
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