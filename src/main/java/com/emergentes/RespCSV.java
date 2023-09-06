
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespCSV", urlPatterns = {"/RespCSV"})
public class RespCSV extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=\"archivo.csv\"");
        
        PrintWriter out = response.getWriter();

        try {
            // Genera el contenido CSV aquí
            out.println("Nombre, Edad, Ciudad");
            out.println("Adhemar Luis Yapu Nina, 23, Bolivia");
            out.println("María, 25, Madrid");
            out.println("Pedro, 35, México");

        } finally {
            out.close();
        }
    }
}
