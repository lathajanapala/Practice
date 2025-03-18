//import java.util.ArrayList;
//import  java.util.List;
//
//public class EmployeeDAOImpl implements EmployeeDAO{
//    private List<Employee> employees = new ArrayList<>();
//
//    @Override
//    public void addEmployee(Employee emp){
//        employees.add(emp);
//        System.out.println("Employee added:" + emp);
//    }
//
//    @Override
//    public Employee getEmployeeByID(int id) {
//        return null;
//    }
//
//    @Override
//    public List<Employee> getEmployees() {
//        return List.of();
//    }
//
//    @Override
//    public void updateEmployee(Employee emp) {
//
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//
//    }
//
//}
//
//
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added: " + emp);
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public void updateEmployee(Employee emp) {
        for (Employee e : employees) {
            if (e.getId() == emp.getId()) {
                e.setName(emp.getName());
                e.setSalary(emp.getSalary());
                System.out.println("Employee updated: " + e);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    @Override
    public void deleteEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee with ID " + id + " deleted.");
    }
}
