import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class ChampionStepDef {
    private Champion champion;
    @Given("a champion with name {string} and level {int}")
    public void aChampionWithLevel(String name, int level) {
        champion = new Champion(name, level);
    }

    @When("the champion is created")
    public void theChampionIsCreated() {
    }

    @When("the champion levels up")
    public void theChampionLevelsUp() {
        champion.levelUp();
    }

    @When("the champion's level is set to {int}")
    public void theChampionLevelIsSetTo(int level) {
        champion.setLevel(level);
    }

    @Then("the champion should have name {string}")
    public void theChampionShouldHaveName(String expectedName) {
        assertEquals(expectedName, champion.getName());
    }

    @Then("the champion should have level {int}")
    public void theChampionShouldHaveLevel(int expectedLevel) {
        assertEquals(expectedLevel, champion.getLevel());
    }
}
