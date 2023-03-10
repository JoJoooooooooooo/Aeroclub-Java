package Application.Repository;

import Application.Entity.Avions;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AvionsRepository {
    private Connection connection;

    public AvionsRepository(Connection connection) {
        this.connection = connection;
    }

    // Create operation
    public boolean create(Avions avions) throws SQLException {
        String query = "INSERT INTO avions (num_avions, types, taux_double, forfait1, forfait2, forfait3, heure_forfait1, heure_forfait2, heure_forfait3, reduction_semaine, immatriculation, image, name, description) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, avions.getNumAvions());
            statement.setString(2, avions.getTypes());
            statement.setDouble(3, avions.getTauxDouble());
            statement.setDouble(4, avions.getForfait1());
            statement.setDouble(5, avions.getForfait2());
            statement.setDouble(6, avions.getForfait3());
            statement.setDouble(7, avions.getHeureForfait1());
            statement.setDouble(8, avions.getHeureForfait2());
            statement.setDouble(9, avions.getHeureForfait3());
            statement.setDouble(10, avions.getReductionSemaine());
            statement.setString(11, avions.getImmatriculation());
            statement.setString(12, avions.getImage());
            statement.setString(13, avions.getName());
            statement.setString(14, avions.getDescription());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    // Read operation
    public Avions read(int numAvions) throws SQLException {
        String query = "SELECT * FROM avions WHERE num_avions = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, numAvions);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Avions(
                        resultSet.getInt("num_avions"),
                        resultSet.getString("types"),
                        resultSet.getDouble("taux_double"),
                        resultSet.getDouble("forfait1"),
                        resultSet.getDouble("forfait2"),
                        resultSet.getDouble("forfait3"),
                        resultSet.getDouble("heure_forfait1"),
                        resultSet.getDouble("heure_forfait2"),
                        resultSet.getDouble("heure_forfait3"),
                        resultSet.getDouble("reduction_semaine"),
                        resultSet.getString("immatriculation"),
                        resultSet.getString("image"),
                        resultSet.getString("name"),
                        resultSet.getString("description")
                );
            }
            return null;
        }
    }

    // Update operation
    public boolean update(Avions avions) throws SQLException {
        String query = "UPDATE avions SET types = ?, taux_double = ?, forfait1 = ?, forfait2 = ?, forfait3 = ?, heure_forfait1 = ?, heure_forfait2 = ?, heure_forfait3 = ?, reduction_semaine = ?, immatriculation = ?, image = ?, name = ?, description = ? WHERE num_avions = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, avions.getTypes());
            statement.setDouble(2, avions.getTauxDouble());
            statement.setDouble(3, avions.getForfait1());
            statement.setDouble(4, avions.getForfait2());
            statement.setDouble(5, avions.getForfait3());
            statement.setDouble(6, avions.getHeureForfait1());
            statement.setDouble(7, avions.getHeureForfait2());
            statement.setDouble(8, avions.getHeureForfait3());
            statement.setDouble(9, avions.getReductionSemaine());
            statement.setString(10, avions.getImmatriculation());
            statement.setString(11, avions.getImage());
            statement.setString(12, avions.getName());
            statement.setString(13, avions.getDescription());
            statement.setInt(14, avions.getNumAvions());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public List<Avions> List() throws SQLException {
        List<Avions> avions = new ArrayList<>();
        String query = "SELECT * FROM avions";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int numAvions = rs.getInt("numAvions");
                String types = rs.getString("types");
                double tauxDouble = rs.getDouble("tauxDouble");
                double forfait1 = rs.getDouble("forfait1");
                double forfait2 = rs.getDouble("forfait2");
                double forfait3 = rs.getDouble("forfait3");
                double heure_forfait1 = rs.getDouble("heure_forfait1");
                double heure_forfait2 = rs.getDouble("heure_forfait2");
                double heure_forfait3 = rs.getDouble("heure_forfait3");
                double reductionSemaine = rs.getDouble("reductionSemaine");
                String immatriculation = rs.getString("immatriculation");
                String image = rs.getString("image");
                String name = rs.getString("name");
                String description = rs.getString("description");
                Avions avion = new Avions(numAvions, types, tauxDouble, forfait1, forfait2, forfait3, heure_forfait1, heure_forfait2, heure_forfait3, reductionSemaine, immatriculation, image, name, description);
                avions.add(avion);
            }
        }
        return avions;
    }

    public boolean delete(Avions avion) throws SQLException {
        String query = "DELETE FROM avions WHERE numAvions = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, avion.getNumAvions());
            int rowsDeleted = stmt.executeUpdate();
            return (rowsDeleted > 0);
        }
    }
    
}
