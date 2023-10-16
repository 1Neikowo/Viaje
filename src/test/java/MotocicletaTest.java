import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotocicletaTest {
    private Motocicleta moto = new Motocicleta();
    @Test
    void viajarMoto() {
        assertEquals(1, moto.viajarMoto(100));
    }
}