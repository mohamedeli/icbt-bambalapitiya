/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

/**
 *
 * @author Mohamed Ali
 */
public class Cat implements Animal{
    @Override
    public void move(){
        System.out.println("Cat is moving");
    }
    @Override
    public void consume(){
        System.out.println("Cat is comsuming");
    }
    
}
