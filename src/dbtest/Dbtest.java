/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author ND17613
 */
public class Dbtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
                Connection conn = DriverManager.getConnection("jdbc:ucanaccess://res/Vacaciones.mdb;jackcessOpener=dbtest.CryptCodecOpener", "sa", "sacredrealm");
                System.out.println("si");
         } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("no");
                
            }
    }
    
}
