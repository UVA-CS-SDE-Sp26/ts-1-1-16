import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherUtilityTest {
    @Test
    public void addTest() {
        assertEquals(4, CipherUtility.add(1,3));
    }
}