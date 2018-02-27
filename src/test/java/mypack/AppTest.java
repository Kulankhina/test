package mypack;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void testReturnTrue() {
        App a = new App();
        Assert.assertTrue(a.returnTrue());
    }
}
