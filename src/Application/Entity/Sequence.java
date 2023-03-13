package Application.Entity;

import java.sql.Date;

public class Sequence {
    private int numSequence;
    private int numMembres;
    private int numInstructeur;
    private int numAvions;
    private Date date;
    private int temps;
    private double prixSpecial;
    private double taux;
    private double reductionSemaine;
    private int numMotif;
    private double tauxInstructeur;
    private short forfaitInitiation;
    
    public Sequence(int numMembres, int numInstructeur, int numAvions, Date date, int temps,
                    double prixSpecial, double taux, double reductionSemaine, int numMotif,
                    double tauxInstructeur, short forfaitInitiation) {
        this.numMembres = numMembres;
        this.numInstructeur = numInstructeur;
        this.numAvions = numAvions;
        this.date = date;
        this.temps = temps;
        this.prixSpecial = prixSpecial;
        this.taux = taux;
        this.reductionSemaine = reductionSemaine;
        this.numMotif = numMotif;
        this.tauxInstructeur = tauxInstructeur;
        this.forfaitInitiation = forfaitInitiation;
    }

    public int getNumSequence() {
        return numSequence;
    }

    public void setNumSequence(int numSequence) {
        this.numSequence = numSequence;
    }

    public int getNumMembres() {
        return numMembres;
    }

    public void setNumMembres(int numMembres) {
        this.numMembres = numMembres;
    }

    public int getNumInstructeur() {
        return numInstructeur;
    }

    public void setNumInstructeur(int numInstructeur) {
        this.numInstructeur = numInstructeur;
    }

    public int getNumAvions() {
        return numAvions;
    }

    public void setNumAvions(int numAvions) {
        this.numAvions = numAvions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public double getPrixSpecial() {
        return prixSpecial;
    }

    public void setPrixSpecial(double prixSpecial) {
        this.prixSpecial = prixSpecial;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double getReductionSemaine() {
        return reductionSemaine;
    }

    public void setReductionSemaine(double reductionSemaine) {
        this.reductionSemaine = reductionSemaine;
    }

    public int getNumMotif() {
        return numMotif;
    }

    public void setNumMotif(int numMotif) {
        this.numMotif =  numMotif;
    }
    
    public double getTauxInstructeur() {
        return tauxInstructeur;
    }

    public void setTauxInstructeur(double tauxInstructeur) {
        this.tauxInstructeur =  tauxInstructeur;
    }

    public short getForfaitInitiation() {
        return forfaitInitiation;
    }

    public void setForfaitInitiation(short ForfaitInitiation) {
        this.forfaitInitiation =  ForfaitInitiation;
    }
}