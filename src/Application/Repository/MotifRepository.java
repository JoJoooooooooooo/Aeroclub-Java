package Application.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Application.Entity.Motif;

public class MotifRepository {
    private Connection connection;

    public MotifRepository(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Motif motif) throws SQLException {
        String sql = "INSERT INTO motifs (num_motif, motif) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, motif.getNumMotif());
            statement.setString(2, motif.getMotif());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public Motif read(int numMotif) throws SQLException {
        String sql = "SELECT * FROM motifs WHERE num_motif = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, numMotif);
            try (ResultSet result = statement.executeQuery()) {
                if (result.next()) {
                    String motif = result.getString("motif");
                    return new Motif(numMotif, motif);
                }
            }
        }
        return null;
    }

    public boolean update(Motif motif) throws SQLException {
        String sql = "UPDATE motifs SET motif = ? WHERE num_motif = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, motif.getMotif());
            statement.setInt(2, motif.getNumMotif());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean delete(int numMotif) throws SQLException {
        String sql = "DELETE FROM motifs WHERE num_motif = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, numMotif);
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public List<Motif> list() throws SQLException {
        List<Motif> motifs = new ArrayList<>();
        String sql = "SELECT * FROM motifs";
        try (PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery()) {
            while (result.next()) {
                int numMotif = result.getInt("num_motif");
                String motif = result.getString("motif");
                motifs.add(new Motif(numMotif, motif));
            }
        }
        return motifs;
    }

}
