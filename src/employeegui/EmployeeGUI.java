/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeegui;
import UtilityHandler.UtilityInt;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



/**
 *
 * @author Moataz
 */
public class EmployeeGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic
            
            Registry regisrty = LocateRegistry.getRegistry(1099);
            UtilityInt u = (UtilityInt) regisrty.lookup("UtilityGardening");
            System.out.println("RMI call test: " + u.TestRMI());
            
            //UtilityInt u = new Utility
        } catch (Exception ex) {
            System.out.println("Exception occured");
            
        }
    }
    
}
