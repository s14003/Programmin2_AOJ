import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ATest {
    @Test
    public void MessageCheck() {
        ITP1_1_A itp = new ITP1_1_A();
        String result = itp.message("Hello World");
        assertEquals("Hello World",result);
    }
}
