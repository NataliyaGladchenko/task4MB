import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UnZipServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        InputStream inputStream = new FileInputStream("C:\\Users\\Админ\\Downloads\\zip.zip");
        String path = req.getParameter("path");
        UnZip app = new UnZip();
        app.unZip("C:\\zip.zip",path);

        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
