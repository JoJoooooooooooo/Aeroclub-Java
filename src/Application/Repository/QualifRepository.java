package Application.Repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Application.Entity.Qualif;


public class QualifRepository {
    private Connection connection;

    public QualifRepository(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Qualif qualif) throws SQLException {
        String sql = "INSERT INTO qualifs (num_qualif, qualif) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, qualif.getNumQualif());
            statement.setString(2, qualif.getQualif());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public Qualif read(int numQualif) throws SQLException {
        String sql = "SELECT * FROM qualifs WHERE num_qualif = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, numQualif);
            try (ResultSet result = statement.executeQuery()) {
                if (result.next()) {
                    String qualif = result.getString("qualif");
                    return new Qualif(numQualif, qualif);
                }
            }
        }
        return null;
    }

    public boolean update(Qualif qualif) throws SQLException {
        String sql = "UPDATE qualifs SET qualif = ? WHERE num_qualif = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, qualif.getQualif());
            statement.setInt(2, qualif.getNumQualif());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean delete(int numQualif) throws SQLException {
        String sql = "DELETE FROM qualifs WHERE num_qualif = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, numQualif);
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public List<Qualif> list() throws SQLException {
        List<Qualif> qualifs = new ArrayList<>();
        String sql = "SELECT * FROM qualifs";
        try (PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery()) {
            while (result.next()) {
                int numQualif = result.getInt("num_qualif");
                String qualif = result.getString("qualif");
                qualifs.add(new Qualif(numQualif, qualif));
            }
        }
        return qualifs;
    }
}
