package Application.Entity;

public class Instructeur {
    private int numInstructeur;
    private String nom;
    private String prenom;
    private String numCivil;
    private double tauxInstructeur;
    private String adresse;
    private String codePostal;
    private String ville;
    private String tel;
    private String fax;
    private String email;
    private int numBadge;
    
    public Instructeur(int numInstructeur, String nom, String prenom, String numCivil, double tauxInstructeur, String adresse, String codePostal, String ville, String tel, String fax, String email, int numBadge) {
        this.numInstructeur = numInstructeur;
        this.nom = nom;
        this.prenom = prenom;
        this.numCivil = numCivil;
        this.tauxInstructeur = tauxInstructeur;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.tel = tel;
        this.fax = fax;
        this.email = email;
        this.numBadge = numBadge;
    }
    
    // Getters and setters for all attributes
    
    public int getNumInstructeur() {
        return numInstructeur;
    }

    public void setNumInstructeur(int numInstructeur) {
        this.numInstructeur = numInstructeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumCivil() {
        return numCivil;
    }

    public void setNumCivil(String numCivil) {
        this.numCivil = numCivil;
    }

    public double getTauxInstructeur() {
        return tauxInstructeur;
    }

    public void setTauxInstructeur(double tauxInstructeur) {
        this.tauxInstructeur = tauxInstructeur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getnumBadge() {
        return numBadge;
    }

    public void setnumBadge(int numBadge) {
        this.numBadge = numBadge;
    }



}