
package cinema_ticket_sales_automation;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import cinema_ticket_sales_automation.view_movie_screen;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class database_code {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/baskaya_cinema?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static final String USER = "root";
    static final String PASS = "root"; 
    
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;
    
    public void add(int id, String name, int time, String code, String hall){
        System.out.println("Ekle Fonksiyonuna Girildi");
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql="INSERT INTO movies VALUES(?,?,?,?,?)";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            psmt.setString(2, name);
            psmt.setInt(3, time);
            psmt.setString(4, code);
            psmt.setString(5, hall);
            psmt.execute();
            System.out.println("Film Veritabanına Eklendi");
        } catch (Exception e) {
            System.out.println("Ekle Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    
    public ArrayList view() {
        try {
            System.out.println("Listele Fonk try Girildi");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM movies";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList movies = new ArrayList();
            
            while (rs.next()) {     
                movies.add(rs.getInt("id"));
                movies.add(rs.getString("movie_name"));
                movies.add(rs.getInt("movie_time"));
                movies.add(rs.getString("movie_code"));
                movies.add(rs.getString("movie_hall"));
            }
            return movies;
            
        } catch (Exception e) {
            System.out.println("Listele Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return null;
    }
    
    public void delete(int movie_id){
        System.out.println("Sil Fonksiyonuna Girildi");
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "DELETE FROM movies WHERE id = ?;";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, movie_id);
            psmt.executeUpdate();
            System.out.println("Film Veritabanından Silindi");
        } catch (Exception e) {
            System.out.println("Sil Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    
    public void update(int id, String movie_name, int movie_time, String movie_code, String movie_hall, int idd){
        System.out.println("Güncelle Fonksiyonuna Girildi");
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "UPDATE movies SET id = ?, movie_name = ?, movie_time = ?, movie_code = ?, movie_hall = ? WHERE id = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            psmt.setString(2, movie_name);
            psmt.setInt(3, movie_time);
            psmt.setString(4, movie_code);
            psmt.setString(5, movie_hall);
            psmt.setInt(6, idd);
            psmt.executeUpdate();
            System.out.println("Güncelle İşlemi Tamamlandı");
        } catch (Exception e) {
            System.out.println("Güncelle Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            
        }
    }
    
    public void add_ticket(int id, String name, String hall, int price, int movie_id, int users_id){
        System.out.println("Bilet Ekle Fonksiyonuna Girildi");
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql="INSERT INTO tickets VALUES(?,?,?,?,?, ?)";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            psmt.setString(2, name);
            psmt.setString(3, hall);
            psmt.setInt(4, price);
            psmt.setInt(5, movie_id);
            psmt.setInt(6, users_id);
            psmt.execute();
            System.out.println("Bilet Veritabanına Eklendi");
        } catch (Exception e) {
            System.out.println("Bilet Ekle Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    
    public ArrayList view_users() {
        try {
            System.out.println("Kullanıcı Listele Fonk try Girildi");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList users = new ArrayList();
            
            while (rs.next()) {     
                users.add(rs.getInt("id"));
                users.add(rs.getString("username"));
                users.add(rs.getString("password"));
            }
            return users;
            
        } catch (Exception e) {
            System.out.println("Kullanıcı Listele Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return null;
    }
    
    public void adminadd(){
        try {
            System.out.println("Admin Ekle Fonk. try Girildi");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql="INSERT INTO admin VALUES(?,?,?)";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, 1);
            psmt.setString(2, "root");
            psmt.setString(3, "root");
            psmt.execute();
            System.out.println("Admin Veritabanına Eklendi");
        } catch (Exception e) {
            System.out.println("Admin Ekle Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    
    public ArrayList view_admin() {
        try {
            System.out.println("Admin Listele Fonk. try Girildi");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM admin";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList admin = new ArrayList();
            
            while (rs.next()) {     
                admin.add(rs.getInt("id"));
                admin.add(rs.getString("username"));
                admin.add(rs.getString("password"));
            }
            return admin;
            
        } catch (Exception e) {
            System.out.println("Admin Listele Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return null;
    }
    
    public void user_add(int id, String username, String password){
        System.out.println("Kullanıcı Ekle Fonksiyonuna Girildi");
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql="INSERT INTO users VALUES(?,?,?)";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            psmt.setString(2, username);
            psmt.setString(3, password);
            psmt.execute();
            System.out.println("Kullanıcı Veritabanına Eklendi");
        } catch (Exception e) {
            System.out.println("Kullanıcı Ekle Catch Girildi");
        }finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}