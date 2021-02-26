/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JK.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohamed Ali
 */
public class Util {
    
   static final String DB_URL = "jdbc:mysql://localhost:3306/jk-salessystem";
   static final String USER = "root";
   static final String PASS = "root";
   
   public static List<User> getUsers() {
   List<User> users  = new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = (Statement) conn.createStatement();
      String sql = "SELECT * FROM branch";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
          
         User user = new User();
         user.setUsername(rs.getString("username"));
         user.setUseraddress(rs.getString("useraddress"));
         user.setPhone(rs.getString("phone"));
         user.setEmail(rs.getString("email"));
         user.setPassword(rs.getString("password"));
         
         users.add(user);
      }
      rs.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   return users;
   }
   
   
    public static User getUser(String username) {
       User user  = null;
       Connection conn = null;
       Statement stmt = null;
       try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection(DB_URL, USER, PASS);
          stmt = (Statement) conn.createStatement();
          String sql = "SELECT * FROM users WHERE username='" + username + "'";
          ResultSet rs = stmt.executeQuery(sql);
          while(rs.next()){
             user = new User();
             user.setUsername(rs.getString("username"));
             user.setUseraddress(rs.getString("useraddress"));
             user.setPhone(rs.getString("phone"));
             user.setEmail(rs.getString("email"));
             user.setPassword(rs.getString("password"));
          }
          rs.close();
       }catch(SQLException se){
          se.printStackTrace();
       }catch(Exception e){
          e.printStackTrace();
       }finally{
          try{
             if(stmt!=null)
                conn.close();
          }catch(SQLException se){
          }
          try{
             if(conn!=null)
                conn.close();
          }catch(SQLException se){
             se.printStackTrace();
          }
       }
       return user;
   }
    
    public static boolean addUser(User user) {
       Connection conn = null;
       Statement stmt = null;
       try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection(DB_URL, USER, PASS);
          stmt = (Statement) conn.createStatement();
          String sql = "INSERT INTO users "
                  + "(`username`, `useraddress`, `phone`, `email`,`password`) "
                  + "VALUES ('" + user.getUsername()+ "', '"+ user.getUseraddress()+"', '"+ user.getPhone()+"','"+ user.getEmail()+"', '"+ user.getPassword()+"')";
          stmt.executeUpdate(sql);
          return true;
       }catch(SQLException se){
          se.printStackTrace();
       }catch(Exception e){
          e.printStackTrace();
       }finally{
          try{
             if(stmt!=null)
                conn.close();
          }catch(SQLException se){
          }
          try{
             if(conn!=null)
                conn.close();
          }catch(SQLException se){
             se.printStackTrace();
          }
       }
       return false;
    }
    
    public static boolean updateUser(User user) {
       Connection conn = null;
       Statement stmt = null;
       try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection(DB_URL, USER, PASS);
          stmt = (Statement) conn.createStatement();
          String sql = "UPDATE `users` "
                  + "SET `username` = '" + user.getUsername()+ "', "
                  + "`useraddress` = '" + user.getUseraddress()+ "',"
                  + "`phone` = '" + user.getPhone()+"',"
                  + "`email` = '" + user.getEmail()+"',"
                  + "`password` = '" + user.getPassword()+"',"
                  + " WHERE (`users` = '" + user.getUsername()+"')";
          stmt.executeUpdate(sql);
          return true;
       }catch(SQLException se){
          se.printStackTrace();
       }catch(Exception e){
          e.printStackTrace();
       }finally{
          try{
             if(stmt!=null)
                conn.close();
          }catch(SQLException se){
          }
          try{
             if(conn!=null)
                conn.close();
          }catch(SQLException se){
             se.printStackTrace();
          }
       }
       return false;
    }
    
    public static boolean deleteUser(String username) {
        Connection conn = null;
               Statement stmt = null;
               try{
                  Class.forName("com.mysql.jdbc.Driver");
                  conn = DriverManager.getConnection(DB_URL, USER, PASS);
                  stmt = (Statement) conn.createStatement();
                  String sql = "DELETE FROM `users` WHERE (`username` = '" + username + "')";
                  stmt.executeUpdate(sql);
                  return true;
               }catch(SQLException se){
                  se.printStackTrace();
               }catch(Exception e){
                  e.printStackTrace();
               }finally{
                  try{
                     if(stmt!=null)
                        conn.close();
                  }catch(SQLException se){
                  }
                  try{
                     if(conn!=null)
                        conn.close();
                  }catch(SQLException se){
                     se.printStackTrace();
                  }
               }
               return false;
    }
    
}
