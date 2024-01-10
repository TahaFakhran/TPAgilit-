

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ChampionTest
{
    Champion kaisa;
    Abilities abilitieKaisa;
    
    @BeforeEach
    public void setUp()
    {
        kaisa = new Champion("Kaisa", 1);
        abilitieKaisa = new Abilities(kaisa, "Evolve", "Projectiles", "Kaboum", "Dash", "Teleport");
    }

    @Test
    public void testLevelUpOnAbilityCast()
    {
        int futureLevelOnP = kaisa.getLevel();
        abilitieKaisa.castAbility("P");
        assertEquals(futureLevelOnP, kaisa.getLevel());
        
        int futureLevelOnQ = kaisa.getLevel();
        abilitieKaisa.castAbility("Q");
        assertEquals(futureLevelOnQ + 1, kaisa.getLevel());
        
        int futureLevelOnW = kaisa.getLevel();
        abilitieKaisa.castAbility("W");
        assertEquals(futureLevelOnW + 1, kaisa.getLevel());
        
        int futureLevelOnE = kaisa.getLevel();
        abilitieKaisa.castAbility("E");
        assertEquals(futureLevelOnE + 1, kaisa.getLevel());
        
        int futureLevelOnR = kaisa.getLevel();
        abilitieKaisa.castAbility("R");
        assertEquals(futureLevelOnR + 1, kaisa.getLevel());
    }

    @Test
    public void testLevelUp()
    {
        int futureLevel = kaisa.getLevel();
        assertEquals(futureLevel + 1, kaisa.levelUp());
    }
    
     @AfterEach
    public void tearDown()
    {
    }
    
        
    public ChampionTest()
    {
    }
}

