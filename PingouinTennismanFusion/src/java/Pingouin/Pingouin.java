package Pingouin;

public class Pingouin
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private boolean debout;
    private int agilite;
    private String nom;

    /**
     * Constructeur d'objets de classe Pingouin.Pingouin
     */
    public Pingouin(String n) // Constructeur par défaut
    {
        this.nom = n;
        this.debout = true;
        this.agilite = 0;
    }
    public Pingouin(String n, int ag)
    {
        this.nom = n;
        this.agilite = ag;
        this.debout = true;
    }

    /**
     * Le pingouin lance une boule de neige au pingouin adversaire en
     * paramètre
     *
     * @param  adversaire : Pingouin.Pingouin adverse
     * @return     true si la boule de neige touche
     *             false sinon
     */
    public boolean lanceBouleDeNeige(Pingouin adversaire)
    {
        if (this.agilite > adversaire.getAgilite()){
            adversaire.setDebout(false);
            return true;
        }
        else return false;
    }

    public int getAgilite(){
        return this.agilite;
    }

    public String getNom(){return this.nom;}

    public void setDebout(boolean d){
        this.debout = d;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pingouin) {
            Pingouin p= (Pingouin)o;
            if (this.getAgilite() == p.getAgilite())
                return true;
        }
        return false;
    }
}

