package servlet;

import dao.LibroDAO;
import model.Libro;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/libros")
public class LibroServlet extends HttpServlet {
    private LibroDAO libroDAO = new LibroDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        try {
            List<Libro> libros = libroDAO.getAllLibros();
            request.setAttribute("libros", libros);
            request.getRequestDispatcher("/WEB-INF/views/libros.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Error al recuperar los libros", e);
        }
    }
}