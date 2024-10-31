package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {

    private static final String USERNAME = "sa";
    private static final String PASSWORD = "12345";
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLSuKien;"
            + "encrypt=true;" // Bật mã hóa SSL
            + "trustServerCertificate=true"; ;
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Lỗi: Không tìm thấy driver SQL Server!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi: Kết nối CSDL thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Lỗi: Đóng kết nối CSDL thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
}
