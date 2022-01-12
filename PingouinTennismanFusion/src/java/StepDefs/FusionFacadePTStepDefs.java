package StepDefs;

import DesignPatterns.FacadeMatch;
import Pingouin.Pingouin;
import Tennisman.Tennisman;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FusionFacadePTStepDefs {
    private Pingouin p;
    private Tennisman t;
    private String nomTennisman;
    private String nomVainqueur;

    @Given("Un match entre un tennisman {string} avec une {double} et un pingouin {string} avec une {int}")
    public void un_match_entre_un_tennisman_avec_une_et_un_pingouin_avec_une(String string, Double double1, String string2, Integer int1) {
        p = new Pingouin (string2, int1);
        t = new Tennisman();
        nomTennisman = string;
        t.setCote(double1);
    }

    @When("On lance le match")
    public void on_lance_le_match() {
        FacadeMatch match = new FacadeMatch(p,t, nomTennisman);

        Tennisman vainqueur = (Tennisman) match.lancerMatch();
        nomVainqueur = match.getNomJoueurVainqueur(vainqueur);
    }

    @Then("le vainqueur {string} est designe")
    public void le_vainqueur_est_designe(String string) {
        Assert.assertEquals(string, nomVainqueur);
    }
}
