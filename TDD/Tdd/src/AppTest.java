import static org.junit.Assert.assertEquals;
// import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void testGetString() {
        App app = new App();
        assertEquals(12, app.converteCartaParaInt("q"));
    }
}
