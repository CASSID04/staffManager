package saveEmployee;

public class Employee {
    public String department;
    public String firstName;
    public String lastName;
    public String position;
    public String salary;
    public Employee theTeste;
    
    public static int count = 0;
    
    public Employee(String setDepartment,String setFirstName,String setLastName,String setPosition,String setSalary) {
        department = setDepartment;
        firstName = setFirstName;
        lastName = setLastName;
        position = setPosition;
        salary = setSalary;
    }
        
}