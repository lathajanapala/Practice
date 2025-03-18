//public class EmployeeDAODemo {
//    public static void main(String[] args) {
//        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//
//        // Adding employees
//        employeeDAO.addEmployee(new Employee(1, "John ","Doe", 5000));
//        employeeDAO.addEmployee(new Employee(2, "Jane", "Smith", 60000));
//
//    }
//}
public class EmployeeDAODemo {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        // Adding employees
        employeeDAO.addEmployee(new Employee(1, "Pushpalatha Janapala", 50000));
        employeeDAO.addEmployee(new Employee(2, "Hemanth Janapala", 60000));

        // Fetching all employees
        System.out.println("All Employees: " + employeeDAO.getAllEmployees());

        // Fetching employee by ID
        Employee emp = employeeDAO.getEmployeeById(1);
        System.out.println("Employee with ID 1: " + emp);

        // Updating an employee
        employeeDAO.updateEmployee(new Employee(1, "John Doe", 55000));

        // Deleting an employee
        employeeDAO.deleteEmployee(2);

        // Fetching all employees after deletion
        System.out.println("All Employees after deletion: " + employeeDAO.getAllEmployees());
    }
}
