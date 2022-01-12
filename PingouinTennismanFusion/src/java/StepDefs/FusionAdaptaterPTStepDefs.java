package StepDefs;

import DesignPatterns.ArbitreDeTennisAdaptater;
import Tennisman.Tennisman;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class FusionAdaptaterPTStepDefs {
    Tennisman t1;
    Tennisman t2;
    ArbitreDeTennisAdaptater arbitreTennis;
    Tennisman vainqueur;

    @Given("Un match entre deux tennisman {string} {string} de  {double} et {double}")
    public void un_match_entre_deux_tennisman_de_et(String string, String string2, Double double1, Double double2) {
        t1 = new Tennisman();
        t1.setCote(double1);
        t2 = new Tennisman();
        t2.setCote(double2);
        arbitreTennis = new ArbitreDeTennisAdaptater(t1, string, t2,string2);
    }

    @When("L'arbitre organise le match")
    public void l_arbitre_organise_le_match() {
       vainqueur = (Tennisman) arbitreTennis.arbitreMatch();
    }

    @Then("l'arbitre designe le vainqueur {string}")
    public void l_arbitre_designe_le_vainqueur(String string) {
        assertEquals(string, arbitreTennis.getNom(vainqueur));
    }
}
