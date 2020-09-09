/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetrack;

import timetrack.model.*;

/**
 *
 * @author Mikael Johansson
 */
public class TimeTrack {

    public static void main(String[] args) {
        // TODO code application logic here
        User myUser;
        myUser = new User();
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
