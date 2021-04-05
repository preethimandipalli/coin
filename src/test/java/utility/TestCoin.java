package utility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCoin {

    @Test
    void TestToCheckIfProbabilityOfHeadIsEqualToThatOfTail(){
        int count=1;
        Coin coin=new Coin(count);
        boolean expected=true;

        boolean actual=coin.checkEqualityOfProbability();

        assertEquals(expected,actual);

    }

}
