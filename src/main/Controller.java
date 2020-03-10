package main;

import java.io.File;
import testing.Appender;

public class Controller {
    File file = new File("C:\\Users\\darri\\Desktop\\cocksuckers.xml");
    
    public Controller() {
        if(file.exists()==true) {
            Appender appender = new Appender();
        } else {
            WriteEmployee write = new WriteEmployee();
            write.save();
        }    
    }
    
    public static void main(String[] args) {
        
        Controller control = new Controller();
        

        
        
        //Appender appender = new Appender();
        
    }
}