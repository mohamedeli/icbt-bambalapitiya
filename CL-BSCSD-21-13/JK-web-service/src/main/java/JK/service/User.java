/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JK.service;

/**
 *
 * @author Mohamed Ali
 */
public class User {
    
    private String username;
    
    private String useraddress;
    
    private String phone;
    
    private String email;
    
    private String password;
    
    public User() {
        this.username = "";
        this.useraddress = "";
        this.phone = "";
        this.email = "";
        this.password = "";
    }
    
    public User(String branchid, String branchname, String branchaddress, String branchemail, String branchpassword){
        this.username = branchid;
        this.useraddress = branchname;
        this.phone = branchaddress;
        this.email = branchemail;
        this.password = branchpassword;
        
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    
}    

    
    

