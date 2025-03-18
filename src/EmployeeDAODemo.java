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
        employeeDAO.addEmployee(new Employee(1, "Pushpalatha Janapala", 70000));
        employeeDAO.addEmployee(new Employee(2, "Hemanth Janapala", 80000));
        employeeDAO.addEmployee(new Employee(3, "Gangabhavani korrapati", 90000));
        employeeDAO.addEmployee(new Employee(5, "Sai", 7));
        employeeDAO.addEmployee(new Employee(6, "Janapala", 8));
        employeeDAO.addEmployee(new Employee(7, "korrapati", 9));

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
