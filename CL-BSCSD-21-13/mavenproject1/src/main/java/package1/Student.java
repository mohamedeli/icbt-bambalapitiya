/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author Mohamed Ali
 */
public class Student extends Person {
       private String id;
        private String firstname;
    private String lastname;
    
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname (String firstname){
        this.firstname = firstname;
    }
    public String getLastname (){
        return lastname;
    }
    
    public void setLastname (String lastname){
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
