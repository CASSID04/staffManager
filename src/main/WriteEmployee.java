package main;

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
    //File file = new File("C:\\Users\\darri\\Desktop\\cocksuckers.xml");
    
    public void save() {
	  try {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("Department");
		doc.appendChild(rootElement);

            	Element staff = doc.createElement("Employee");
		rootElement.appendChild(staff);
            
		//Attr attr = doc.createAttribute("id");
                //count++;
		//attr.setValue(Integer.toString(count));
		//staff.setAttributeNode(attr);

		Element firstname = doc.createElement("firstname");
		firstname.appendChild(doc.createTextNode("Darrin"));
		staff.appendChild(firstname);

		Element lastname = doc.createElement("lastname");
		lastname.appendChild(doc.createTextNode("Cassidy"));
		staff.appendChild(lastname);

		Element nickname = doc.createElement("title");
		nickname.appendChild(doc.createTextNode("Supervisor"));
		staff.appendChild(nickname);

		Element salary = doc.createElement("salary");
		salary.appendChild(doc.createTextNode("125000"));
		staff.appendChild(salary);
        //}

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

