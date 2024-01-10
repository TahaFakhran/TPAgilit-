

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AbilitiesTest
{
    Champion teemo;
    Abilities abilitieTeemo;
    
    public AbilitiesTest()
    {
        
    }

    @BeforeEach
    public void setUp()
    {
        teemo = new Champion("Teemo", 1);
        abilitieTeemo = new Abilities(teemo, "Invisible", "Bee sting", "Movement Speed", "More Damage", "Mushrooms");
    }

    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testCastAbility()
    {
        assertEquals("Invisible", abilitieTeemo.castAbility("P"));
        assertEquals("Bee sting", abilitieTeemo.castAbility("Q"));
        assertEquals("Movement Speed", abilitieTeemo.castAbility("W"));
        assertEquals("More Damage", abilitieTeemo.castAbility("E"));
        assertEquals("Mushrooms", abilitieTeemo.castAbility("R"));
    }
}

