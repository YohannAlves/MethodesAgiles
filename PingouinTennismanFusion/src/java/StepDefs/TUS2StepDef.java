package StepDefs;

import Tennisman.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

//StepDef de la UserStory 2 pré fusion (TENNISMAN)
public class TUS2StepDef {
    Tennisman zverev;
    Tennisman djokovic;
    Tennisman vainqueur;
    Match match;

    @Given("un tennisman classé {int}")
    public void un_tennisman_classé(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        this.zverev = new Tennisman();
        this.zverev.setClassement(int1);
    }

    @And("un autreTennisman classé {int}")
    public void unAutreTennismanClasséAutreClassement(Integer int1) {
        this.djokovic = new Tennisman();
        this.djokovic.setClassement(int1);
    }

    @And("un match")
    public void unMatch() {
        this.match = new Match(this.djokovic,this.zverev);
    }

    @When("l'utilisateur joue un match avec ses tennisman")
    public void lUtilisateurJoueUnMatchAvecSesTennisman() {
        this.vainqueur = this.match.jouerMatch();
    }

    @Then("le vainqueur est désigné")
    public void leVainqueurEstDésigné() {
        assertEquals(this.djokovic, this.vainqueur);
    }
}
