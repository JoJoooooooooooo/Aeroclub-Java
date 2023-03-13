package Application.Repository;

import Application.Entity.CompteAc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompteAcRepository {

    private Connection connection;

    public CompteAcRepository(Connection connection) {
        this.connection = connection;
    }

    // Créer un nouveau CompteAc
    public boolean create(CompteAc compteAc) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO CompteAc (numCompte, numMembre, numSeq, description, date, debit, credit) VALUES (?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setInt(1, compteAc.getNumCompte());
        preparedStatement.setInt(2, compteAc.getNumMembre());
        preparedStatement.setInt(3, compteAc.getNumSeq());
        preparedStatement.setString(4, compteAc.getDescription());
        preparedStatement.setDate(5, compteAc.getDate());
        preparedStatement.setDouble(6, compteAc.getDebit());
        preparedStatement.setDouble(7, compteAc.getCredit());
        int rowsUpdated = preparedStatement.executeUpdate();
        return rowsUpdated > 0;
    }

    // Récupérer un CompteAc par son numéro de compte
    public CompteAc read(int numCompte) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT * FROM CompteAc WHERE numCompte = ?");
        preparedStatement.setInt(1, numCompte);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int numMembre = resultSet.getInt("numMembre");
            int numSeq = resultSet.getInt("numSeq");
            String description = resultSet.getString("description");
            Date date = resultSet.getDate("date");
            double debit = resultSet.getDouble("debit");
            double credit = resultSet.getDouble("credit");
            return new CompteAc(numCompte, numMembre, numSeq, description, date, debit, credit);
        } else {
            return null;
        }
    }

    // Récupérer tous les CompteAc
    public List<CompteAc> list() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT * FROM CompteAc");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<CompteAc> compteAcs = new ArrayList<>();
        while (resultSet.next()) {
            int numCompte = resultSet.getInt("numCompte");
            int numMembre = resultSet.getInt("numMembre");
            int numSeq = resultSet.getInt("numSeq");
            String description = resultSet.getString("description");
            Date date = resultSet.getDate("date");
            double debit = resultSet.getDouble("debit");
            double credit = resultSet.getDouble("credit");
            compteAcs.add(new CompteAc(numCompte, numMembre, numSeq, description, date, debit, credit));
        }
        return compteAcs;
    }

    // Mettre à jour un CompteAc
    public boolean update(CompteAc compteAc) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE CompteAc SET numMembre = ?, numSeq = ?, description = ?, date = ?, debit = ?, credit = ? WHERE numCompte = ?");
        preparedStatement.setInt(1, compteAc.getNumMembre());
        preparedStatement.setInt(2, compteAc.getNumSeq());
        preparedStatement.setString(3, compteAc.getDescription());
        preparedStatement.setDate(4, compteAc.getDate());
        preparedStatement.setDouble(5, compteAc.getDebit());
        preparedStatement.setDouble(6, compteAc.getCredit());
        preparedStatement.setInt(7, compteAc.getNumCompte());
        int rowsUpdated = preparedStatement.executeUpdate();
        return rowsUpdated > 0;
    }

    public boolean delete(int numCompte) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                "DELETE FROM CompteAc WHERE numCompte = ?");
            stmt.setInt(1, numCompte);
            int rowsAffected = stmt.executeUpdate();
            return (rowsAffected > 0); // retourne true si au moins une ligne a été affectée
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du membre : " + e.getMessage());
            return false;
        }
    }

}