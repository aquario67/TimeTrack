/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetrack;

import timetrack.model.*;

/**
 *
 * @author aquar
 */
public class TimeTrack {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        User myUser = new User();
        myUser.setID(1);
        myUser.setName("Kalle");
        myUser.setEmail("kalle@example.org");
        myUser.setPassword("changeit");
        myUser.setAdmin(false);
        try {
            System.out.println("Hello World!");
            System.out.println(myUser.getInfo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
