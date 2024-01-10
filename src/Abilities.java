
/**
 * Class Abilities
 *
 * @author Taha & Sakina
 * @version 0.1.0
 */
public class Abilities
{
    private Champion champion;
    
    private String passive;
    private String abilityQ;
    private String abilityW;
    private String abilityE;
    private String abilityR;
    
    public Abilities(Champion champion, String passive, String abilityQ, String abilityW, String abilityE, String abilityR)
    {
        this.champion = champion;
        this.passive = passive;
        this.abilityQ = abilityQ;
        this.abilityW = abilityW;
        this.abilityE = abilityE;
        this.abilityR = abilityR;
    }

    public String castAbility(String ability)
    {
        switch (ability){
        case "Q":
            this.champion.levelUp();
            return this.abilityQ;
        case "W":
            this.champion.levelUp();
            return this.abilityW;
        case "E":
            this.champion.levelUp();
            return this.abilityE;
        case "R":
            this.champion.levelUp();
            return this.abilityR;
        default:
            return this.passive;
        }
    }
}
