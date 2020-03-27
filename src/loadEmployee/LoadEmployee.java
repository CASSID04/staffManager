package loadEmployee;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.util.ArrayList;
import saveEmployee.Employee;

public class LoadEmployee {
    public static ArrayList<Employee> loadedEmployees = new ArrayList<Employee>();
    
    public LoadEmployee() throws Exception {
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
Document document = builder.parse("C:\\Users\\darri\\Desktop\\cocksuckers.xml");
document.getDocumentElement().normalize();
Element root = document.getDocumentElement();
//System.out.println(root.getNodeName());
NodeList nList = document.getElementsByTagName("Staff");
for (int temp = 0; temp < nList.getLength(); temp++) {
 Node node = nList.item(temp);
 //System.out.println("");    //Just a separator
 if (node.getNodeType() == Node.ELEMENT_NODE) {
    //Print each employee's detail
    Element eElement = (Element) node;
    

    //System.out.println("Employee ID :  "    + eElement.getAttribute("id"));
    //System.out.println("Salary Name :  "    + eElement.getElementsByTagName("department").item(0).getTextContent());
    //System.out.println("First Name  :  "  + eElement.getElementsByTagName("firstname").item(0).getTextContent());
    //System.out.println("Last Name   :  "  + eElement.getElementsByTagName("lastname").item(0).getTextContent());
    //System.out.println("Position    :  "   + eElement.getElementsByTagName("position").item(0).getTextContent());
    //System.out.println("Nick Name   :  "    + eElement.getElementsByTagName("salary").item(0).getTextContent());
    //System.out.println("----------");
    
     
    
    
    
    //System.out.println("Salary Name :  "    + eElement.getElementsByTagName("department").item(0).getTextContent());
    //System.out.println("First Name  :  "  + eElement.getElementsByTagName("firstname").item(0).getTextContent());
    //System.out.println("Last Name   :  "  + eElement.getElementsByTagName("lastname").item(0).getTextContent());
    //System.out.println("Position    :  "   + eElement.getElementsByTagName("position").item(0).getTextContent());
    //System.out.println("Nick Name   :  "    + eElement.getElementsByTagName("salary").item(0).getTextContent());
    //System.out.println("----------");
    
    int getID = Integer.parseInt(eElement.getAttribute("id"));
    String getDepartment = eElement.getElementsByTagName("department").item(0).getTextContent().toString();
    String getFirstName = eElement.getElementsByTagName("firstname").item(0).getTextContent().toString();
    String getLastName = eElement.getElementsByTagName("lastname").item(0).getTextContent().toString();
    String getPosition = eElement.getElementsByTagName("position").item(0).getTextContent().toString();
    String getSalary = eElement.getElementsByTagName("salary").item(0).getTextContent().toString();
    
    Employee employee = new Employee(getDepartment,getFirstName,getLastName,getPosition,getSalary);
    loadedEmployees.add(employee);
 }  
    }
}
    public static void HOLD(String[] args) throws Exception {
        LoadEmployee readData = new LoadEmployee();
    }

}