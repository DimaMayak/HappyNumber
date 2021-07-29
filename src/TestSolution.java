import org.junit.Test;
import static org.junit.Assert.*;

public class TestSolution {
    @Test
    public void testHelpSumSquare() throws Exception{
        assertEquals(1,Solution.helpSumSquare(100));
    }

    @Test
    public void testIsHappy() throws Exception{
        assertEquals(true,Solution.isHappy(100));
    }
}
