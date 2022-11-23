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

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       response.setContentType("text/html");
        product = market.findProduct("snack");
       // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>" + product + "</p>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productName = request.getParameter("productName");
        response.setContentType("text/html");
        product = market.findProduct(productName);
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + productName + "</h1>");
        out.println("<p>" + product + "</p>");
        out.println("</body></html>");
    }


    public void destroy() {
    }
}