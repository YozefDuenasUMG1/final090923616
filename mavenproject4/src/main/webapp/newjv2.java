package dao;

import model.Libro;
import model.TipoPasta;
import utils.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    
    public List<Libro> getAllLibros() throws SQLException {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT l.id, l.titulo, l.autor, l.isbn, " +
                    "tp.id as tipo_pasta_id, tp.descripcion as tipo_pasta_desc " +
                    "FROM libros l " +
                    "INNER JOIN tipo_pasta tp ON l.tipo_pasta_id = tp.id";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                TipoPasta tipoPasta = new TipoPasta(
                    rs.getInt("tipo_pasta_id"),
                    rs.getString("tipo_pasta_desc")
                );
                
                Libro libro = new Libro(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getString("isbn"),
                    tipoPasta
                );
                
                libros.add(libro);
            }
        }
        
        return libros;
    }
}