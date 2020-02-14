/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author anup
 */
public class dbConnection {
    
        static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Connection conn;
    PreparedStatement pstmt;
    
 public dbConnection(){
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbexams","root","");
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
  public  ResultSet login(String username, String password) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    ResultSet result = null;
        try {
            pstmt=conn.prepareStatement("SELECT * FROM user where Username=? and Password=?");
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            result=pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
    }
  
  public ResultSet userlogin(String tokenId, String password) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     ResultSet uresult = null;
        try {
            pstmt=conn.prepareStatement("SELECT * FROM examine where tokenId=? and password=? ");
            pstmt.setString(1,tokenId);
            pstmt.setString(2,password);
            uresult=pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return uresult;
    }
  public int addToken(String token, String password) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int result=0;
       String date=null;
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
       LocalDateTime now = LocalDateTime.now();  
       date=dtf.format(now);  
      
        try {
            pstmt=conn.prepareStatement("INSERT INTO `examine`( `tokenId`, `password`, `date`) VALUES(?,?,?) ");
            pstmt.setString(1,token);
            pstmt.setString(2,password);
            pstmt.setString(3,date);
           
           
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
        
            return result;
    }
  public int addQues(String ques, String opt1, String opt2, String opt3, String opt4, String cor, String sub, String admin) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int result=0;
       String date=null;
      
        try {
            pstmt=conn.prepareStatement("INSERT INTO `question`(`question`, `ans1`, `ans2`, `ans3`, `ans4`, `correct`, `subject`, `user`) VALUES(?,?,?,?,?,?,?,?) ");
            pstmt.setString(1,ques);
            pstmt.setString(2,opt1);
            pstmt.setString(3,opt2);
            pstmt.setString(4,opt3);
            pstmt.setString(5,opt4);
            pstmt.setString(6,cor);
            pstmt.setString(7, sub);
            pstmt.setString(8,admin);
           
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }    
            return result;
    }

    
}
