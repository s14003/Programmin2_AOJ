import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Scanner;
public class BTest {
    @Test
    public void RangeTest() {
        Scanner scan = new Scanner(System.in);
        ITP1_2_B itp = new ITP1_2_B();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        assertEquals("Yes",itp.Range(a,b,c));
    }
}
