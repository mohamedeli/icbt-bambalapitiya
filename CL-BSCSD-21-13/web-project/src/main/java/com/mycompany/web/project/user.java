/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web.project;

/**
 *
 * @author Mohamed Ali
 */
public class user {
    private String username;
    
    private String firstname;
    
    private String lastname;
    
    private String password;
    
    public user(){
    this.username = "";
    this.firstname = "";
    this.lastname = "";
    this.password = "";
    }
    public user(String username, String firstname, String lastname, String password){
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
}
