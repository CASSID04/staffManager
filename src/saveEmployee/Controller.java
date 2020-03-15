package saveEmployee;

import java.io.File;

public class Controller  extends javax.swing.JFrame {
    File file = new File("C:\\Users\\darri\\Desktop\\cocksuckers.xml");
    
    public void saveEmployee(Employee employee) {
        if(file.exists()==true) {
            AppendEmployee appender = new AppendEmployee(employee);
        } else {
            WriteEmployee write = new WriteEmployee();
            write.save(employee);
        }    
    }
    
    public static void saveEmployee2(Employee employee) {
        employee = new Employee("Patient","Daniel","Cassidy","Supervisor","125000");
        //Controller control = new Controller(employee);
        

        
        
        //Appender appender = new Appender();
        
    }
}