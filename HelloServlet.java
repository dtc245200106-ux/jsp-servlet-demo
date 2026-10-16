package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet đầu tiên - Hiển thị thời gian hiện tại của máy chủ
 * LƯU Ý: Tomcat 10+ dùng jakarta.servlet.* thay vì javax.servlet.*
 */
@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Cấu hình phản hồi: HTML + UTF-8 để hiển thị tiếng Việt
        response.setContentType("text/html;charset=UTF-8");

        // Lấy thời gian hiện tại của máy chủ
        java.util.Date now = new java.util.Date();

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='vi'>");
            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Hello Servlet</title>");
            out.println("    <style>");
            out.println("        body { font-family: 'Segoe UI', Arial, sans-serif;");
            out.println("               text-align: center; margin-top: 100px;");
            out.println("               background: linear-gradient(135deg, #667eea, #764ba2);");
            out.println("               color: white; min-height: 100vh; }");
            out.println("        .card { background: rgba(255,255,255,0.15);");
            out.println("                padding: 40px; border-radius: 15px;");
            out.println("                display: inline-block; backdrop-filter: blur(10px); }");
            out.println("        h1 { color: #fff; font-size: 36px; margin-bottom: 20px; }");
            out.println("        .time { color: #ffeb3b; font-size: 24px; font-weight: bold; }");
            out.println("        a { color: #ffeb3b; text-decoration: none; }");
            out.println("        a:hover { text-decoration: underline; }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='card'>");
            out.println("        <h1>🎉 Chào mừng đến với Servlet đầu tiên!</h1>");
            out.println("        <p>Ứng dụng đang chạy trên Tomcat Server 10.1+</p>");
            out.println("        <p>⏰ Thời gian hiện tại của máy chủ:</p>");
            out.println("        <p class='time'>" + now + "</p>");
            out.println("        <br>");
            out.println("        <a href='index.jsp'>← Quay lại trang chủ JSP</a>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}