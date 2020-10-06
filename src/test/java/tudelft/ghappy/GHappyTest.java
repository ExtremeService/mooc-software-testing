package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.leapyear.LeapYear;

public class GHappyTest
{
    @Test
    public void shortstring()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gg");
        Assertions.assertTrue(result);
    }

    @Test
    public void shortstringfalse()
    {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("g");
        Assertions.assertFalse(result);
    }



}
