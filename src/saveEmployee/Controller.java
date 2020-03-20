package saveEmployee;

import java.io.File;
import loadEmployee.LoadEmployee;

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
    
    public static void main(String[] args) throws Exception {
        //Employee employee = new Employee("Patient","Daniel","Cassidy","Supervisor","125000");
        //Controller control = new Controller();
        //control.saveEmployee(employee);
        //control.saveEmployee(employee);
        //control.saveEmployee(employee);
        
        LoadEmployee load = new LoadEmployee();
        ///////////////////////////////////////
    }
}