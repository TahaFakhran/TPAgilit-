import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class AbilitiesStepDef {
    private Champion champion;
    private Abilities abilities;
    private String activeAbility;

    @Given("a champion with name {string} and level {int} with abilities {string}, {string}, {string}, {string}, and {string}")
    public void aChampionWithAbilities(String name, int level, String passive, String abilityQ, String abilityW, String abilityE, String abilityR) {
        champion = new Champion(name, level);
        abilities = new Abilities(champion, passive, abilityQ, abilityW, abilityE, abilityR);
    }

    @When("the champion casts ability {string}")
    public void theChampionCastsAbility(String ability) {
        activeAbility = abilities.castAbility(ability);
    }

    @Then("the champion should level up")
    public void theChampionShouldLevelUp() {
        int originalLevel = champion.getLevel();
        abilities.castAbility("Q");
        int newLevel = champion.getLevel();
        assertEquals(originalLevel + 1, newLevel);
    }

    @Then("the champion should not level up")
    public void theChampionShouldNotLevelUp() {
        int originalLevel = champion.getLevel();
        abilities.castAbility("Passive");
        int newLevel = champion.getLevel();
        assertEquals(originalLevel, newLevel);
    }

    @Then("the champion's active ability should be {string}")
    public void theChampionActiveAbilityShouldBe(String expectedAbility) {
        assertEquals(expectedAbility, activeAbility);
    }
}
