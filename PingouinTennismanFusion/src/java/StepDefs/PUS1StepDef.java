package StepDefs;

import Pingouin.Pingouin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
//StepDef de la UserStory 1 pré fusion (PINGOUIN)
public class PUS1StepDef {
    private Pingouin pingouin1;
    private int agilite;
    @Given("Un pingouin")
    public void unPingouin() {
        pingouin1 = new Pingouin("Bobby", 50);
    }

    @When("Recupere l'agilite")
    public void recupereLagilite() {
        agilite = pingouin1.getAgilite();
    }

    @Then("Agilite renvoyee")
    public void agiliteRenvoye() {
        assertEquals(pingouin1.getAgilite(), agilite);
    }
}