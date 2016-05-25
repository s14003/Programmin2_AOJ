import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Scanner;

public class BTest {
    @Test
    public void CubeTest() {
        Scanner scan = new Scanner(System.in);
        ITP1_1_B itp = new ITP1_1_B();

        int cube = scan.nextInt();
        int cuberesult = itp.Cube(cube);
        int result = cube * cube * cube;
        assertEquals(result,cuberesult);
    }
}
