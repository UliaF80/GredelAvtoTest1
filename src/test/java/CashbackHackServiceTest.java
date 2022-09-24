import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {


    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
}
