<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>CodeGym JSP Demo</title>
        <style>
            body {
                font-family: 'Segoe UI', Arial, sans-serif;
                text-align: center;
                margin-top: 100px;
                background: linear-gradient(135deg, #667eea, #764ba2);
                color: white;
                min-height: 100vh;
                margin: 0;
                padding-top: 100px;
                box-sizing: border-box;
            }
            .card {
                background: rgba(255, 255, 255, 0.15);
                padding: 40px 60px;
                border-radius: 15px;
                display: inline-block;
                backdrop-filter: blur(10px);
                box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            }
            h2 {
                font-size: 36px;
                margin-bottom: 20px;
                color: #fff;
            }
            p {
                font-size: 18px;
                color: #f0f0f0;
            }
            .time {
                color: #ffeb3b;
                font-weight: bold;
                font-size: 22px;
            }
            a.btn {
                display: inline-block;
                background-color: #ffeb3b;
                color: #333;
                padding: 12px 30px;
                text-decoration: none;
                border-radius: 30px;
                font-weight: bold;
                margin-top: 20px;
                transition: all 0.3s;
            }
            a.btn:hover {
                background-color: #fff;
                transform: translateY(-3px);
                box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);
            }
        </style>
    </head>
    <body>
        <div class="card">
            <h2>👋 Chào mừng tới lớp học Java Web!</h2>
            <p>Đây là trang JSP động được biên dịch trực tiếp từ Tomcat Server.</p>

            <%-- Nhúng mã Java động để lấy thời gian hệ thống --%>
            <%
                java.util.Date date = new java.util.Date();
            %>
            <p>
                ⏰ Thời gian hệ thống hiện tại:
                <strong class="time"><%= date %></strong>
            </p>

            <a href="hello" class="btn">🚀 Đi tới HelloServlet</a>
        </div>
    </body>
</html>