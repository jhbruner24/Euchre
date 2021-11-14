package JUnit;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import Core.Game;

public class GameTest {
    
    @Before
    public void beforeEachTestMethod() {
        //Game _instance = new Game();
    }

    @Test
    public void testMain() 
    {
        Exception actual = null;
        try {
            Game.main(new String[]{});
        }
        catch (Exception ex){
            actual = ex;
        }
        assertNull(actual);
    }
}
