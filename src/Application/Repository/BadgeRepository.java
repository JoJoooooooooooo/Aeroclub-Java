package Application.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Application.Entity.Badge;


public class BadgeRepository {
    private Connection connection;

    public BadgeRepository(Connection connection) {
        this.connection = connection;
    }
    
    public boolean create(Badge badge) throws SQLException {
        String sql = "INSERT INTO badges (num_badge, badge) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, badge.getNumBadge());
            statement.setString(2, badge.getBadge());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }
    
    public Badge read(int numBadge) throws SQLException {
        String sql = "SELECT * FROM badges WHERE num_badge = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, numBadge);
            try (ResultSet result = statement.executeQuery()) {
                if (result.next()) {
                    String badge = result.getString("badge");
                    return new Badge(numBadge, badge);
                }
            }
        }
        return null;
    }
    
    public boolean update(Badge badge) throws SQLException {
        String sql = "UPDATE badges SET badge = ? WHERE num_badge = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, badge.getBadge());
            statement.setInt(2, badge.getNumBadge());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }
    
    public boolean delete(int numBadge) throws SQLException {
        String sql = "DELETE FROM badges WHERE num_badge = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, numBadge);
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }
    
    public List<Badge> list() throws SQLException {
        List<Badge> badges = new ArrayList<>();
        String sql = "SELECT * FROM badges";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {
            while (result.next()) {
                int numBadge = result.getInt("num_badge");
                String badge = result.getString("badge");
                badges.add(new Badge(numBadge, badge));
            }
        }
        return badges;
    }
}
