package testing;

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class Appender {

public Appender() {
    
    
    try {
        File xmlFile = new File("C:\\Users\\darri\\Desktop\\cocksuckers.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlFile);
        Element documentElement = document.getDocumentElement();
        
        Element firstName = document.createElement("firstName");
        firstName.setTextContent("Darrin");
        
        Element lastName = document.createElement("lastName");
        lastName.setTextContent("Cassidy");
        
        Element position = document.createElement("position");
        position.setTextContent("Supervisor");
        
        Element salary = document.createElement("salary");
        salary.setTextContent("125000");
        
        Element nodeElement = document.createElement("Employee");
        nodeElement.appendChild(firstName);
        nodeElement.appendChild(lastName);
        nodeElement.appendChild(position);
        nodeElement.appendChild(salary);
        
        documentElement.appendChild(nodeElement);
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