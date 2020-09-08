/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetrack.model;

/**
 *
 * @author aquar
 */
public class User {
    private int ID;
    private String name;
    private String email;
    private String password;
    private boolean admin;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public String getInfo(){        
//String demo = new String("ID: " + this.getID() + " Name: " + this.getName() + " E-mail: " + this.getEmail() + " Password: " + this.getPassword());        
//String demo = new String("ID: " + this.getID() + " Name: " + this.getName() + " E-mail: " + this.getEmail() + " Password: " + this.getPassword());
        //return demo.substring(0, (demo.length() -1));
        String demo = new String();
        demo += " Name:demo " + this.getName();
        demo += " E-mail: " + this.getEmail();
        return demo;
        //"ID: " + this.getID() + " Name: " + this.getName() + " E-mail: " + this.getEmail() + " Password: " + this.getPassword();
    }
}
