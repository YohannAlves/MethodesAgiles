package Pingouin;

/**
 *
 * @author ALVES NGUYEN
 * @version 2.0
 */
public class Arbitre implements ArbitreInterface
{
    private Pingouin pingouin1;
    private Pingouin pingouin2;

    /**
     * Constructeur d'objets de classe Pingouin.Arbitre
     */
    public Arbitre(Pingouin p1, Pingouin p2)
    {
        // initialisation des variables d'instance
        this.pingouin1 = p1;
        this.pingouin2 = p2;
    }

    public Pingouin arbitreMatch() {
        boolean lancer1 = pingouin1.lanceBouleDeNeige(pingouin2);

        if (lancer1) return pingouin1;
        else return pingouin2;
    }
}
