package StepDefs;

import Tennisman.Tennisman;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

//StepDef de la UserStory 1 pré fusion (TENNISMAN)
public class TUS1StepDef {
    Tennisman zverev;
    Tennisman djokovic;
    double chance;
    @Given("un tennisman")
    public void unTennisman() {
        this.zverev = new Tennisman();
    }

    @When("l'utilisateur calcule les chances de son tennisman")
    public void lUtilisateurCalculeLesChancesDeSonTennisman() {
        this.chance = this.zverev.chanceDeGagner();
    }

    @Then("les chances sont calculées et retournées")
    public void lesChancesSontCalculéesEtRetournées() {
        assertEquals(1.1,this.chance,0.009);
    }
}
