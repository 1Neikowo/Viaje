import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    private Auto auto = new Auto();

    @org.junit.jupiter.api.Test
    void viajarAuto() {
        assertEquals(1, auto.viajarAuto(120));
    }
}