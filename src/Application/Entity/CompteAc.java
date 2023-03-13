package Application.Entity;

import java.sql.Date;

public class CompteAc {

    // Attributs de la classe
    private int numCompte;
    private int numMembre;
    private int numSeq;
    private String description;
    private Date date;
    private double debit;
    private double credit;

    // Constructeur de la classe
    public CompteAc(int numCompte, int numMembre, int numSeq, String description, Date date, double debit, double credit) {
        this.numCompte = numCompte;
        this.numMembre = numMembre;
        this.numSeq = numSeq;
        this.description = description;
        this.date = date;
        this.debit = debit;
        this.credit = credit;
    }

    // Getters et setters pour les attributs de la classe
    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public int getNumMembre() {
        return numMembre;
    }

    public void setNumMembre(int numMembre) {
        this.numMembre = numMembre;
    }

    public int getNumSeq() {
        return numSeq;
    }

    public void setNumSeq(int numSeq) {
        this.numSeq = numSeq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}

