package DesignPatterns;

import Pingouin.ArbitreInterface;
import Tennisman.Tennisman;

public class ArbitreDeTennisAdaptater implements ArbitreInterface {

    private Tennisman t1;
    private String nom1;
    private Tennisman t2;
    private String nom2;

    public ArbitreDeTennisAdaptater(Tennisman j1, String n1, Tennisman j2, String n2){
        this.t1 = j1;
        this.nom1 = n1;
        this.t2 = j2;
        this.nom2 = n2;
    }
    @Override
    public Object arbitreMatch() {
        return this.t1.chanceDeGagner() > this.t2.chanceDeGagner() ? this.t1 : this.t2;
    }

    public String getNom(Tennisman t){
        if (t == this.t1) return nom1;
        else return nom2;
    }
}
