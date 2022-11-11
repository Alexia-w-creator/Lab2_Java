import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class MainTest {
    public String str = "2+7+(3+1)/0))";
    public String str1 = "2+7+(3+1)";
    @Test
    public void TestcheckBrackets(){
        Assert.assertTrue(Main.checkBrackets(str1));
        Assert.assertFalse(Main.checkBrackets(str));
    }
    @Test
    public void TestnotNul(){
        Assert.assertTrue(Main.notNul(str1));
        Assert.assertFalse(Main.notNul(str));
    }
    @Test
    public void Testfind(){
        Pair[] pair = new Pair[3];
        pair[0] = new Pair('4',5);
        pair[1] = new Pair('8',1);
        pair[2] = new Pair('6',7);
        Assert.assertEquals(Main.find(pair, '8'), "1.0");
    }


}
