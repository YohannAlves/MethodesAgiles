package Tennisman;

public class Tennisman {
    // variables d'instance
    private int classement;
    private double cote;

    /**
     * Constructeur d'objets de classe td2.Tennisman.Tennisman
     */
    public Tennisman()
    {
        // initialisation des variables d'instance
        this.classement = 1;
        this.cote = 1.10;
    }

    // Getter
    public int getClassement() {
        return this.classement;
    }

    public double getCote() {
        return this.cote;
    }

    // Setter
    public void setClassement(int newClassement) {
        this.classement = newClassement;
    }

    public void setCote(double newCote) {
        this.cote = newCote;
    }
    public double chanceDeGagner()
    {
        return this.getCote()/this.getClassement();
    }

}
