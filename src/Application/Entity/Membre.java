package Application.Entity;

import java.sql.Date;

public class Membre {
    private int numMembres;
    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;
    private String tel;
    private String fax;
    private String email;
    private int numBadge;
    private int numQualif;
    private String profession;
    private String lieuNaissance;
    private String carteFederal;
    private Date dateNaissance;
    private Date dateAttestation;
    private Date dateTheoriqueBB;
    private Date dateTheoriquePPLA;
    private Date dateBB;
    private Date datePPLA;
    private String numeroBB;
    private String numeroPPLA;
    private Date dateInscription;
    private String password;
    
    // Constructeur
    public Membre(int numMembres, String nom, String prenom, String adresse, String codePostal, String ville,String tel, String fax, String email, int numBadge, int numQualif, String profession,String lieuNaissance, String carteFederal, Date dateNaissance, Date dateAttestation,Date dateTheoriqueBB, Date dateTheoriquePPLA, Date dateBB, Date datePPLA, String numeroBB, String numeroPPLA, Date dateInscription, String password) {
        this.numMembres = numMembres;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.tel = tel;
        this.fax = fax;
        this.email = email;
        this.numBadge = numBadge;
        this.numQualif = numQualif;
        this.profession = profession;
        this.lieuNaissance = lieuNaissance;
        this.carteFederal = carteFederal;
        this.dateNaissance = dateNaissance;
        this.dateAttestation = dateAttestation;
        this.dateTheoriqueBB = dateTheoriqueBB;
        this.dateTheoriquePPLA = dateTheoriquePPLA;
        this.dateBB = dateBB;
        this.datePPLA = datePPLA;
        this.numeroBB = numeroBB;
        this.numeroPPLA = numeroPPLA;
        this.dateInscription = dateInscription;
        this.password = password;
    }

    public int getNumMembres() {
        return numMembres;
    }

    public void setNumMembres(int numMembres) {
        this.numMembres = numMembres;
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
    
    public int getNumBadge() {
        return numBadge;
    }
    
    public void setNumBadge(int numBadge) {
        this.numBadge = numBadge;
    }
    
    public int getNumQualif() {
        return numQualif;
    }
    
    public void setNumQualif(int numQualif) {
        this.numQualif = numQualif;
    }
    
    public String getProfession() {
        return profession;
    }
    
    public void setProfession(String profession) {
        this.profession = profession;
    }
    
    public String getLieuNaissance() {
        return lieuNaissance;
    }
    
    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }
    
    public String getCarteFederal() {
        return carteFederal;
    }
    
    public void setCarteFederal(String carteFederal) {
        this.carteFederal = carteFederal;
    }
    
    public Date getDateNaissance() {
        return dateNaissance;
    }
    
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    public Date getDateAttestation() {
        return dateAttestation;
    }
    
    public void setDateAttestation(Date dateAttestation) {
        this.dateAttestation = dateAttestation;
    }
    
    public Date getDateTheoriqueBB() {
        return dateTheoriqueBB;
    }
    
    public void setDateTheoriqueBB(Date dateTheoriqueBB) {
        this.dateTheoriqueBB = dateTheoriqueBB;
    }
    
    public Date getDateTheoriquePPLA() {
        return dateTheoriquePPLA;
    }
    
    public void setDateTheoriquePPLA(Date dateTheoriquePPLA) {
        this.dateTheoriquePPLA = dateTheoriquePPLA;
    }
    
    public Date getDateBB() {
        return dateBB;
    }
    
    public void setDateBB(Date dateBB) {
        this.dateBB = dateBB;
    }
    
    public Date getDatePPLA() {
        return datePPLA;
    }
    
    public void setDatePPLA(Date datePPLA) {
        this.datePPLA = datePPLA;
    }
    
    public String getNumeroBB() {
        return numeroBB;
    }
    
    public void setNumeroBB(String numeroBB) {
        this.numeroBB = numeroBB;
    }
    
    public String getNumeroPPLA() {
        return numeroPPLA;
    }
    
    public void setNumeroPPLA(String numeroPPLA) {
        this.numeroPPLA = numeroPPLA;
    }
    
    public Date getDateInscription() {
        return dateInscription;
    }
    
    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    

    

}