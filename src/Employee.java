//public class Employee {
//    private  int id;
//    private String firstname;
//    private String lastname;
//    private double salary;
//    public Employee (int id, String firstname, String lastname,double salary){
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.salary = salary;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public int getId(){
//        return id;
//    }
//    public String getFirstname(){
//        return firstname;
//    }
//    public String getLastname(){
//        return lastname;
//
//    }
//    @Override
//    public String toString(){
//        return "Employee[ID=" + id + ", First Name=" + firstname + ", Last Name=" + lastname + ", Salary=" + salary + "]";
//    }
//
//}
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

