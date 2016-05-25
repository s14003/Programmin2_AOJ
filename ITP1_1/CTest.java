import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Scanner;

public class CTest {
    @Test
    public void Area() {
        ITP1_1_C itp = new ITP1_1_C();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        assertEquals(15, itp.area(a,b));
        assertEquals(16, itp.length(a,b));
    }
}
