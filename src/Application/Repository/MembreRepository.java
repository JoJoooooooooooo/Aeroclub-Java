package Application.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Application.Entity.Membre;

public class MembreRepository {
    private Connection connection;

    public MembreRepository(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Membre membre) throws SQLException {
        String sql = "INSERT INTO membres (nom, prenom, adresse, code_postal, ville, tel, fax, email, num_badge, num_qualif, profession, lieu_naissance, carte_federal, date_naissance, date_attestation, date_theorique_bb, date_theorique_ppla, date_bb, date_ppla, numero_bb, numero_ppla, date_inscription, password) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, membre.getNom());
            statement.setString(2, membre.getPrenom());
            statement.setString(3, membre.getAdresse());
            statement.setString(4, membre.getCodePostal());
            statement.setString(5, membre.getVille());
            statement.setString(6, membre.getTel());
            statement.setString(7, membre.getFax());
            statement.setString(8, membre.getEmail());
            statement.setInt(9, membre.getNumBadge());
            statement.setInt(10, membre.getNumQualif());
            statement.setString(11, membre.getProfession());
            statement.setString(12, membre.getLieuNaissance());
            statement.setString(13, membre.getCarteFederal());
            statement.setDate(14, membre.getDateNaissance());
            statement.setDate(15, membre.getDateAttestation());
            statement.setDate(16, membre.getDateTheoriqueBB());
            statement.setDate(17, membre.getDateTheoriquePPLA());
            statement.setDate(18, membre.getDateBB());
            statement.setDate(19, membre.getDatePPLA());
            statement.setString(20, membre.getNumeroBB());
            statement.setString(21, membre.getNumeroPPLA());
            statement.setDate(22, membre.getDateInscription());
            statement.setString(23, membre.getPassword());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected == 1;
        } catch (SQLException e) {
            // Log the exception or rethrow it, depending on your use case
            throw e;
        }
    }

    public List<Membre> list() throws SQLException {
        List<Membre> membres = new ArrayList<>();
        String query = "SELECT * FROM Membre";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int numMembres = rs.getInt("numMembres");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String adresse = rs.getString("adresse");
                String codePostal = rs.getString("codePostal");
                String ville = rs.getString("ville");
                String tel = rs.getString("tel");
                String fax = rs.getString("fax");
                String email = rs.getString("email");
                int numBadge = rs.getInt("numBadge");
                int numQualif = rs.getInt("numQualif");
                String profession = rs.getString("profession");
                String lieuNaissance = rs.getString("lieuNaissance");
                String carteFederal = rs.getString("carteFederal");
                Date dateNaissance = rs.getDate("dateNaissance");
                Date dateAttestation = rs.getDate("dateAttestation");
                Date dateTheoriqueBB = rs.getDate("dateTheoriqueBB");
                Date dateTheoriquePPLA = rs.getDate("dateTheoriquePPLA");
                Date dateBB = rs.getDate("dateBB");
                Date datePPLA = rs.getDate("datePPLA");
                String numeroBB = rs.getString("numeroBB");
                String numeroPPLA = rs.getString("numeroPPLA");
                Date dateInscription = rs.getDate("dateInscription");
                String password = rs.getString("password");
                membres.add(new Membre(numMembres, nom, prenom, adresse, codePostal, ville, tel, fax, email, numBadge, numQualif, profession, lieuNaissance, carteFederal, dateNaissance, dateAttestation, dateTheoriqueBB, dateTheoriquePPLA, dateBB, datePPLA, numeroBB, numeroPPLA, dateInscription, password));
            }
        } catch (SQLException e) {
            System.out.println("Error reading members: " + e.getMessage());
        }
        return membres;
    }

    
    public Membre read(int numMembre) throws SQLException {
        String query = "SELECT * FROM Membre WHERE numMembres = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, numMembre);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nom = rs.getString("nom");
                    String prenom = rs.getString("prenom");
                    String adresse = rs.getString("adresse");
                    String codePostal = rs.getString("codePostal");
                    String ville = rs.getString("ville");
                    String tel = rs.getString("tel");
                    String fax = rs.getString("fax");
                    String email = rs.getString("email");
                    int numBadge = rs.getInt("numBadge");
                    int numQualif = rs.getInt("numQualif");
                    String profession = rs.getString("profession");
                    String lieuNaissance = rs.getString("lieuNaissance");
                    String carteFederal = rs.getString("carteFederal");
                    Date dateNaissance = rs.getDate("dateNaissance");
                    Date dateAttestation = rs.getDate("dateAttestation");
                    Date dateTheoriqueBB = rs.getDate("dateTheoriqueBB");
                    Date dateTheoriquePPLA = rs.getDate("dateTheoriquePPLA");
                    Date dateBB = rs.getDate("dateBB");
                    Date datePPLA = rs.getDate("datePPLA");
                    String numeroBB = rs.getString("numeroBB");
                    String numeroPPLA = rs.getString("numeroPPLA");
                    Date dateInscription = rs.getDate("dateInscription");
                    String password = rs.getString("password");
                    return new Membre(numMembre, nom, prenom, adresse, codePostal, ville, tel, fax, email, numBadge, numQualif, profession, lieuNaissance, carteFederal, dateNaissance, dateAttestation, dateTheoriqueBB, dateTheoriquePPLA, dateBB, datePPLA, numeroBB, numeroPPLA, dateInscription, password);
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading member: " + e.getMessage());
            return null;
        }
    }





    public boolean delete(int numMembre) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                "DELETE FROM membres WHERE numMembres = ?");
            stmt.setInt(1, numMembre);
            int rowsAffected = stmt.executeUpdate();
            return (rowsAffected > 0); // retourne true si au moins une ligne a été affectée
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du membre : " + e.getMessage());
            return false;
        }
    }


    public boolean update(Membre membre) throws SQLException {
        String sql = "UPDATE membres SET nom = ?, prenom = ?, adresse = ?, code_postal = ?, ville = ?, tel = ?, fax = ?, email = ?, num_badge = ?, num_qualif = ?, profession = ?, lieu_naissance = ?, carte_federal = ?, date_naissance = ?, date_attestation = ?, date_theorique_bb = ?, date_theorique_ppla = ?, date_bb = ?, date_ppla = ?, numero_bb = ?, numero_ppla = ?, date_inscription = ?, password = ? WHERE numMembres = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, membre.getNom());
        statement.setString(2, membre.getPrenom());
        statement.setString(3, membre.getAdresse());
        statement.setString(4, membre.getCodePostal());
        statement.setString(5, membre.getVille());
        statement.setString(6, membre.getTel());
        statement.setString(7, membre.getFax());
        statement.setString(8, membre.getEmail());
        statement.setInt(9, membre.getNumBadge());
        statement.setInt(10, membre.getNumQualif());
        statement.setString(11, membre.getProfession());
        statement.setString(12, membre.getLieuNaissance());
        statement.setString(13, membre.getCarteFederal());
        statement.setDate(14, membre.getDateNaissance());
        statement.setDate(15, membre.getDateAttestation());
        statement.setDate(16, membre.getDateTheoriqueBB());
        statement.setDate(17, membre.getDateTheoriquePPLA());
        statement.setDate(18, membre.getDateBB());
        statement.setDate(19, membre.getDatePPLA());
        statement.setString(20, membre.getNumeroBB());
        statement.setString(21, membre.getNumeroPPLA());
        statement.setDate(22, membre.getDateInscription());
        statement.setString(23, membre.getPassword());
        statement.setInt(24, membre.getNumMembres());
        int rowsUpdated = statement.executeUpdate();
        statement.close();
        return rowsUpdated > 0;
    }
    

}