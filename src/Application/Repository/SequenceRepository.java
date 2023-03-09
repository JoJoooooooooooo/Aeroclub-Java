package Application.Repository;

import java.sql.*;
import java.util.ArrayList;

import Application.Entity.Sequence;

public class SequenceRepository {

    private Connection connection;

    public SequenceRepository(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Sequence sequence) throws SQLException {
        String sql = "INSERT INTO sequence(numMembres, numInstructeur, numAvions, date, temps, prixSpecial, taux, reductionSemaine, numMotif, tauxInstructeur, forfaitInitiation) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, sequence.getNumMembres());
            statement.setInt(2, sequence.getNumInstructeur());
            statement.setInt(3, sequence.getNumAvions());
            statement.setDate(4, sequence.getDate());
            statement.setInt(5, sequence.getTemps());
            statement.setDouble(6, sequence.getPrixSpecial());
            statement.setDouble(7, sequence.getTaux());
            statement.setDouble(8, sequence.getReductionSemaine());
            statement.setInt(9, sequence.getNumMotif());
            statement.setDouble(10, sequence.getTauxInstructeur());
            statement.setShort(11, sequence.getForfaitInitiation());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public Sequence read(int numSequence) throws SQLException {
        String sql = "SELECT * FROM sequence WHERE numSequence = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, numSequence);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Sequence sequence = new Sequence(
                            resultSet.getInt("numMembres"),
                            resultSet.getInt("numInstructeur"),
                            resultSet.getInt("numAvions"),
                            resultSet.getDate("date"),
                            resultSet.getInt("temps"),
                            resultSet.getDouble("prixSpecial"),
                            resultSet.getDouble("taux"),
                            resultSet.getDouble("reductionSemaine"),
                            resultSet.getInt("numMotif"),
                            resultSet.getDouble("tauxInstructeur"),
                            resultSet.getShort("forfaitInitiation")
                    );
                    sequence.setNumSequence(numSequence);
                    return sequence;
                } else {
                    return null;
                }
            }
        }
    }

    public ArrayList<Sequence> readAll() throws SQLException {
        String sql = "SELECT * FROM sequence";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            ArrayList<Sequence> sequences = new ArrayList<>();
            while (resultSet.next()) {
                Sequence sequence = new Sequence(
                        resultSet.getInt("numMembres"),
                        resultSet.getInt("numInstructeur"),
                        resultSet.getInt("numAvions"),
                        resultSet.getDate("date"),
                        resultSet.getInt("temps"),
                        resultSet.getDouble("prixSpecial"),
                        resultSet.getDouble("taux"),
                        resultSet.getDouble("reductionSemaine"),
                        resultSet.getInt("numMotif"),
                        resultSet.getDouble("tauxInstructeur"),
                        resultSet.getShort("forfaitInitiation")
                );
                sequence.setNumSequence(resultSet.getInt("numSequence"));
                sequences.add(sequence);
            }
            return sequences;
        }
    }

    public boolean update(Sequence sequence) throws SQLException {
        String query = "UPDATE sequence SET numMembres = ?, numInstructeur = ?, numAvions = ?, date = ?, temps = ?, prixSpecial = ?, taux = ?, reductionSemaine = ?, numMotif = ?, tauxInstructeur = ?, forfaitInitiation = ? WHERE numSequence = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, sequence.getNumMembres());
            stmt.setInt(2, sequence.getNumInstructeur());
            stmt.setInt(3, sequence.getNumAvions());
            stmt.setDate(4, sequence.getDate());
            stmt.setInt(5, sequence.getTemps());
            stmt.setDouble(6, sequence.getPrixSpecial());
            stmt.setDouble(7, sequence.getTaux());
            stmt.setDouble(8, sequence.getReductionSemaine());
            stmt.setInt(9, sequence.getNumMotif());
            stmt.setDouble(10, sequence.getTauxInstructeur());
            stmt.setShort(11, sequence.getForfaitInitiation());
            stmt.setInt(12, sequence.getNumSequence());
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean delete(int numSequence) throws SQLException {
        String query = "DELETE FROM sequence WHERE numSequence = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, numSequence);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }

}