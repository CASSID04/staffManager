package saveEmployee;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element; 

public class WriteEmployee {
    public static int count = 0;
    
    public void save(Employee employee) {
	  try {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("Department");
		doc.appendChild(rootElement);

            	Element staff = doc.createElement("Staff");
		rootElement.appendChild(staff);

		// set attribute to staff element
		Attr attr = doc.createAttribute("id");
                

                
                //Employee.count++;
		attr.setValue(Integer.toString(Employee.count));
		staff.setAttributeNode(attr);
                
                Element department = doc.createElement("department");
                department.appendChild(doc.createTextNode(employee.department));
                staff.appendChild(department);

		Element firstname = doc.createElement("firstname");
		firstname.appendChild(doc.createTextNode(employee.firstName));
		staff.appendChild(firstname);

		// lastname elements
		Element lastname = doc.createElement("lastname");
		lastname.appendChild(doc.createTextNode(employee.lastName));
		staff.appendChild(lastname);

		// nickname elements
		Element nickname = doc.createElement("position");
		nickname.appendChild(doc.createTextNode(employee.position));
		staff.appendChild(nickname);

		// salary elements
		Element salary = doc.createElement("salary");
		salary.appendChild(doc.createTextNode(employee.salary));
		staff.appendChild(salary);

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
                
		StreamResult result = new StreamResult("C:\\Users\\darri\\Desktop\\cocksuckers.xml");
		transformer.transform(source, result);

	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
	
    }
}

