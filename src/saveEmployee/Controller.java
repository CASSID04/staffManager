package saveEmployee;

import java.io.File;
import loadEmployee.Filter;
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
    
    public void action(String actionType) throws Exception {
        if(actionType=="save") {
        Employee employee1 = new Employee("Patient","Brandon","Doubrava","Manager","85000");
        Employee employee2 = new Employee("Patient","Nicholas","Fulgone","Supervisor","40000");
        Employee employee3 = new Employee("Retail","Taryn","Temmallo","Supervisor","42000");
        Employee employee4 = new Employee("Retail","Danielle","Skinner","Manager","55000");
        Employee employee5 = new Employee("Patient","Sarla","Patel","Cashier","38000");
        Employee employee6 = new Employee("Sani","Louis","Tara","Dishwasher","32000");
        
        Controller control = new Controller();
        control.saveEmployee(employee1);
        control.saveEmployee(employee2);
        control.saveEmployee(employee3);
        control.saveEmployee(employee4);
        control.saveEmployee(employee5);
        control.saveEmployee(employee6);
        
        } else if(actionType=="load") {
            LoadEmployee load = new LoadEmployee();
        }
    }
    
    public void printCurrentList() {
        for(int i=0;i<LoadEmployee.loadedEmployees.size();i++) {
            System.out.println(LoadEmployee.loadedEmployees.get(i).department);
            System.out.println(LoadEmployee.loadedEmployees.get(i).firstName);
            System.out.println(LoadEmployee.loadedEmployees.get(i).lastName);
            System.out.println(LoadEmployee.loadedEmployees.get(i).position);
            System.out.println(LoadEmployee.loadedEmployees.get(i).salary);
            System.out.println("----------");
        }
    }
    
    public void printDepartmentCensus() {
        
    }
    
    public static void main(String[] args) throws Exception {
        Controller control = new Controller();
        control.action("load");
        

        //2
        Filter filter = new Filter();
        filter.getDepartmentSizes(LoadEmployee.loadedEmployees);
        int[] test = filter.getDepartmentSizes(LoadEmployee.loadedEmployees);
            System.out.println("Patient -  "+test[0]);
            System.out.println("Retail  -  "+test[1]);
            System.out.println("Sani    -  "+test[2]);
        //2
        
    }
}