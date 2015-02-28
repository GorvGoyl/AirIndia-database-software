
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:airport.sqlite");
            //Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\1gour_000\\Documents\\NetBeansProjects\\Airport\\airport.sqlite");
            // JOptionPane.showMessageDialog(null,"Connection Established :-)");
            return conn;
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
                       
        }
    }
    
    
    
    
    
    
}
