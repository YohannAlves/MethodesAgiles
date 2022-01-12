package Tennisman;

public class Match
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Tennisman joueur1;
    private Tennisman joueur2;

    public Match()
    {
        // initialisation des variables d'instance
        this.joueur1 = new Tennisman();
        this.joueur2 = new Tennisman();
    }

    public Match(Tennisman joueur1, Tennisman joueur2)
    {
        // initialisation des variables d'instance
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    public Tennisman jouerMatch()
    {
        return this.joueur1.chanceDeGagner() > this.joueur2.chanceDeGagner() ? this.joueur1 : this.joueur2;
    }
}