package saveEmployee;

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class AppendEmployee {
    public static int count = 1;

public AppendEmployee(Employee employee) {
    
    
    try {
        File xmlFile = new File("C:\\Users\\darri\\Desktop\\cocksuckers.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlFile);
        Element documentElement = document.getDocumentElement();
        
                Element staff = document.createElement("Staff");
		documentElement.appendChild(staff);
                
		Attr attr = document.createAttribute("id");
                
                Employee.count++;
		attr.setValue(Integer.toString(Employee.count));
		staff.setAttributeNode(attr); 
        
        Element department = document.createElement("department");
        department.setTextContent(employee.department);
        
        Element firstName = document.createElement("firstname");
        firstName.setTextContent(employee.firstName);
        
        Element lastName = document.createElement("lastname");
        lastName.setTextContent(employee.lastName);
        
        Element position = document.createElement("position");
        position.setTextContent(employee.position);
        
        Element salary = document.createElement("salary");
        salary.setTextContent(employee.salary);
        
        //Element nodeElement = document.createElement("Employee");
        staff.appendChild(department);
        staff.appendChild(firstName);
        staff.appendChild(lastName);
        staff.appendChild(position);
        staff.appendChild(salary);
        
        //Element nodeElement = document.createElement("Employee");
        //nodeElement.appendChild(department);
        //nodeElement.appendChild(firstName);
        //nodeElement.appendChild(lastName);
        //nodeElement.appendChild(position);
        //nodeElement.appendChild(salary);
        
      
        //
        documentElement.appendChild(staff);
        //
        document.replaceChild(documentElement, documentElement);
        Transformer tFormer =
        TransformerFactory.newInstance().newTransformer();
        tFormer.setOutputProperty(OutputKeys.METHOD, "xml");
        Source source = new DOMSource(document);
        Result result = new StreamResult(xmlFile);
        tFormer.transform(source, result);

    } catch (Exception ex) {
        System.out.println(ex);
    }
}

}