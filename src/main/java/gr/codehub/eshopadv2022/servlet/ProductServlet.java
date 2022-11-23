package gr.codehub.eshopadv2022.servlet;

import java.io.*;

import gr.codehub.eshopadv2022.model.Product;
import gr.codehub.eshopadv2022.service.Market;
import gr.codehub.eshopadv2022.service.MarketImpl;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private String message;
    private Market market = new MarketImpl();
    private Product product;

    public void init() {
        message = "Requested product";
        product = market.findProduct("snack");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>" + product + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}