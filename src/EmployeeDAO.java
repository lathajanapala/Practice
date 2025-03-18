//
//import java.util.List;
//public interface EmployeeDAO {
//    void addEmployee(Employee emp);
//    Employee getEmployeeByID(int id);
//    List<Employee> getEmployees();
//    void updateEmployee(Employee emp);
//    void deleteEmployee(int id);
//}
import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee emp);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee emp);
    void deleteEmployee(int id);
}
