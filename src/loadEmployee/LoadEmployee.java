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
NodeList nList = document.getElementsByTagName("Employee");

System.out.println(nList.getLength());

for (int temp = 0; temp < nList.getLength(); temp++) {
 Node node = nList.item(temp);
 System.out.println("");    //Just a separator
 if (node.getNodeType() == Node.ELEMENT_NODE) {
    //Print each employee's detail
    Element eElement = (Element) node;
    
    System.out.println("Department :  "  + eElement.getElementsByTagName("firstname").item(0).getTextContent());
    //System.out.println("First Name  :  "  + eElement.getElementsByTagName("firstname").item(0).getTextContent());
    //System.out.println("Last Name   :  "   + eElement.getElementsByTagName("lastname").item(0).getTextContent());
    //System.out.println("Nick Name   :  "    + eElement.getElementsByTagName("nickname").item(0).getTextContent());
    //System.out.println("Salary Name :  "    + eElement.getElementsByTagName("salary").item(0).getTextContent());
    
    //String setDepartment = eElement.getAttribute("firstname");
    //System.out.println(setDepartment);
    //String setFirstName = eElement.getAttribute("firstname");
    //String setLastName = eElement.getAttribute("lastname");
    //String setNickName = eElement.getAttribute("nickname");
    //String setSalary = eElement.getAttribute("salary");
    
    //loadedEmployees.add(new Employee(setFirstName,setLastName,setNickName,setSalary));
 }    
    }
}
    public static void HOLD(String[] args) throws Exception {
        LoadEmployee readData = new LoadEmployee();
    }

}