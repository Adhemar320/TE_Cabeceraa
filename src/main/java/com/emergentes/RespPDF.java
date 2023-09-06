
package com.emergentes;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=archivo.pdf");

        try (OutputStream out = response.getOutputStream()) {
            String pdfContent = "%PDF-1.5\n" +
                                "1 0 obj\n" +
                                "<< /Type /Catalog\n" +
                                "/Pages 2 0 R >>\n" +
                                "endobj\n" +
                                "2 0 obj\n" +
                                "<< /Type /Pages\n" +
                                "/Kids [3 0 R]\n" +
                                "/Count 1 >>\n" +
                                "endobj\n" +
                                "3 0 obj\n" +
                                "<< /Type /Page\n" +
                                "/Parent 2 0 R\n" +
                                "/Resources << /Font << /F1 4 0 R >> >>\n" +
                                "/Contents 5 0 R >>\n" +
                                "endobj\n" +
                                "4 0 obj\n" +
                                "<< /Type /Font\n" +
                                "/Subtype /Type1\n" +
                                "/BaseFont /Helvetica >>\n" +
                                "endobj\n" +
                                "5 0 obj\n" +
                                "<< /Length 44 >>\n" +
                                "stream\n" +
                                "BT\n" +
                                "72 712 TD\n" +
                                "/F1 12 Tf\n" +
                                "(Adhemar Luis Yapau Nina) Tj\n" +
                                "ET\n" +
                                "endstream\n" +
                                "endobj\n" +
                                "xref\n" +
                                "0 6\n" +
                                "0000000000 65535 f \n" +
                                "0000000009 00000 n \n" +
                                "0000000074 00000 n \n" +
                                "0000000173 00000 n \n" +
                                "0000000301 00000 n \n" +
                                "0000000390 00000 n \n" +
                                "trailer\n" +
                                "<< /Size 6\n" +
                                "/Root 1 0 R\n" +
                                ">>\n" +
                                "startxref\n" +
                                "477\n" +
                                "%%EOF\n";

            out.write(pdfContent.getBytes("UTF-8"));
        }
    }
}
