package saveEmployee;

public class Employee {
    public String department;
    public String firstName;
    public String lastName;
    public String position;
    public String salary;
    
    public Employee(String setDepartment,String setFirstName,String setLastName,String setPosition,String setSalary) {
        department = setDepartment;
        firstName = setFirstName;
        lastName = setLastName;
        position = setPosition;
        salary = setSalary;
    }
        
}