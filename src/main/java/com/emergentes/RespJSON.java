
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespJSON", urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        try {
            out.println("{\"empleados\":[");
            out.println("{\"nombre\":\"Adhemar Luis \",\"apellidos\":\"Yapu Nina\"},");
            
            out.println("]}"); // Agregar el cierre adecuado del objeto JSON
        } finally {
            out.close();
        }
    }
}

