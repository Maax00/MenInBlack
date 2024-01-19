/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meninblack1;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author clara
 */
public class Database {
        private static InfDB idb;
  
public static InfDB getDatabase(){
    try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
       } catch (InfException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
       }
       return idb;

    }
}

