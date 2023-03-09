package Application.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Application.Entity.Instructeur;

public class InstructeurRepository {

    private Connection connection;

    public InstructeurRepository(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public boolean create(Instructeur instructeur) throws SQLException {
        String query = "INSERT INTO instructeur (num_instructeur, nom, prenom, num_civil, taux_instructeur, adresse, code_postal, ville, tel, fax, email, num_badge) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, instructeur.getNumInstructeur());
            statement.setString(2, instructeur.getNom());
            statement.setString(3, instructeur.getPrenom());
            statement.setString(4, instructeur.getNumCivil());
            statement.setDouble(5, instructeur.getTauxInstructeur());
            statement.setString(6, instructeur.getAdresse());
            statement.setString(7, instructeur.getCodePostal());
            statement.setString(8, instructeur.getVille());
            statement.setString(9, instructeur.getTel());
            statement.setString(10, instructeur.getFax());
            statement.setString(11, instructeur.getEmail());
            statement.setInt(12, instructeur.getnumBadge());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    // READ
    public Instructeur read(int numInstructeur) throws SQLException {
        String query = "SELECT * FROM instructeur WHERE num_instructeur = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, numInstructeur);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Instructeur(
                            resultSet.getInt("num_instructeur"),
                            resultSet.getString("nom"),
                            resultSet.getString("prenom"),
                            resultSet.getString("num_civil"),
                            resultSet.getDouble("taux_instructeur"),
                            resultSet.getString("adresse"),
                            resultSet.getString("code_postal"),
                            resultSet.getString("ville"),
                            resultSet.getString("tel"),
                            resultSet.getString("fax"),
                            resultSet.getString("email"),
                            resultSet.getInt("num_badge"));
                } else {
                    return null;
                }
            }
        }
    }
        // UPDATE
    public boolean update(Instructeur instructeur) throws SQLException {
        String query = "UPDATE instructeur SET nom = ?, prenom = ?, num_civil = ?, taux_instructeur = ?, adresse = ?, code_postal = ?, ville = ?, tel = ?, fax = ?, email = ?, num_badge = ? WHERE num_instructeur = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, instructeur.getNom());
            statement.setString(2, instructeur.getPrenom());
            statement.setString(3, instructeur.getNumCivil());
            statement.setDouble(4, instructeur.getTauxInstructeur());
            statement.setString(5, instructeur.getAdresse());
            statement.setString(6, instructeur.getCodePostal());
            statement.setString(7, instructeur.getVille());
            statement.setString(8, instructeur.getTel());
            statement.setString(9, instructeur.getFax());
            statement.setString(10, instructeur.getEmail());
            statement.setInt(11, instructeur.getnumBadge());
            statement.setInt(12, instructeur.getNumInstructeur());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public List<Instructeur> list() throws SQLException {
        List<Instructeur> instructeurs = new ArrayList<>();

        String query = "SELECT * FROM instructeur";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            int numInstructeur = rs.getInt("numInstructeur");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String numCivil = rs.getString("numCivil");
            double tauxInstructeur = rs.getDouble("tauxInstructeur");
            String adresse = rs.getString("adresse");
            String codePostal = rs.getString("codePostal");
            String ville = rs.getString("ville");
            String tel = rs.getString("tel");
            String fax = rs.getString("fax");
            String email = rs.getString("email");
            int numBadge = rs.getInt("numBadge");

            Instructeur instructeur = new Instructeur(numInstructeur, nom, prenom, numCivil, tauxInstructeur, adresse, codePostal, ville, tel, fax, email, numBadge);
            instructeurs.add(instructeur);
        }

        return instructeurs;
    }


    public boolean delete(int numInstructeur) throws SQLException {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                "DELETE FROM instructeur WHERE numInstructeur = ?");
            stmt.setInt(1, numInstructeur);
            int rowsAffected = stmt.executeUpdate();
            return (rowsAffected > 0); // retourne true si au moins une ligne a été affectée
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du membre : " + e.getMessage());
            return false;
        }
    }

    
}