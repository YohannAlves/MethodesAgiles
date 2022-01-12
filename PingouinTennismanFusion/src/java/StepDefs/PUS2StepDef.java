package StepDefs;

import Pingouin.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
//StepDef de la UserStory 2 pré fusion (PINGOUIN)
public class PUS2StepDef {

    private Pingouin pingouin1;
    private Pingouin pingouin2;
    private Pingouin vainqueur;

    @Given("Un combat entre un {string} avec un niveau d {int}")
    public void unCombatEntreUnPingouinUnAvecUnNiveauDAgiliteUn(String string, int int1) {
        pingouin1 = new Pingouin(string, int1);
    }

    @And("Un {string} avec un niveau d {int}")
    public void unPingouinDeuxAvecUnNiveauDAgiliteDeux(String string, int int1) {
        pingouin2 = new Pingouin(string, int1);
    }

    @When("Le combat est lance par un arbitre")
    public void le_combat_est_lance_par_un_arbitre() {
        Arbitre arbitre = new Arbitre(pingouin1, pingouin2);
        this.vainqueur = arbitre.arbitreMatch();
    }

    @Then("Le pingouin avec la meilleure agilite est declare {string}.")
    public void le_pingouin_avec_la_meilleure_agilite_est_declare_vainqueur(String string) {
        Assert.assertEquals(this.vainqueur.getNom(), string);
    }
}