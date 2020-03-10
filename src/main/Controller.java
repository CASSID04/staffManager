package main;

import java.io.File;
import testing.AppendEmployee;

public class Controller {
    File file = new File("C:\\Users\\darri\\Desktop\\cocksuckers.xml");
    
    public Controller(Employee employee) {
        if(file.exists()==true) {
            AppendEmployee appender = new AppendEmployee(employee);
        } else {
            WriteEmployee write = new WriteEmployee();
            write.save(employee);
        }    
    }
    
    public static void main(String[] args) {
        Employee employee = new Employee("Julia","Cassidy","Supervisor","125000");
        Controller control = new Controller(employee);
        

        
        
        //Appender appender = new Appender();
        
    }
}