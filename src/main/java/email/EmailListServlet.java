package email;

import java.io.IOException;
import java.util.Arrays;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import business.User;
import data.Survey;

public class EmailListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (!"add".equals(action)) {
            request.getRequestDispatcher("/index.html").forward(request, response);
            return;
        }

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String birthDate = request.getParameter("birthDate"); // optional

        String heard = request.getParameter("hearAboutUs");
        String howToHeardAbout;
        if ("searchEngine".equals(heard)) howToHeardAbout = "Search Engine";
        else if ("wordOfMouth".equals(heard)) howToHeardAbout = "Word of mouth";
        else if ("socialMedia".equals(heard)) howToHeardAbout = "Social Media";
        else howToHeardAbout = "Other";

        String[] choices = request.getParameterValues("announcements");
        String announcements = (choices == null || choices.length == 0)
                ? "None" : String.join(", ", choices);

        String contactMethod = request.getParameter("contactMethod");
        User user = new User(firstName, lastName, email, birthDate);
        Survey survey = new Survey(user, howToHeardAbout, contactMethod, announcements);

        request.setAttribute("user", user);
        request.setAttribute("survey", survey);
        request.getRequestDispatcher("/thanks.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/index.html").forward(request, response);
    }
}
