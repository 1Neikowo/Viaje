import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {
    private Bicicleta bici = new Bicicleta();
    @Test
    void viajarBici() {
        assertEquals(1, bici.viajarBici(20));
    }
}