import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Scanner;

public class DTest {
    @Test
    public void TestTime() {
        Scanner scan = new Scanner(System.in);
        ITP1_1_D itp = new ITP1_1_D();
        int num = scan.nextInt();
        assertEquals("13:2:59",itp.Time(num));
    }
}
