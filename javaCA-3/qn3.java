import java.sql.*;
import java.util.Scanner;

public class qn3{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String password = "Passwo#1";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int rollno = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM Student WHERE rollno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rollno);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("rollno"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Marks: " + rs.getInt("marks"));
            } else {
                System.out.println("Student not found.");
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}