package loadEmployee;

import java.util.ArrayList;
import saveEmployee.Employee;

public class Filter {
    
    public ArrayList<Employee> getDepartmentEmployees(String selectDepartment) {
        ArrayList<Employee> patient = new ArrayList<Employee>();
        ArrayList<Employee> retail = new ArrayList<Employee>();
        ArrayList<Employee> sani = new ArrayList<Employee>();

        for(int i=0;i<LoadEmployee.loadedEmployees.size();i++) {
            switch(LoadEmployee.loadedEmployees.get(i).department) {
                case "Patient":
                    patient.add(LoadEmployee.loadedEmployees.get(i));
                    break;
                case "Retail":
                    retail.add(LoadEmployee.loadedEmployees.get(i));
                    break;
                case "Sani":
                    sani.add(LoadEmployee.loadedEmployees.get(i));
                    break;
            }
        }
        
        if(selectDepartment=="Patient") {
            return patient;
        } else if(selectDepartment=="Retail") {
            return retail;
        } else if(selectDepartment=="Sani") {
            return sani;
        } else {
            return null;
        }

    }
    
    public int[] getDepartmentSizes(ArrayList<Employee>setList) {
        int patient = 0;
        int retail = 0;
        int sani = 0;
        
        for(int i=0;i<LoadEmployee.loadedEmployees.size();i++) {
            if(LoadEmployee.loadedEmployees.get(i).department=="Patient") {
                patient++;
            } else if(LoadEmployee.loadedEmployees.get(i).department=="Retail") {
                retail++;
            } else if(LoadEmployee.loadedEmployees.get(i).department=="Sani") {
                sani++;
            }
            
            switch(LoadEmployee.loadedEmployees.get(i).department) {
                case "Patient":
                    patient++;
                    break;
                case "Retail":
                    retail++;
                    break;
                case "Sani":
                    sani++;
                    break;
            }
            //System.out.println(LoadEmployee.loadedEmployees.get(i).department);
            //System.out.println(LoadEmployee.loadedEmployees.get(i).firstName);
            //System.out.println(LoadEmployee.loadedEmployees.get(i).lastName);
            //System.out.println(LoadEmployee.loadedEmployees.get(i).position);
            //System.out.println(LoadEmployee.loadedEmployees.get(i).salary);
            //System.out.println("----------");
        }
        int[] departmentSizes = {patient,retail,sani};
        return departmentSizes;
    }
}