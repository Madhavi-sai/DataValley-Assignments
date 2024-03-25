import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDatabase {

    private static final String URL = "jdbc:mysql://localhost:3306/departments";
    private static final String USERNAME = "madhu";
    private static final String PASSWORD = "123";

  
    private static final String INSERT_DEPARTMENT_SQL = "INSERT INTO department (id, name) VALUES (?, ?)";

    public void insertDepartment(Department department) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DEPARTMENT_SQL)) {

          
            preparedStatement.setInt(1, department.getId());
            preparedStatement.setString(2, department.getName());

    
            preparedStatement.executeUpdate();

            System.out.println("Department inserted successfully.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        DepartmentDatabase departmentDAO = new DepartmentDatabase();
        Department department = new Department(1, "IT");
        departmentDAO.insertDepartment(department);
    }
}

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
