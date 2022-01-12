package DesignPatterns;

import Pingouin.Arbitre;
import Pingouin.Pingouin;
import Tennisman.Match;
import Tennisman.Tennisman;

public class FacadeMatch {
    private Object o1;
    private Object o2;
    // Etant donné que dans la classe tennisman il n'y a pas de variable nom, on la stocke ici
    private String nomTennisMan;
    public FacadeMatch(Object o1,Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    public FacadeMatch(Object o1,Object o2, String nomTM){
        this.o1 = o1;
        this.o2 = o2;
        this.nomTennisMan = nomTM;
    }

    public Object lancerMatch(){
        // Match entre 2 pingouins
        if (o1 instanceof Pingouin && o2 instanceof Pingouin){
            Arbitre arbitre = new Arbitre((Pingouin)o1, (Pingouin)o2);
            Pingouin vainqueur = arbitre.arbitreMatch();
            return vainqueur;
        }
        // Match entre 2 tennisman
        else if (o1 instanceof Tennisman && o2 instanceof Tennisman){
            Match match = new Match((Tennisman)o1, (Tennisman) o2);
            Tennisman vainqueur = match.jouerMatch();
            return vainqueur;
        }
        // Match entre 1 pinoguin et 1 tennisman
        else if ((o1 instanceof Tennisman && o2 instanceof Pingouin) || (o2 instanceof Tennisman && o1 instanceof Pingouin)){
            //On transforme le Pingouin en TennisMan
            double cote;
            Pingouin p;
            Tennisman t;
            if (o1 instanceof Pingouin){

                p = (Pingouin) o1;
                t = (Tennisman) o2;
            }
            else {
                p = (Pingouin) o2;
                t = (Tennisman) o1;
            }
            // agilite devient cote (ex : 50 agilité = 1.50 cote)
            cote = 1+(Double.valueOf(p.getAgilite())/100);
            Tennisman pingouinTennisman = new Tennisman();
            pingouinTennisman.setCote(cote);
            // Le pingouin est par défaut sur un classement 2 (c'est un débutant!)
            pingouinTennisman.setClassement(2);
            Match match = new Match(t, pingouinTennisman);
            Tennisman vainqueur = match.jouerMatch();
            return vainqueur;
        }
        else return null;
    }

    public String getNomJoueurVainqueur(Object vainqueur){
        if (vainqueur instanceof Tennisman){
            Pingouin p = null;
            Tennisman t = (Tennisman) vainqueur;
            if (o1 instanceof Pingouin){
                p = (Pingouin) o1;
            }
            else if (o2 instanceof Pingouin){
                p = (Pingouin) o2;
            }
            if ((t.getClassement()) == 2) {
                return p.getNom();
            }
            else return nomTennisMan;
        }
        else return null;
    }

}
