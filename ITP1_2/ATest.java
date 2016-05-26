import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Scanner;

public class ATest {
    @Test
    public void ComparisonTest() {
        Scanner scan = new Scanner(System.in);
        ITP1_2_A itp = new ITP1_2_A();
        int a = scan.nextInt();
        int b = scan.nextInt();
        assertEquals("a < b", itp.Comparison(a,b));
    }
}
